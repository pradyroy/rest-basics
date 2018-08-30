package in.pune.pradyroy.model;

import org.springframework.http.HttpStatus;

import in.pune.pradyroy.Const;

/**
 * 
 * @author Pradyumna Roy
 *
 */
public class RespBase extends BaseModel {
	// entity name
	private String modelname = "null";

	// Response Http Code for the result
	// of the ops on the entity
	private HttpStatus httpstatus = HttpStatus.OK;

	// Response Message key
	private String respmsgkey = Const.NO_MSG_KEY;

	// Response Message value
	private String respmsgval = Const.NO_VAL;

	public RespBase() {

	}

	public RespBase(String modelname) {
		super();
		this.modelname = modelname;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}

	public String getRespmsgkey() {
		return respmsgkey;
	}

	public void setRespmsgkey(String respmsgkey) {
		this.respmsgkey = respmsgkey;
	}

	public String getRespmsgval() {
		return respmsgval;
	}

	public void setRespmsgval(String respmsgval) {
		this.respmsgval = respmsgval;
	}
}