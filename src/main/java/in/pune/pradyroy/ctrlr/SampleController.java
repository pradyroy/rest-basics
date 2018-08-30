package in.pune.pradyroy.ctrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.pune.pradyroy.model.RespModelDeleted;
import in.pune.pradyroy.model.SampleModel;
import in.pune.pradyroy.srvc.SampleSrvc;

@RestController
@RequestMapping("/samples")
public class SampleController extends BaseAbstractCtrlr<SampleModel, Integer> {

	@Autowired
	public SampleController(SampleSrvc sampleSrvc) {
		super(sampleSrvc);
	}

	@Override
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<SampleModel> create(@RequestBody SampleModel inputModel) {
		return createModel(inputModel);
	}

	@Override
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<SampleModel> read(@PathVariable(value = "id") Integer id) {
		return readModel(id);
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<SampleModel>> readAll() {
		return readAllModels();
	}

	@Override
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public ResponseEntity<SampleModel> update(@PathVariable(value = "id") Integer id, @RequestBody SampleModel modelToBeMerged) {
		return updateModel(id, modelToBeMerged);
	}

	@Override
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public ResponseEntity<RespModelDeleted> delete(@PathVariable(value = "id") Integer id) {
		return deleteModel(id);
	}

}
