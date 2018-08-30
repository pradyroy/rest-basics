package in.pune.pradyroy.ctrlr;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import in.pune.pradyroy.Const;
import in.pune.pradyroy.model.BaseModel;
import in.pune.pradyroy.model.RespListOfModels;
import in.pune.pradyroy.model.RespModel;
import in.pune.pradyroy.model.RespModelDeleted;
import in.pune.pradyroy.srvc.BaseAbstractSrvc;

/**
 * Abstract class for CRUD on entities to be extended by entity specific
 * controllers
 * 
 * @author Pradyumna Roy
 *
 * @param <M>
 * @param <ID>
 */
public abstract class BaseAbstractCtrlr<M extends BaseModel, ID> {

	protected BaseAbstractSrvc<M, ID> srvc;

	public BaseAbstractCtrlr() {

	}

	/**
	 * @param srvc
	 *            Spring component/service
	 * 
	 */
	public BaseAbstractCtrlr(BaseAbstractSrvc<M, ID> srvc) {
		super();
		this.srvc = srvc;
	}

	public abstract ResponseEntity<M> create(M inputModel);

	public abstract ResponseEntity<M> read(ID id);

	public abstract ResponseEntity<Iterable<M>> readAll();

	public abstract ResponseEntity<M> update(ID id, M modelToBeMerged);

	public abstract ResponseEntity<RespModelDeleted> delete(ID id);

	/**
	 * 
	 * @param inputModel
	 * @return
	 */
	protected ResponseEntity<M> createModel(M inputModel) {
		ResponseEntity<M> responseEntity;
		HttpHeaders headers = new HttpHeaders();

		RespModel<M> respModel = new RespModel<M>();
		respModel = srvc.create(inputModel);

		headers.add(Const.HTTP_HEADER_RESP_MSG_KEY, respModel.getRespmsgkey());
		headers.add(Const.HTTP_HEADER_RESP_MSG_VAL, respModel.getRespmsgval());
		responseEntity = new ResponseEntity<M>(respModel.getModel(), headers, respModel.getHttpstatus());

		return responseEntity;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	protected ResponseEntity<M> readModel(ID id) {
		ResponseEntity<M> responseEntity;
		HttpHeaders headers = new HttpHeaders();
		RespModel<M> respModel = new RespModel<M>();
		respModel = srvc.read(id);
		headers.add(Const.HTTP_HEADER_RESP_MSG_KEY, respModel.getRespmsgkey());
		headers.add(Const.HTTP_HEADER_RESP_MSG_VAL, respModel.getRespmsgval());
		responseEntity = new ResponseEntity<M>(respModel.getModel(), headers, respModel.getHttpstatus());
		return responseEntity;
	}

	/**
	 * 
	 * @return
	 */
	protected ResponseEntity<Iterable<M>> readAllModels() {
		ResponseEntity<Iterable<M>> responseEntity;
		HttpHeaders headers = new HttpHeaders();
		RespListOfModels<M> respListOfModels = srvc.readAll();
		Iterable<M> models = respListOfModels.getModels();
		headers.add(Const.HTTP_HEADER_RESP_MSG_KEY, respListOfModels.getRespmsgkey());
		headers.add(Const.HTTP_HEADER_RESP_MSG_VAL, respListOfModels.getRespmsgval());
		responseEntity = new ResponseEntity<Iterable<M>>(models, headers, respListOfModels.getHttpstatus());
		return responseEntity;
	}

	/**
	 * 
	 * @param id
	 * @param modelToBeMerged
	 * @return
	 */
	protected ResponseEntity<M> updateModel(ID id, M modelToBeMerged) {
		ResponseEntity<M> responseEntity;
		HttpHeaders headers = new HttpHeaders();
		RespModel<M> respModel = srvc.update(id, modelToBeMerged);
		headers.add(Const.HTTP_HEADER_RESP_MSG_KEY, respModel.getRespmsgkey());
		headers.add(Const.HTTP_HEADER_RESP_MSG_VAL, respModel.getRespmsgval());
		responseEntity = new ResponseEntity<M>(respModel.getModel(), headers, respModel.getHttpstatus());
		return responseEntity;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	protected ResponseEntity<RespModelDeleted> deleteModel(ID id) {
		ResponseEntity<RespModelDeleted> responseEntity;
		HttpHeaders headers = new HttpHeaders();
		RespModelDeleted respModelDeleted = srvc.delete(id);
		headers.add(Const.HTTP_HEADER_RESP_MSG_KEY, respModelDeleted.getRespmsgkey());
		headers.add(Const.HTTP_HEADER_RESP_MSG_VAL, respModelDeleted.getRespmsgval());
		responseEntity = new ResponseEntity<RespModelDeleted>(respModelDeleted, headers,
				respModelDeleted.getHttpstatus());
		return responseEntity;
	}
}
