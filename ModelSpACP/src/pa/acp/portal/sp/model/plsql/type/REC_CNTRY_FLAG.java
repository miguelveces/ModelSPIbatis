package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_CNTRY_FLAG implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String  seq           ;
    private String  cd           ;
    private String  un_iso_no    ;
    private String  iso2alpha_cd ;
    private String  nationality  ;
    private String  descr        ;
    private String  active       ;
    private String  un_code_ind  ;

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getCd() {
        return cd;
    }

    public void setUn_iso_no(String un_iso_no) {
        this.un_iso_no = un_iso_no;
    }

    public String getUn_iso_no() {
        return un_iso_no;
    }

    public void setIso2alpha_cd(String iso2alpha_cd) {
        this.iso2alpha_cd = iso2alpha_cd;
    }

    public String getIso2alpha_cd() {
        return iso2alpha_cd;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescr() {
        return descr;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getActive() {
        return active;
    }

    public void setUn_code_ind(String un_code_ind) {
        this.un_code_ind = un_code_ind;
    }

    public String getUn_code_ind() {
        return un_code_ind;
    }
}
