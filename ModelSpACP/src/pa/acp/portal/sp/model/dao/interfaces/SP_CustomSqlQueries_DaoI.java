package pa.acp.portal.sp.model.dao.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM;
import pa.acp.portal.sp.model.plsql.type.REC_TXN_SUB_DET;

public interface SP_CustomSqlQueries_DaoI {
    
    public List<HashMap<String,Object>> getHarmonizedCodes(Integer classId, String descr);
    public Map<String, Object>   getTxnStatVal(REC_AUDIT_ITEM recAuditItem, REC_TXN_SUB_DET recTxnSubDet);
}
