package pa.acp.portal.sp.model.dao.impl;
/**
 *
 * @author lalince
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import pa.acp.portal.sp.model.dao.interfaces.Get_DeclaredDocsDet_DaoI;
import pa.acp.portal.sp.model.plsql.mappers.Get_DeclaredDocsDet_Mapper;
import pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM;
import pa.acp.portal.sp.model.plsql.type.REC_TXN_SUB_DET;
import pa.acp.portal.sp.model.plsql.type.REC_VISIB_DET;
import org.apache.log4j.Logger;

import pa.acp.portal.sp.model.plsql.type.REC_PEOPLE_ON_BRD;
import pa.acp.portal.sp.model.plsql.type.REC_VSL_COND;
import pa.acp.portal.sp.model.plsql.type.TAB_PEOPLE_ON_BRD;




@Component 
public class Get_DeclaredDocsDet_Dao implements Get_DeclaredDocsDet_DaoI {
    
    @Autowired
    Get_DeclaredDocsDet_Mapper get_DeclaredDocsDet_Mapper;
    protected static Logger logger = Logger.getLogger(Get_DeclaredDocsDet_Dao.class);
    
    public  Map<String, Object>  getVisibInfo(REC_AUDIT_ITEM recAuditItem,
                                              REC_TXN_SUB_DET recTxnSubDet,
                                              String msrseq,
                                              String msrgrpseq
                                             ) {
        
            logger.debug("Inicio Metodo getVisibInfo");
       Map<String, Object> params = new HashMap<String, Object>();
        try { 
           
            params.put("p_audit_item_inout", recAuditItem);
            params.put("p_txn_sub_det_inout",recTxnSubDet);
            params.put("p_msrseq_in", msrseq );
            params.put("p_msrgrpseq_in",msrgrpseq);            
            params.put("p_visib_det_out", new REC_VISIB_DET());
            get_DeclaredDocsDet_Mapper.GetVisibInfoMapper(params);
         
            
        } catch (Exception e) {
                   logger.error("Error en el metodo getVisibInfo. Error: ", e);
                   //System.out.println("userMapper "+ e);
               }
        return params;
        }

    public  Map<String, Object>  getVslCondInfo(REC_AUDIT_ITEM recAuditItem,
                                      REC_TXN_SUB_DET recTxnSubDet,
                                      String msrseq,
                                      String msrgrpseq) {
        
            logger.debug("Inicio Metodo getVslCondInfo");
       Map<String, Object> params = new HashMap<String, Object>();
        try { 
           
            params.put("p_audit_item_inout", recAuditItem);
            params.put("p_txn_sub_det_in",recTxnSubDet);
            params.put("p_msrseq_in", msrseq );
            params.put("p_msrgrpseq_in",msrgrpseq);
            params.put("p_list_out_vsl_cond_out", new REC_VSL_COND());
            get_DeclaredDocsDet_Mapper.GetVslConditionInfoMapper(params);
         
            
        } catch (Exception e) {
                   logger.error("Error en el metodo getVslCondInfo. Error: ", e);
                   System.out.println("userMapper "+ e);
               }
        return params;
        }



//people on brd


    public  Map<String, Object>  getPeapleOnBoredCrlInfo(REC_AUDIT_ITEM recAuditItem,
                                      REC_TXN_SUB_DET recTxnSubDet) {
        
            logger.debug("Inicio Metodo getPeapleOnBrdInfo");
       Map<String, Object> params = new HashMap<String, Object>();
        try { 
           
            params.put("p_audit_item_inout", recAuditItem);
            params.put("p_txn_sub_det_in",recTxnSubDet);
            //params.put("p_msrseq_in", msrseq );
            //params.put("p_msrgrpseq_in",msrgrpseq);
            
            TAB_PEOPLE_ON_BRD tabPeapleOnBrd = new TAB_PEOPLE_ON_BRD();
            REC_PEOPLE_ON_BRD recpeapleOnBrd = new REC_PEOPLE_ON_BRD();
            tabPeapleOnBrd.add(recpeapleOnBrd);
            params.put("p_list_out_PEOPLE_ON_BRD", tabPeapleOnBrd);
            get_DeclaredDocsDet_Mapper.GetPeapleOnBoredCrlMapper(params);
         
            
        } catch (Exception e) {
                   logger.error("Error en el metodo GetPeapleOnBoredCrlMapper. Error: ", e);
                   System.out.println("userMapper "+ e);
               }
        return params;
        }



    public  Map<String, Object>  getPeapleOnBoredPglInfo(REC_AUDIT_ITEM recAuditItem,
                                      REC_TXN_SUB_DET recTxnSubDet) {
        
            logger.debug("Inicio Metodo getPeapleOnBrdInfo");
       Map<String, Object> params = new HashMap<String, Object>();
        try { 
           
            params.put("p_audit_item_inout", recAuditItem);
            params.put("p_txn_sub_det_in",recTxnSubDet);
            //params.put("p_msrseq_in", msrseq );
            //params.put("p_msrgrpseq_in",msrgrpseq);
            
            TAB_PEOPLE_ON_BRD tabPeapleOnBrd = new TAB_PEOPLE_ON_BRD();
            REC_PEOPLE_ON_BRD recpeapleOnBrd = new REC_PEOPLE_ON_BRD();
            tabPeapleOnBrd.add(recpeapleOnBrd);
            params.put("p_list_out_PEOPLE_ON_BRD", tabPeapleOnBrd);
            get_DeclaredDocsDet_Mapper.GetPeapleOnBoredCrlMapper(params);
         
            
        } catch (Exception e) {
                   logger.error("Error en el metodo GetPeapleOnBoredCrlMapper. Error: ", e);
                   System.out.println("userMapper "+ e);
               }
        return params;
        }
    
}
