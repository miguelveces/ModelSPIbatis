package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_VISIT_CONSIDER implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String seq               ;
    private String consider_ind      ;
    private String dock_loc          ;
    private String actual_value      ;
    private String rmk               ;
    private String ci_consider_no    ;
    private String vo_seq            ;
    private String ci_consider_descr ;
    private String ci_consider_type  ;
    private String oper_typ          ;
    private String change_no         ;

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setConsider_ind(String consider_ind) {
        this.consider_ind = consider_ind;
    }

    public String getConsider_ind() {
        return consider_ind;
    }

    public void setDock_loc(String dock_loc) {
        this.dock_loc = dock_loc;
    }

    public String getDock_loc() {
        return dock_loc;
    }

    public void setActual_value(String actual_value) {
        this.actual_value = actual_value;
    }

    public String getActual_value() {
        return actual_value;
    }

    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    public String getRmk() {
        return rmk;
    }

    public void setCi_consider_no(String ci_consider_no) {
        this.ci_consider_no = ci_consider_no;
    }

    public String getCi_consider_no() {
        return ci_consider_no;
    }

    public void setVo_seq(String vo_seq) {
        this.vo_seq = vo_seq;
    }

    public String getVo_seq() {
        return vo_seq;
    }

    public void setCi_consider_descr(String ci_consider_descr) {
        this.ci_consider_descr = ci_consider_descr;
    }

    public String getCi_consider_descr() {
        return ci_consider_descr;
    }

    public void setCi_consider_type(String ci_consider_type) {
        this.ci_consider_type = ci_consider_type;
    }

    public String getCi_consider_type() {
        return ci_consider_type;
    }

    public void setOper_typ(String oper_typ) {
        this.oper_typ = oper_typ;
    }

    public String getOper_typ() {
        return oper_typ;
    }

    public void setChange_no(String change_no) {
        this.change_no = change_no;
    }

    public String getChange_no() {
        return change_no;
    }
}
