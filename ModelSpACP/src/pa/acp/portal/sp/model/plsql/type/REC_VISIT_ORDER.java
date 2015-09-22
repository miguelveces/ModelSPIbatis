package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
import java.sql.Timestamp;

public class REC_VISIT_ORDER implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String svc_ord_type;
    private String svc_order_no;
    private Timestamp svc_order_date;
    private String svc_status;
    private Timestamp svc_status_date;
    private String svc_status_reason;
    private String svc_status_source;
    private String svc_rsr_seq;
    private String svc_change_no;
    private String vis_seq;
    private String vis_svc_order_no;
    private Timestamp vis_arr_date_time;
    private Timestamp vis_eta_date_time;
    private String vis_eta_based_on;
    private String vis_arr_loc;
    private String vis_hl_ind;
    private Timestamp vis_hl_arr_date_time_curr_loc;
    private String vis_hl_curr_loc;
    private String vis_hl_phone_no;
    private String vis_hl_insp_loc;
    private String vis_first_visit_ind;
    private Timestamp vis_cape_mala_date_time;
    private String vis_cape_mala_speed;
    private String vis_cape_mala_based_on;
    private String vis_vsl_seq;
    private String vis_visit_no;
    private String vis_visit_stat;
    private String vis_self_prop_ind;
    private String arrival_loc_descr;
    private Timestamp eta_to;
    private REC_VESSEL vis_vessel;
    private REC_CONTACT vis_agent;
    private TAB_CONTACT vis_customer;
    private REC_CONTACT vis_charter;
    private REC_CONTACT vis_operator;
    private TAB_VISIT_CONSIDER vis_consider;
    private REC_ARRIVAL_COND vis_arrival_cond;
    private String vis_change_no;
    private String active_txn_ind;
    private String service_type;
    private String transit_direction;
    private String vis_visit_stat_desc;


    public void setSvc_ord_type(String svc_ord_type) {
        this.svc_ord_type = svc_ord_type;
    }

    public String getSvc_ord_type() {
        return svc_ord_type;
    }

    public void setSvc_order_no(String svc_order_no) {
        this.svc_order_no = svc_order_no;
    }

    public String getSvc_order_no() {
        return svc_order_no;
    }

    public void setSvc_order_date(Timestamp svc_order_date) {
        this.svc_order_date = svc_order_date;
    }

    public Timestamp getSvc_order_date() {
        return svc_order_date;
    }

    public void setSvc_status(String svc_status) {
        this.svc_status = svc_status;
    }

    public String getSvc_status() {
        return svc_status;
    }

    public void setSvc_status_date(Timestamp svc_status_date) {
        this.svc_status_date = svc_status_date;
    }

    public Timestamp getSvc_status_date() {
        return svc_status_date;
    }

    public void setSvc_status_reason(String svc_status_reason) {
        this.svc_status_reason = svc_status_reason;
    }

    public String getSvc_status_reason() {
        return svc_status_reason;
    }

    public void setSvc_status_source(String svc_status_source) {
        this.svc_status_source = svc_status_source;
    }

    public String getSvc_status_source() {
        return svc_status_source;
    }

    public void setSvc_rsr_seq(String svc_rsr_seq) {
        this.svc_rsr_seq = svc_rsr_seq;
    }

    public String getSvc_rsr_seq() {
        return svc_rsr_seq;
    }

    public void setSvc_change_no(String svc_change_no) {
        this.svc_change_no = svc_change_no;
    }

    public String getSvc_change_no() {
        return svc_change_no;
    }

    public void setVis_seq(String vis_seq) {
        this.vis_seq = vis_seq;
    }

    public String getVis_seq() {
        return vis_seq;
    }

    public void setVis_svc_order_no(String vis_svc_order_no) {
        this.vis_svc_order_no = vis_svc_order_no;
    }

    public String getVis_svc_order_no() {
        return vis_svc_order_no;
    }

    public void setVis_arr_date_time(Timestamp vis_arr_date_time) {
        this.vis_arr_date_time = vis_arr_date_time;
    }

    public Timestamp getVis_arr_date_time() {
        return vis_arr_date_time;
    }

    public void setVis_eta_date_time(Timestamp vis_eta_date_time) {
        this.vis_eta_date_time = vis_eta_date_time;
    }

    public Timestamp getVis_eta_date_time() {
        return vis_eta_date_time;
    }

    public void setVis_eta_based_on(String vis_eta_based_on) {
        this.vis_eta_based_on = vis_eta_based_on;
    }

    public String getVis_eta_based_on() {
        return vis_eta_based_on;
    }

    public void setVis_arr_loc(String vis_arr_loc) {
        this.vis_arr_loc = vis_arr_loc;
    }

    public String getVis_arr_loc() {
        return vis_arr_loc;
    }

    public void setVis_hl_ind(String vis_hl_ind) {
        this.vis_hl_ind = vis_hl_ind;
    }

    public String getVis_hl_ind() {
        return vis_hl_ind;
    }

    public void setVis_hl_arr_date_time_curr_loc(Timestamp vis_hl_arr_date_time_curr_loc) {
        this.vis_hl_arr_date_time_curr_loc = vis_hl_arr_date_time_curr_loc;
    }

    public Timestamp getVis_hl_arr_date_time_curr_loc() {
        return vis_hl_arr_date_time_curr_loc;
    }

    public void setVis_hl_curr_loc(String vis_hl_curr_loc) {
        this.vis_hl_curr_loc = vis_hl_curr_loc;
    }

    public String getVis_hl_curr_loc() {
        return vis_hl_curr_loc;
    }

    public void setVis_hl_phone_no(String vis_hl_phone_no) {
        this.vis_hl_phone_no = vis_hl_phone_no;
    }

    public String getVis_hl_phone_no() {
        return vis_hl_phone_no;
    }

    public void setVis_hl_insp_loc(String vis_hl_insp_loc) {
        this.vis_hl_insp_loc = vis_hl_insp_loc;
    }

    public String getVis_hl_insp_loc() {
        return vis_hl_insp_loc;
    }

    public void setVis_first_visit_ind(String vis_first_visit_ind) {
        this.vis_first_visit_ind = vis_first_visit_ind;
    }

    public String getVis_first_visit_ind() {
        return vis_first_visit_ind;
    }

    public void setVis_cape_mala_date_time(Timestamp vis_cape_mala_date_time) {
        this.vis_cape_mala_date_time = vis_cape_mala_date_time;
    }

    public Timestamp getVis_cape_mala_date_time() {
        return vis_cape_mala_date_time;
    }

    public void setVis_cape_mala_speed(String vis_cape_mala_speed) {
        this.vis_cape_mala_speed = vis_cape_mala_speed;
    }

    public String getVis_cape_mala_speed() {
        return vis_cape_mala_speed;
    }

    public void setVis_cape_mala_based_on(String vis_cape_mala_based_on) {
        this.vis_cape_mala_based_on = vis_cape_mala_based_on;
    }

    public String getVis_cape_mala_based_on() {
        return vis_cape_mala_based_on;
    }

    public void setVis_vsl_seq(String vis_vsl_seq) {
        this.vis_vsl_seq = vis_vsl_seq;
    }

    public String getVis_vsl_seq() {
        return vis_vsl_seq;
    }

    public void setVis_visit_no(String vis_visit_no) {
        this.vis_visit_no = vis_visit_no;
    }

    public String getVis_visit_no() {
        return vis_visit_no;
    }

    public void setVis_visit_stat(String vis_visit_stat) {
        this.vis_visit_stat = vis_visit_stat;
    }

    public String getVis_visit_stat() {
        return vis_visit_stat;
    }

    public void setVis_self_prop_ind(String vis_self_prop_ind) {
        this.vis_self_prop_ind = vis_self_prop_ind;
    }

    public String getVis_self_prop_ind() {
        return vis_self_prop_ind;
    }

    public void setArrival_loc_descr(String arrival_loc_descr) {
        this.arrival_loc_descr = arrival_loc_descr;
    }

    public String getArrival_loc_descr() {
        return arrival_loc_descr;
    }

    public void setEta_to(Timestamp eta_to) {
        this.eta_to = eta_to;
    }

    public Timestamp getEta_to() {
        return eta_to;
    }

    public void setVis_vessel(REC_VESSEL vis_vessel) {
        this.vis_vessel = vis_vessel;
    }

    public REC_VESSEL getVis_vessel() {
        return vis_vessel;
    }

    public void setVis_agent(REC_CONTACT vis_agent) {
        this.vis_agent = vis_agent;
    }

    public REC_CONTACT getVis_agent() {
        return vis_agent;
    }

    public void setVis_customer(TAB_CONTACT vis_customer) {
        this.vis_customer = vis_customer;
    }

    public TAB_CONTACT getVis_customer() {
        return vis_customer;
    }

    public void setVis_charter(REC_CONTACT vis_charter) {
        this.vis_charter = vis_charter;
    }

    public REC_CONTACT getVis_charter() {
        return vis_charter;
    }

    public void setVis_operator(REC_CONTACT vis_operator) {
        this.vis_operator = vis_operator;
    }

    public REC_CONTACT getVis_operator() {
        return vis_operator;
    }

    public void setVis_consider(TAB_VISIT_CONSIDER vis_consider) {
        this.vis_consider = vis_consider;
    }

    public TAB_VISIT_CONSIDER getVis_consider() {
        return vis_consider;
    }

    public void setVis_arrival_cond(REC_ARRIVAL_COND vis_arrival_cond) {
        this.vis_arrival_cond = vis_arrival_cond;
    }

    public REC_ARRIVAL_COND getVis_arrival_cond() {
        return vis_arrival_cond;
    }

    public void setVis_change_no(String vis_change_no) {
        this.vis_change_no = vis_change_no;
    }

    public String getVis_change_no() {
        return vis_change_no;
    }

    public void setActive_txn_ind(String active_txn_ind) {
        this.active_txn_ind = active_txn_ind;
    }

    public String getActive_txn_ind() {
        return active_txn_ind;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getService_type() {
        return service_type;
    }

    public void setTransit_direction(String transit_direction) {
        this.transit_direction = transit_direction;
    }

    public String getTransit_direction() {
        return transit_direction;
    }

    public void setVis_visit_stat_desc(String vis_visit_stat_desc) {
        this.vis_visit_stat_desc = vis_visit_stat_desc;
    }

    public String getVis_visit_stat_desc() {
        return vis_visit_stat_desc;
    }
}
