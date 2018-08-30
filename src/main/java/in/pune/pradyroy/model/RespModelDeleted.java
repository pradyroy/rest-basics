package in.pune.pradyroy.model;

/**
 * 
 * @author Pradyumna Roy
 *
 */
public class RespModelDeleted extends RespBase {

	private String modelId = "null";

	private Boolean isdeleted;

	public RespModelDeleted() {
		super();
	}

	public RespModelDeleted(String entityname) {
		super(entityname);
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
