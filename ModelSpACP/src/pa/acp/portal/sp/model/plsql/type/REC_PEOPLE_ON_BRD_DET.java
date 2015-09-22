package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
public class REC_PEOPLE_ON_BRD_DET implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String seq;
    private String pob_pob_seq;
    private String actvty_reas;
    private REC_PORT_DATE_INFO unport_of_emb;
    private REC_PORT_DATE_INFO unport_of_disemb;
    private String change_no;


    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setPob_pob_seq(String pob_pob_seq) {
        this.pob_pob_seq = pob_pob_seq;
    }

    public String getPob_pob_seq() {
        return pob_pob_seq;
    }

    public void setActvty_reas(String actvty_reas) {
        this.actvty_reas = actvty_reas;
    }

    public String getActvty_reas() {
        return actvty_reas;
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

    public void setChange_no(String change_no) {
        this.change_no = change_no;
    }

    public String getChange_no() {
        return change_no;
    }
}
