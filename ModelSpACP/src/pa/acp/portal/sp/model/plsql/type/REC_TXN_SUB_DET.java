package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_TXN_SUB_DET implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String txn_no              ;
    private String txn_typ             ;
    private String txn_status          ;
    private String txn_status_date     ;
    private String txn_status_user_id  ;
    private String svc_order_no        ;
    private String vo_seq              ;
    private REC_VISIT_ORDER visitorder          ;
    private REC_DOC_REQ docreq              ;
    private String statusdescription   ;
    private String submit_info         ;
    private String sync_status         ;
    private String sync_tries          ;
    private String sync_message        ;
    private String change_no           ;

    public void setTxn_no(String txn_no) {
        this.txn_no = txn_no;
    }

    public String getTxn_no() {
        return txn_no;
    }

    public void setTxn_typ(String txn_typ) {
        this.txn_typ = txn_typ;
    }

    public String getTxn_typ() {
        return txn_typ;
    }

    public void setTxn_status(String txn_status) {
        this.txn_status = txn_status;
    }

    public String getTxn_status() {
        return txn_status;
    }

    public void setTxn_status_date(String txn_status_date) {
        this.txn_status_date = txn_status_date;
    }

    public String getTxn_status_date() {
        return txn_status_date;
    }

    public void setTxn_status_user_id(String txn_status_user_id) {
        this.txn_status_user_id = txn_status_user_id;
    }

    public String getTxn_status_user_id() {
        return txn_status_user_id;
    }

    public void setSvc_order_no(String svc_order_no) {
        this.svc_order_no = svc_order_no;
    }

    public String getSvc_order_no() {
        return svc_order_no;
    }

    public void setVo_seq(String vo_seq) {
        this.vo_seq = vo_seq;
    }

    public String getVo_seq() {
        return vo_seq;
    }

    public void setVisitorder(REC_VISIT_ORDER visitorder) {
        this.visitorder = visitorder;
    }

    public REC_VISIT_ORDER getVisitorder() {
        return visitorder;
    }

    public void setDocreq(REC_DOC_REQ docreq) {
        this.docreq = docreq;
    }

    public REC_DOC_REQ getDocreq() {
        return docreq;
    }

    public void setStatusdescription(String statusdescription) {
        this.statusdescription = statusdescription;
    }

    public String getStatusdescription() {
        return statusdescription;
    }

    public void setSubmit_info(String submit_info) {
        this.submit_info = submit_info;
    }

    public String getSubmit_info() {
        return submit_info;
    }

    public void setSync_status(String sync_status) {
        this.sync_status = sync_status;
    }

    public String getSync_status() {
        return sync_status;
    }

    public void setSync_tries(String sync_tries) {
        this.sync_tries = sync_tries;
    }

    public String getSync_tries() {
        return sync_tries;
    }

    public void setSync_message(String sync_message) {
        this.sync_message = sync_message;
    }

    public String getSync_message() {
        return sync_message;
    }

    public void setChange_no(String change_no) {
        this.change_no = change_no;
    }

    public String getChange_no() {
        return change_no;
    }
}
