package pa.acp.portal.sp.model.dao.interfaces;
/**
 *
 * @author lalince
 */
import java.util.Map;

import pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM;
import pa.acp.portal.sp.model.plsql.type.REC_TXN_SUB_DET;

import pa.acp.portal.sp.model.plsql.type.TAB_PEOPLE_ON_BRD;
public interface Get_DeclaredDocsDet_DaoI {
    

    public Map<String, Object>  getVisibInfo(REC_AUDIT_ITEM recAuditItem, REC_TXN_SUB_DET recTxnSubDet, String msrseq, String msrgrpseq);
    
    public Map<String, Object>  getVslCondInfo(REC_AUDIT_ITEM recAuditItem, REC_TXN_SUB_DET recTxnSubDet, String msrseq,
                                               String msrgrpseq);
    //people on bored
    
    public Map<String, Object>  getPeapleOnBoredCrlInfo(REC_AUDIT_ITEM recAuditItem, REC_TXN_SUB_DET recTxnSubDet);
   
    public Map<String, Object>  getPeapleOnBoredPglInfo(REC_AUDIT_ITEM recAuditItem, REC_TXN_SUB_DET recTxnSubDet);
}