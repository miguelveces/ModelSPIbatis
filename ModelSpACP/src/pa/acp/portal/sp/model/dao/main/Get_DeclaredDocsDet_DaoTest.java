/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.acp.portal.sp.model.dao.main;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pa.acp.portal.sp.model.dao.interfaces.Get_DeclaredDocsDet_DaoI;
import pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM;
import pa.acp.portal.sp.model.plsql.type.REC_ERROR_MESSAGE;
import pa.acp.portal.sp.model.plsql.type.REC_TXN_SUB_DET;
import pa.acp.portal.sp.model.plsql.type.REC_VISIB_DET;
import pa.acp.portal.sp.model.plsql.type.REC_VSL_COND;
import pa.acp.portal.sp.model.plsql.type.TAB_PEOPLE_ON_BRD;

/**
 *
 * @author lalince
 */
public class Get_DeclaredDocsDet_DaoTest {
            @Autowired
    Get_DeclaredDocsDet_DaoI get_DeclaredDocsDet_Dao;
            
   public void testGetVisibInfo() {
        //fail("Unimplemented");
        
        REC_AUDIT_ITEM audit = new REC_AUDIT_ITEM();
        //audit.setTransaction_id("3a5699d3-6eaf-4c16-9c83-57243dff7516");
        //audit.setTransaction_date("29082008");
        
        Date today = new Date();
        long time = today.getTime();
        
        //audit.setTransaction_date( new Timestamp(time));
        
        audit.setUser_id("usuario1");
        audit.setUser_company("MAERSK");        
        audit.setUser_group("CUSTOMER");
        audit.setUser_roles("dash_Visit_Transaction_Query;visit_Update;visit_Create;visit_VisitHistory;visit_DeleteDraft;parsing");
        audit.setSource_application("SERVICE-PORTAL");
        audit.setChannel("WEB");
        audit.setLanguage_code("EN");
        audit.setService_name("Visibility");
        audit.setService_operation("Visibility");
        audit.setOperation_type("GET");
        //audit.setBiz_transaction_id("21652");
        audit.setError_message(new ArrayList<REC_ERROR_MESSAGE>());
        REC_TXN_SUB_DET recTxnSubDet = new REC_TXN_SUB_DET();
        recTxnSubDet.setVo_seq("1437");
        REC_VISIB_DET recVisibDet;
        
        String dato = new String();
        
        Map<String, Object> params = get_DeclaredDocsDet_Dao.getVisibInfo(audit, recTxnSubDet, dato,"1480");
        recVisibDet= (REC_VISIB_DET)params.get("p_visib_det_out");
        System.out.println("BLIND_DIST_CP1_TRN: "+recVisibDet.getBlind_dist_cp1_trn());
        System.out.println("BLIND_DIST_CP2_TRN: "+recVisibDet.getBlind_dist_cp2_trn());
        System.out.println("BLIND_DIST_CP3_TRN: "+recVisibDet.getBlind_dist_cp3_trn());
        System.out.println("AIS_OPER_IND: "+recVisibDet.getAis_oper_ind());        
        System.out.println("TRN_VISIB_CALC_METH: "+recVisibDet.getTrn_visib_calc_meth());        
        
       
    } 
      public void testGetVslCondInfo() {
        //fail("Unimplemented");
        
        REC_AUDIT_ITEM audit = new REC_AUDIT_ITEM();
        audit.setTransaction_id("d4dd2589-9c5b-4e34-987f-ba5e0aa30b12");
        //audit.setTransaction_date("29082008");
        
        Date today = new Date();
        long time = today.getTime();
        
        audit.setTransaction_date( new Timestamp(time));
        
        audit.setUser_id("usuario1");
        audit.setUser_company("MAERSK");        
        audit.setUser_group("CUSTOMER");
        audit.setUser_roles("dash_Visit_Transaction_Query;visit_Update;visit_Create;visit_VisitHistory;visit_DeleteDraft;parsing");
        audit.setSource_application("SERVICE-PORTAL");
        audit.setChannel("WEB");
        audit.setLanguage_code("EN");
        audit.setService_name("Visibility");
        audit.setService_operation("Visibility");
        audit.setOperation_type("GET");
        audit.setBiz_transaction_id("21455");
        audit.setError_message(new ArrayList<REC_ERROR_MESSAGE>());
        REC_TXN_SUB_DET recTxnSubDet = new REC_TXN_SUB_DET();
        recTxnSubDet.setVo_seq("1268");
        REC_VSL_COND recVslcond;
        
        String msrseq = new String();
        String msrgrpseq = "1359";
        
        Map<String, Object> params = get_DeclaredDocsDet_Dao.getVslCondInfo(audit, recTxnSubDet, msrseq, msrgrpseq);
        recVslcond = (REC_VSL_COND)params.get("p_list_out_vsl_cond_out");
        
        System.out.println("SEQ: "+ recVslcond.getSeq());
        System.out.println("Ballast tank on board: "+recVslcond.getBallast_tanks_on_brd());
        System.out.println("Constant fuel : "+recVslcond.getConstant_fuel_consump());
        System.out.println("Diesel on board: "+recVslcond.getDiesel_oil_on_brd());        
        
        
    
    }
      
      
       public void testGetPeapleOnBrdInfo() {
        //fail("Unimplemented");
        
        REC_AUDIT_ITEM audit = new REC_AUDIT_ITEM();
        audit.setTransaction_id("d4dd2589-9c5b-4e34-987f-ba5e0aa30b12");
        //audit.setTransaction_date("29082008");
        
        Date today = new Date();
        long time = today.getTime();
        
        audit.setTransaction_date( new Timestamp(time));
        
        audit.setUser_id("usuario1");
        audit.setUser_company("MAERSK");        
        audit.setUser_group("CUSTOMER");
        audit.setUser_roles("dash_Visit_Transaction_Query;visit_Update;visit_Create;visit_VisitHistory;visit_DeleteDraft;parsing");
        audit.setSource_application("SERVICE-PORTAL");
        audit.setChannel("WEB");
        audit.setLanguage_code("EN");
        audit.setService_name("Passenger");
        audit.setService_operation("Passenger");
        audit.setOperation_type("GET");
        audit.setBiz_transaction_id("21856");
        audit.setError_message(new ArrayList<REC_ERROR_MESSAGE>());
        REC_TXN_SUB_DET recTxnSubDet = new REC_TXN_SUB_DET();
        recTxnSubDet.setVo_seq("1468");
       
        
        
        
        TAB_PEOPLE_ON_BRD tabPeapleOnBrd ;//= new TAB_PEOPLE_ON_BRD();
        
       /// tabPeapleOnBrd.add(recpeapleonbrd);

        Map<String, Object> params = get_DeclaredDocsDet_Dao.getPeapleOnBoredCrlInfo(audit, recTxnSubDet);                
        tabPeapleOnBrd = (TAB_PEOPLE_ON_BRD)params.get("p_list_out_PEOPLE_ON_BRD");        
        System.out.println("First_name: "+ tabPeapleOnBrd.get(0).getFirst_name());
        System.out.println("Birthday: "+tabPeapleOnBrd.get(0).getBirthday());
        System.out.println("Last NAme : "+tabPeapleOnBrd.get(0).getLast_name());
        System.out.println("Nationality: "+tabPeapleOnBrd.get(0).getNationality());                             
    
    }    
       
    public static void main(String[] args) {
    ApplicationContext context =  new ClassPathXmlApplicationContext("/pa/acp/portal/sp/model/dao/main/applicationContextModel-Test.xml");
    Get_DeclaredDocsDet_DaoTest get= (Get_DeclaredDocsDet_DaoTest)context.getBean("getDaoTest"); 
    get.testGetPeapleOnBrdInfo();
    }
}
