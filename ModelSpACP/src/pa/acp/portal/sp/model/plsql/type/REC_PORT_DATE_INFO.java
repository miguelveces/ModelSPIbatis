package pa.acp.portal.sp.model.plsql.type;
/**
 *
 * @author lalince
 */
import java.sql.Timestamp;

public class REC_PORT_DATE_INFO implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private REC_UN_PORT the_port;
    private Timestamp the_date;


    public void setThe_port(REC_UN_PORT the_port) {
        this.the_port = the_port;
    }

    public REC_UN_PORT getThe_port() {
        return the_port;
    }

    public void setThe_date(Timestamp the_date) {
        this.the_date = the_date;
    }

    public Timestamp getThe_date() {
        return the_date;
    }
}
