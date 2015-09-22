package pa.acp.portal.sp.model.plsql.mappers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface SP_CustomSqlQueries_Mapper {
    
    @Transactional(timeout = 60)
    public List<HashMap<String,Object>> GetHarmonizedCodes(Map<String, Object> params);
    
    @Transactional(timeout = 60)     
    public void GetTxnStatVal(Map<String, Object> params);
}
