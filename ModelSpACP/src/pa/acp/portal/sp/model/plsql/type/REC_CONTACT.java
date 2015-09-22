package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_CONTACT implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private String seq;
    private String short_name;
    private String name;
    private String role;
    private String alliance_ind;
    private String active;
    private String voca_seq;
    private String msca_seq;
    private String email_list;
    private String change_no;


    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setAlliance_ind(String alliance_ind) {
        this.alliance_ind = alliance_ind;
    }

    public String getAlliance_ind() {
        return alliance_ind;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getActive() {
        return active;
    }

    public void setVoca_seq(String voca_seq) {
        this.voca_seq = voca_seq;
    }

    public String getVoca_seq() {
        return voca_seq;
    }

    public void setMsca_seq(String msca_seq) {
        this.msca_seq = msca_seq;
    }

    public String getMsca_seq() {
        return msca_seq;
    }

    public void setEmail_list(String email_list) {
        this.email_list = email_list;
    }

    public String getEmail_list() {
        return email_list;
    }

    public void setChange_no(String change_no) {
        this.change_no = change_no;
    }

    public String getChange_no() {
        return change_no;
    }
}
