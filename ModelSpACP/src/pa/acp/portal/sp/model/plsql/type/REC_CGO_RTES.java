package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_CGO_RTES implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String cd          ;
    private String descr       ;
    private String short_descr ;

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getCd() {
        return cd;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescr() {
        return descr;
    }

    public void setShort_descr(String short_descr) {
        this.short_descr = short_descr;
    }

    public String getShort_descr() {
        return short_descr;
    }
}
