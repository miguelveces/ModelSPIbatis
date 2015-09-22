package pa.acp.portal.sp.model.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import pa.acp.portal.sp.model.dao.interfaces.SP_CustomSqlQueries_DaoI;
import pa.acp.portal.sp.model.plsql.mappers.SP_CustomSqlQueries_Mapper;
import pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM;
import pa.acp.portal.sp.model.plsql.type.REC_TXN_SUB_DET;
import pa.acp.portal.sp.model.plsql.type.REC_VSL_COND;

@Component 
public class SP_CustomSqlQueries_Dao implements SP_CustomSqlQueries_DaoI {
    
    @Autowired
    SP_CustomSqlQueries_Mapper sp_CustomSqlQueries_Mapper;
    
    protected static Logger logger = Logger.getLogger(SP_CustomSqlQueries_Dao.class);
    
    public List<HashMap<String, Object>> getHarmonizedCodes(Integer classId, String descr) {
        
        logger.debug("Inicio de metodo getHarmonizedCodes");
        List<HashMap<String, Object>> listHarmonizedCodes = new ArrayList<HashMap<String, Object>>();
        Map<String,Object> params = new HashMap<String,Object>();
                
        try{
            params.put("classId", classId);
            params.put("descr",descr);
            
            listHarmonizedCodes = sp_CustomSqlQueries_Mapper.GetHarmonizedCodes(params);    
        } catch (Exception e){
            logger.error("Error en el metodo getVisibInfo. Error: ", e);
        }
        
        return listHarmonizedCodes;
    }
    
    public Map<String, Object>   getTxnStatVal(REC_AUDIT_ITEM recAuditItem, REC_TXN_SUB_DET recTxnSubDet)
    {  
            logger.debug("Inicio Metodo getVslCondInfo");
            Map<String, Object> params = new HashMap<String, Object>();
            try {
            
            params.put("p_audit_item_inout", recAuditItem);
            params.put("p_txn_sub_det_inout",recTxnSubDet);            
            
            sp_CustomSqlQueries_Mapper.GetTxnStatVal(params);
            
            
            } catch (Exception e) {
                   logger.error("Error en el metodo getVslCondInfo. Error: ", e);
                   System.out.println("userMapper "+ e);
               }
            return params;
        }
}
