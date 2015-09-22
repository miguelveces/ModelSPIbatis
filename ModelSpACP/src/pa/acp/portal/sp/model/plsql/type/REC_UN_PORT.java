package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_UN_PORT implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String seq              ;
    private String cd               ;
    private String name             ;
    private String ucf_seq          ;
    private String coord            ;
    private String active           ;
    private String ucf_iso2alpha_cd ;
    private String ucf_descr        ;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUcf_seq(String ucf_seq) {
        this.ucf_seq = ucf_seq;
    }

    public String getUcf_seq() {
        return ucf_seq;
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }

    public String getCoord() {
        return coord;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getActive() {
        return active;
    }

    public void setUcf_iso2alpha_cd(String ucf_iso2alpha_cd) {
        this.ucf_iso2alpha_cd = ucf_iso2alpha_cd;
    }

    public String getUcf_iso2alpha_cd() {
        return ucf_iso2alpha_cd;
    }

    public void setUcf_descr(String ucf_descr) {
        this.ucf_descr = ucf_descr;
    }

    public String getUcf_descr() {
        return ucf_descr;
    }
}
