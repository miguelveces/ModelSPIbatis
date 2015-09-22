package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_VISIB_DET {
    
    private static final long serialVersionUID = 1L;    
    private String seq                 ;
    private String visib_id            ;
    private String source              ;
    private String visib_ind           ;
    private String load_ind            ;
    private String blind_dist_cp1_trn  ;
    private String blind_dist_cp2_trn  ;
    private String blind_dist_cp3_trn  ;
    private String cph_for_trn         ;
    private String cpl_for_trn         ;
    private String trn_visib_calc_meth ;
    private String fwd_anchor_gear_cond;
    private String radar_no1_oper      ;
    private String radar_no2_oper      ;
    private String gyro_compas_work    ;
    private String gyro_repeat_at_cp   ;
    private String rmk                 ;
    private String ais_oper_ind        ;
    private String msvi_seq            ;
    private String change_no           ;

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setVisib_id(String visib_id) {
        this.visib_id = visib_id;
    }

    public String getVisib_id() {
        return visib_id;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setVisib_ind(String visib_ind) {
        this.visib_ind = visib_ind;
    }

    public String getVisib_ind() {
        return visib_ind;
    }

    public void setLoad_ind(String load_ind) {
        this.load_ind = load_ind;
    }

    public String getLoad_ind() {
        return load_ind;
    }

    public void setBlind_dist_cp1_trn(String blind_dist_cp1_trn) {
        this.blind_dist_cp1_trn = blind_dist_cp1_trn;
    }

    public String getBlind_dist_cp1_trn() {
        return blind_dist_cp1_trn;
    }

    public void setBlind_dist_cp2_trn(String blind_dist_cp2_trn) {
        this.blind_dist_cp2_trn = blind_dist_cp2_trn;
    }

    public String getBlind_dist_cp2_trn() {
        return blind_dist_cp2_trn;
    }

    public void setBlind_dist_cp3_trn(String blind_dist_cp3_trn) {
        this.blind_dist_cp3_trn = blind_dist_cp3_trn;
    }

    public String getBlind_dist_cp3_trn() {
        return blind_dist_cp3_trn;
    }

    public void setCph_for_trn(String cph_for_trn) {
        this.cph_for_trn = cph_for_trn;
    }

    public String getCph_for_trn() {
        return cph_for_trn;
    }

    public void setCpl_for_trn(String cpl_for_trn) {
        this.cpl_for_trn = cpl_for_trn;
    }

    public String getCpl_for_trn() {
        return cpl_for_trn;
    }

    public void setTrn_visib_calc_meth(String trn_visib_calc_meth) {
        this.trn_visib_calc_meth = trn_visib_calc_meth;
    }

    public String getTrn_visib_calc_meth() {
        return trn_visib_calc_meth;
    }

    public void setFwd_anchor_gear_cond(String fwd_anchor_gear_cond) {
        this.fwd_anchor_gear_cond = fwd_anchor_gear_cond;
    }

    public String getFwd_anchor_gear_cond() {
        return fwd_anchor_gear_cond;
    }

    public void setRadar_no1_oper(String radar_no1_oper) {
        this.radar_no1_oper = radar_no1_oper;
    }

    public String getRadar_no1_oper() {
        return radar_no1_oper;
    }

    public void setRadar_no2_oper(String radar_no2_oper) {
        this.radar_no2_oper = radar_no2_oper;
    }

    public String getRadar_no2_oper() {
        return radar_no2_oper;
    }

    public void setGyro_compas_work(String gyro_compas_work) {
        this.gyro_compas_work = gyro_compas_work;
    }

    public String getGyro_compas_work() {
        return gyro_compas_work;
    }

    public void setGyro_repeat_at_cp(String gyro_repeat_at_cp) {
        this.gyro_repeat_at_cp = gyro_repeat_at_cp;
    }

    public String getGyro_repeat_at_cp() {
        return gyro_repeat_at_cp;
    }

    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    public String getRmk() {
        return rmk;
    }

    public void setAis_oper_ind(String ais_oper_ind) {
        this.ais_oper_ind = ais_oper_ind;
    }

    public String getAis_oper_ind() {
        return ais_oper_ind;
    }

    public void setMsvi_seq(String msvi_seq) {
        this.msvi_seq = msvi_seq;
    }

    public String getMsvi_seq() {
        return msvi_seq;
    }

    public void setChange_no(String change_no) {
        this.change_no = change_no;
    }

    public String getChange_no() {
        return change_no;
    }
}
