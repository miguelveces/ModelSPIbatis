package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
import java.sql.Timestamp;

public class REC_ARRIVAL_COND implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String seq;
    private String vsl_req_svce_for;
    private String arr_displ;
    private String rdy_on_arri_ind;
    private String vis_rmk;
    private String tsw_dft_fwd;
    private String tsw_dft_aft;
    private String tfw_dft_fwd;
    private String tfw_dft_aft;
    private String radio_pratiq_req;
    private String typ_pratiq_grant;
    private String hotwork_authtn_req;
    private String hotwork_authtn_req_;
    private String rte_svc_cd;
    private String rte_svc_name;
    private String cgo_oper_out_ind;
    private String vo_seq;
    private String exceed_visib_ind;
    private Timestamp exceed_visib_date;
    private String change_no;
    private REC_CGO_RTES orig_rte;
    private REC_CGO_RTES dest_rte;

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setVsl_req_svce_for(String vsl_req_svce_for) {
        this.vsl_req_svce_for = vsl_req_svce_for;
    }

    public String getVsl_req_svce_for() {
        return vsl_req_svce_for;
    }

    public void setArr_displ(String arr_displ) {
        this.arr_displ = arr_displ;
    }

    public String getArr_displ() {
        return arr_displ;
    }

    public void setRdy_on_arri_ind(String rdy_on_arri_ind) {
        this.rdy_on_arri_ind = rdy_on_arri_ind;
    }

    public String getRdy_on_arri_ind() {
        return rdy_on_arri_ind;
    }

    public void setVis_rmk(String vis_rmk) {
        this.vis_rmk = vis_rmk;
    }

    public String getVis_rmk() {
        return vis_rmk;
    }

    public void setTsw_dft_fwd(String tsw_dft_fwd) {
        this.tsw_dft_fwd = tsw_dft_fwd;
    }

    public String getTsw_dft_fwd() {
        return tsw_dft_fwd;
    }

    public void setTsw_dft_aft(String tsw_dft_aft) {
        this.tsw_dft_aft = tsw_dft_aft;
    }

    public String getTsw_dft_aft() {
        return tsw_dft_aft;
    }

    public void setTfw_dft_fwd(String tfw_dft_fwd) {
        this.tfw_dft_fwd = tfw_dft_fwd;
    }

    public String getTfw_dft_fwd() {
        return tfw_dft_fwd;
    }

    public void setTfw_dft_aft(String tfw_dft_aft) {
        this.tfw_dft_aft = tfw_dft_aft;
    }

    public String getTfw_dft_aft() {
        return tfw_dft_aft;
    }

    public void setRadio_pratiq_req(String radio_pratiq_req) {
        this.radio_pratiq_req = radio_pratiq_req;
    }

    public String getRadio_pratiq_req() {
        return radio_pratiq_req;
    }

    public void setTyp_pratiq_grant(String typ_pratiq_grant) {
        this.typ_pratiq_grant = typ_pratiq_grant;
    }

    public String getTyp_pratiq_grant() {
        return typ_pratiq_grant;
    }

    public void setHotwork_authtn_req(String hotwork_authtn_req) {
        this.hotwork_authtn_req = hotwork_authtn_req;
    }

    public String getHotwork_authtn_req() {
        return hotwork_authtn_req;
    }

    public void setHotwork_authtn_req_(String hotwork_authtn_req_) {
        this.hotwork_authtn_req_ = hotwork_authtn_req_;
    }

    public String getHotwork_authtn_req_() {
        return hotwork_authtn_req_;
    }

    public void setRte_svc_cd(String rte_svc_cd) {
        this.rte_svc_cd = rte_svc_cd;
    }

    public String getRte_svc_cd() {
        return rte_svc_cd;
    }

    public void setRte_svc_name(String rte_svc_name) {
        this.rte_svc_name = rte_svc_name;
    }

    public String getRte_svc_name() {
        return rte_svc_name;
    }

    public void setCgo_oper_out_ind(String cgo_oper_out_ind) {
        this.cgo_oper_out_ind = cgo_oper_out_ind;
    }

    public String getCgo_oper_out_ind() {
        return cgo_oper_out_ind;
    }

    public void setVo_seq(String vo_seq) {
        this.vo_seq = vo_seq;
    }

    public String getVo_seq() {
        return vo_seq;
    }

    public void setExceed_visib_ind(String exceed_visib_ind) {
        this.exceed_visib_ind = exceed_visib_ind;
    }

    public String getExceed_visib_ind() {
        return exceed_visib_ind;
    }

    public void setExceed_visib_date(Timestamp exceed_visib_date) {
        this.exceed_visib_date = exceed_visib_date;
    }

    public Timestamp getExceed_visib_date() {
        return exceed_visib_date;
    }

    public void setChange_no(String change_no) {
        this.change_no = change_no;
    }

    public String getChange_no() {
        return change_no;
    }

    public void setOrig_rte(REC_CGO_RTES orig_rte) {
        this.orig_rte = orig_rte;
    }

    public REC_CGO_RTES getOrig_rte() {
        return orig_rte;
    }

    public void setDest_rte(REC_CGO_RTES dest_rte) {
        this.dest_rte = dest_rte;
    }

    public REC_CGO_RTES getDest_rte() {
        return dest_rte;
    }
}
