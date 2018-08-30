package in.pune.pradyroy;

import org.springframework.stereotype.Component;

/**
 * Global constants file
 * 
 * @author Pradyumna Roy
 *
 */
@Component
public class Const {

	public static final String HTTP_HEADER_RESP_MSG_KEY = "RESP-MSG-KEY";
	public static final String HTTP_HEADER_RESP_MSG_VAL = "RESP-MSG-VAL";

	public static final String NO_MSG_KEY = "NOMSGKEY";
	public static final String NO_VAL = "NOVAL";

	public static final String CREATE_SUCCESS_VAL = "creation successful";
	public static final String READ_SUCCESS_VAL = "read success";
	public static final String UPDATE_SUCCESS_VAL = "updated successfully";
	public static final String DELETE_SUCCESS_VAL = "deleted successfully";

	public static final String ENTITY_NOT_FOUND_VAL = "entity not found";
	public static final String SYS_ERR_VAL = "system error";
}
