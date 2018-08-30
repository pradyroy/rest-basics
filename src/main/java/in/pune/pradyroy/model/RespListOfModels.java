package in.pune.pradyroy.model;

import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Pradyumna Roy
 *
 * @param <M>
 */
public class RespListOfModels<M> extends RespBase {

	@JsonIgnore
	private Iterable<M> models;

	private Long count;

	public RespListOfModels() {
		super();
	}

	public RespListOfModels(String modelname) {
		super(modelname);
	}

	public Iterable<M> getModels() {
		return models;
	}

	public void setModels(Iterable<M> models) {
		this.models = models;
	}

	public Long getCount() {
		count = 0L;
		if (null != models) {
			Iterator<M> iterator = models.iterator();
			while (iterator.hasNext()) {
				count++;
				iterator.next();
			}
		}
		return count;
	}
}
