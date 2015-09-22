package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
import java.sql.Timestamp;

public class REC_PEOPLE_ON_BRD implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String pob_seq;
    private String pob_typ;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String second_last_name;
    private Timestamp birthday;
    private String id;
    private String id_typ;
    private String disposition;
    private String excl_reas;
    private String msvi_seq;
    private String cdt_cd;
    private String ucd_seq;
    private REC_CNTRY_FLAG birthplace_country;
    private REC_CNTRY_FLAG nationality;
    private REC_PORT_DATE_INFO unport_of_emb;
    private REC_PORT_DATE_INFO unport_of_disemb;
    private TAB_PEOPLE_ON_BRD_DET people_on_brd_det;
    private String change_no;

    public void setPob_seq(String pob_seq) {
        this.pob_seq = pob_seq;
    }

    public String getPob_seq() {
        return pob_seq;
    }

    public void setPob_typ(String pob_typ) {
        this.pob_typ = pob_typ;
    }

    public String getPob_typ() {
        return pob_typ;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setSecond_last_name(String second_last_name) {
        this.second_last_name = second_last_name;
    }

    public String getSecond_last_name() {
        return second_last_name;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId_typ(String id_typ) {
        this.id_typ = id_typ;
    }

    public String getId_typ() {
        return id_typ;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setExcl_reas(String excl_reas) {
        this.excl_reas = excl_reas;
    }

    public String getExcl_reas() {
        return excl_reas;
    }

    public void setMsvi_seq(String msvi_seq) {
        this.msvi_seq = msvi_seq;
    }

    public String getMsvi_seq() {
        return msvi_seq;
    }

    public void setCdt_cd(String cdt_cd) {
        this.cdt_cd = cdt_cd;
    }

    public String getCdt_cd() {
        return cdt_cd;
    }

    public void setUcd_seq(String ucd_seq) {
        this.ucd_seq = ucd_seq;
    }

    public String getUcd_seq() {
        return ucd_seq;
    }

    public void setBirthplace_country(REC_CNTRY_FLAG birthplace_country) {
        this.birthplace_country = birthplace_country;
    }

    public REC_CNTRY_FLAG getBirthplace_country() {
        return birthplace_country;
    }

    public void setNationality(REC_CNTRY_FLAG nationality) {
        this.nationality = nationality;
    }

    public REC_CNTRY_FLAG getNationality() {
        return nationality;
    }

    public void setUnport_of_emb(REC_PORT_DATE_INFO unport_of_emb) {
        this.unport_of_emb = unport_of_emb;
    }

    public REC_PORT_DATE_INFO getUnport_of_emb() {
        return unport_of_emb;
    }

    public void setUnport_of_disemb(REC_PORT_DATE_INFO unport_of_disemb) {
        this.unport_of_disemb = unport_of_disemb;
    }

    public REC_PORT_DATE_INFO getUnport_of_disemb() {
        return unport_of_disemb;
    }

    public void setPeople_on_brd_det(TAB_PEOPLE_ON_BRD_DET people_on_brd_det) {
        this.people_on_brd_det = people_on_brd_det;
    }

    public TAB_PEOPLE_ON_BRD_DET getPeople_on_brd_det() {
        return people_on_brd_det;
    }

    public void setChange_no(String change_no) {
        this.change_no = change_no;
    }

    public String getChange_no() {
        return change_no;
    }
}
