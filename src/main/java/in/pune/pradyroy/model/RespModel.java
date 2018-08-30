package in.pune.pradyroy.model;

/**
 * 
 * @author Pradyumna Roy
 *
 * @param <M>
 */
public class RespModel<M> extends RespBase {
	private M model;

	public RespModel() {
		super();
	}

	public RespModel(String modelname) {
		super(modelname);
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
