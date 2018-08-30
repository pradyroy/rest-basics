package in.pune.pradyroy.srvc;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.pune.pradyroy.Const;
import in.pune.pradyroy.model.RespListOfModels;
import in.pune.pradyroy.model.RespModel;
import in.pune.pradyroy.model.RespModelDeleted;
import in.pune.pradyroy.model.SampleModel;

@Service
public class SampleSrvc extends BaseAbstractSrvc<SampleModel, Integer> {
	
	public final String MODEL_NAME = "SampleModel";
	public static Integer idcounter = 0;
	public static HashMap<Integer, SampleModel> sampleModelMap = new HashMap<Integer, SampleModel>();

	@Override
	public RespModel<SampleModel> create(SampleModel model) {
		++idcounter;
		model.setId(idcounter);
		sampleModelMap.put(idcounter, model);
		RespModel<SampleModel> respModel = new RespModel<SampleModel>();
		respModel.setHttpstatus(HttpStatus.CREATED);
		respModel.setModel(model);
		respModel.setModelname(MODEL_NAME);
		respModel.setRespmsgkey("samplemodel.create.ok");
		respModel.setRespmsgval(Const.CREATE_SUCCESS_VAL);
		return respModel;
	}

	@Override
	public RespModel<SampleModel> read(Integer id) {
		RespModel<SampleModel> respModel = new RespModel<SampleModel>();
		if (sampleModelMap.containsKey(id)) {
			respModel.setHttpstatus(HttpStatus.FOUND);
			respModel.setModel(sampleModelMap.get(id));
			respModel.setModelname(MODEL_NAME);
			respModel.setRespmsgkey("samplemodel.read.ok");
			respModel.setRespmsgval(Const.READ_SUCCESS_VAL);
		}else {
			respModel.setHttpstatus(HttpStatus.NOT_FOUND);
			respModel.setModelname(MODEL_NAME);
			respModel.setRespmsgkey("samplemodel.read.ko");
			respModel.setRespmsgval(Const.ENTITY_NOT_FOUND_VAL);
		}
		return respModel;
	}

	@Override
	public RespListOfModels<SampleModel> readAll() {
		RespListOfModels<SampleModel> respListOfModels = new RespListOfModels<SampleModel>();
		respListOfModels.setHttpstatus(HttpStatus.FOUND);
		respListOfModels.setModels(sampleModelMap.values());
		respListOfModels.setModelname(MODEL_NAME);
		respListOfModels.setRespmsgkey("samplemodel.read.all.ok");
		respListOfModels.setRespmsgval(Const.READ_SUCCESS_VAL);
		return respListOfModels;
	}

	@Override
	public RespModel<SampleModel> update(Integer id, SampleModel modelToBeMerged) {
		RespModel<SampleModel> respModel = new RespModel<SampleModel>();
		if (sampleModelMap.containsKey(id)) {
			modelToBeMerged.setId(id);
			sampleModelMap.replace(id, modelToBeMerged);
			respModel.setHttpstatus(HttpStatus.OK);
			respModel.setModel(sampleModelMap.get(id));
			respModel.setModelname(MODEL_NAME);
			respModel.setRespmsgkey("samplemodel.update.ok");
			respModel.setRespmsgval(Const.UPDATE_SUCCESS_VAL);
		}else {
			respModel.setHttpstatus(HttpStatus.NOT_FOUND);
			respModel.setModelname(MODEL_NAME);
			respModel.setRespmsgkey("samplemodel.update.ko");
			respModel.setRespmsgval(Const.ENTITY_NOT_FOUND_VAL);
		}
		return respModel;
	}

	@Override
	public RespModelDeleted delete(Integer id) {
		RespModelDeleted respModelDeleted = new RespModelDeleted();
		if (sampleModelMap.containsKey(id)) {
			
			sampleModelMap.remove(id);
			respModelDeleted.setHttpstatus(HttpStatus.OK);
			respModelDeleted.setIsdeleted(true);
			respModelDeleted.setModelId(id.toString());
			respModelDeleted.setModelname(MODEL_NAME);
			respModelDeleted.setRespmsgkey("samplemodel.delete.ok");
			respModelDeleted.setRespmsgval(Const.UPDATE_SUCCESS_VAL);
		}else {
			respModelDeleted.setHttpstatus(HttpStatus.NOT_FOUND);
			respModelDeleted.setModelname(MODEL_NAME);
			respModelDeleted.setRespmsgkey("samplemodel.delete.ko");
			respModelDeleted.setRespmsgval(Const.ENTITY_NOT_FOUND_VAL);
		}
		return respModelDeleted;
	}

    
}
