package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_DOC_REQ  implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private String doc_typ_cd     ;
     private String doc_descr      ;
     private String notice_hour    ;
     private String warning_hour   ;
     private String req_hour       ;
     private String alert_time     ;
     private String order_level_ind;
     private String svc_order_typ  ;


    public void setDoc_typ_cd(String doc_typ_cd) {
        this.doc_typ_cd = doc_typ_cd;
    }

    public String getDoc_typ_cd() {
        return doc_typ_cd;
    }

    public void setDoc_descr(String doc_descr) {
        this.doc_descr = doc_descr;
    }

    public String getDoc_descr() {
        return doc_descr;
    }

    public void setNotice_hour(String notice_hour) {
        this.notice_hour = notice_hour;
    }

    public String getNotice_hour() {
        return notice_hour;
    }

    public void setWarning_hour(String warning_hour) {
        this.warning_hour = warning_hour;
    }

    public String getWarning_hour() {
        return warning_hour;
    }

    public void setReq_hour(String req_hour) {
        this.req_hour = req_hour;
    }

    public String getReq_hour() {
        return req_hour;
    }

    public void setAlert_time(String alert_time) {
        this.alert_time = alert_time;
    }

    public String getAlert_time() {
        return alert_time;
    }

    public void setOrder_level_ind(String order_level_ind) {
        this.order_level_ind = order_level_ind;
    }

    public String getOrder_level_ind() {
        return order_level_ind;
    }

    public void setSvc_order_typ(String svc_order_typ) {
        this.svc_order_typ = svc_order_typ;
    }

    public String getSvc_order_typ() {
        return svc_order_typ;
    }
}
