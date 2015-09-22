package pa.acp.portal.sp.model.plsql.type;

/**
 *
 * @author lalince
 */
public class REC_SORT_OPTION implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String sort_index;
    private String sort_name;
    private String sort_column;
    private String selected;
    private String sort_type;

    public String getSort_index() {
        return sort_index;
    }

    public void setSort_index(String sort_index) {
        this.sort_index = sort_index;
    }

    public String getSort_name() {
        return sort_name;
    }

    public void setSort_name(String sort_name) {
        this.sort_name = sort_name;
    }

    public String getSort_column() {
        return sort_column;
    }

    public void setSort_column(String sort_column) {
        this.sort_column = sort_column;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getSort_type() {
        return sort_type;
    }

    public void setSort_type(String sort_type) {
        this.sort_type = sort_type;
    }
    
}

