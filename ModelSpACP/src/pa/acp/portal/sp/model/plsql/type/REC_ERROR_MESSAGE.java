package pa.acp.portal.sp.model.plsql.type;

/**
 *
 * @author lalince
 */
public class REC_ERROR_MESSAGE implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String code;
    private String description;
    private String row_number;
    private String error_type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRow_number() {
        return row_number;
    }

    public void setRow_number(String row_number) {
        this.row_number = row_number;
    }

    public String getError_type() {
        return error_type;
    }

    public void setError_type(String error_type) {
        this.error_type = error_type;
    }
    }
