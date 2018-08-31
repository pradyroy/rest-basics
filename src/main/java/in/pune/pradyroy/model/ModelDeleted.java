package in.pune.pradyroy.model;

/**
 * 
 * @author Pradyumna Roy
 *
 */
public class ModelDeleted extends BaseModel {

	private String modelName = "null";
		
	private String modelId = "null";

	private Boolean isdeleted;

	public ModelDeleted() {
		super();
	}
	
	public ModelDeleted(String modelName, String modelId, Boolean isdeleted) {
		super();
		this.modelName = modelName;
		this.modelId = modelId;
		this.isdeleted = isdeleted;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public Boolean getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
}
