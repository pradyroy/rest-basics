package in.pune.pradyroy.srvc;

import in.pune.pradyroy.model.BaseModel;
import in.pune.pradyroy.model.RespListOfModels;
import in.pune.pradyroy.model.RespModel;
import in.pune.pradyroy.model.RespModelDeleted;

/**
 * 
 * @author Pradyumna Roy
 *
 * @param <M>
 * @param <ID>
 */
public abstract class BaseAbstractSrvc<M extends BaseModel, ID> {

	public BaseAbstractSrvc() {

	}

	public abstract RespModel<M> create(M model);

	public abstract RespModel<M> read(ID id);

	public abstract RespListOfModels<M> readAll();

	public abstract RespModel<M> update(ID id, M modelToBeMerged);

	public abstract RespModelDeleted delete(ID id);
}
