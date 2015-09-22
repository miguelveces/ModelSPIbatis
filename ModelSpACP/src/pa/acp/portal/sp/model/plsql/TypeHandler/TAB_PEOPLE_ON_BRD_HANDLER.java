package pa.acp.portal.sp.model.plsql.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Timestamp;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import pa.acp.portal.sp.model.plsql.type.REC_CNTRY_FLAG;
import pa.acp.portal.sp.model.plsql.type.REC_PEOPLE_ON_BRD;
import pa.acp.portal.sp.model.plsql.type.REC_PEOPLE_ON_BRD_DET;
import pa.acp.portal.sp.model.plsql.type.REC_PORT_DATE_INFO;
import pa.acp.portal.sp.model.plsql.type.REC_TXN_SUB_DET;
import pa.acp.portal.sp.model.plsql.type.REC_UN_PORT;
import pa.acp.portal.sp.model.plsql.type.TAB_PEOPLE_ON_BRD;
import pa.acp.portal.sp.model.plsql.type.TAB_PEOPLE_ON_BRD_DET;
import oracle.jdbc.OracleConnection;

import oracle.sql.ARRAY;
import oracle.sql.StructDescriptor;
/**
 *
 * @author lalince
 */
public class TAB_PEOPLE_ON_BRD_HANDLER implements TypeHandler<Object> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i,
                             Object object, JdbcType jdbcType) {
        
        try
        {
        TAB_PEOPLE_ON_BRD tabPeapleOnBrd =(TAB_PEOPLE_ON_BRD)object;
               OracleConnection connection = (OracleConnection) preparedStatement.getConnection();
                String   userName =  connection.getMetaData().getUserName().trim();
               StructDescriptor structDescriptor = StructDescriptor.createDescriptor(userName + ".TAB_PEOPLE_ON_BRD", connection);           
            Object[] params = new Object[15];
        }
        catch (Exception e) {
               System.out.println("Audit_itemType: "+e);
               }
    }

    @Override
    public Object getResult(ResultSet resultSet, String string) {
        return null;
    }

    @Override
    public Object getResult(ResultSet resultSet, int i) {
        return null;
    }

    @Override
    public Object getResult(CallableStatement cs,
                            int columnIndex) throws SQLException {
        
        
        TAB_PEOPLE_ON_BRD peoplelist = new TAB_PEOPLE_ON_BRD();
        
        Object[] structArray = (Object[])cs.getArray(columnIndex).getArray();
        oracle.sql.STRUCT mystruct = null;
        
        for (Object structObj : structArray) {
            REC_PEOPLE_ON_BRD people = new REC_PEOPLE_ON_BRD();
            mystruct = (oracle.sql.STRUCT)structObj;
            Object[] structAttr = mystruct.getAttributes();
            people.setPob_seq("" + structAttr[0]);
            people.setFirst_name("" + structAttr[2]);
            people.setMiddle_name("" + structAttr[3]);
            people.setLast_name("" + structAttr[4]);
            people.setSecond_last_name("" + structAttr[5]);
            people.setBirthday((Timestamp)structAttr[6]);
            people.setId(""+structAttr[7]);
            people.setId_typ(""+structAttr[8]);
            people.setDisposition(""+structAttr[9]);
            people.setExcl_reas(""+structAttr[10]);
            people.setMsvi_seq(""+structAttr[11]);
            people.setCdt_cd(""+structAttr[12]);
            people.setUcd_seq(""+structAttr[13]);

            
            Object ww =(oracle.sql.STRUCT)structAttr[14];
            REC_CNTRY_FLAG birthplace_country = new REC_CNTRY_FLAG();
            oracle.sql.STRUCT mystruct2 = (oracle.sql.STRUCT) ww;
            Object[] structAttr2 = mystruct2.getAttributes();  
            
            
            
            //Object[] structAttr2 = (Object[])structAttr[14];
            birthplace_country.setSeq(""+structAttr2[0]);
            birthplace_country.setCd(""+structAttr2[1]);
            birthplace_country.setUn_iso_no(""+structAttr2[2]);
            birthplace_country.setIso2alpha_cd(""+structAttr2[3]);
            birthplace_country.setNationality(""+structAttr2[4]);
            birthplace_country.setDescr(""+structAttr2[5]);
            birthplace_country.setActive(""+structAttr2[6]);
            birthplace_country.setUn_code_ind(""+structAttr2[7]);
            people.setBirthplace_country(birthplace_country);
            //REC_CNTRY_FLAG birthplace_country end
           
            //REC_CNTRY_FLAG nationality  ini
            Object strucArrayFlag =(oracle.sql.STRUCT)structAttr[15];
            REC_CNTRY_FLAG nationality = new REC_CNTRY_FLAG();
            oracle.sql.STRUCT mystruct4 = (oracle.sql.STRUCT) strucArrayFlag;
            Object[] structAttr3 = mystruct4.getAttributes();

            nationality.setSeq(""+structAttr3[0]);
            nationality.setCd(""+structAttr3[1]);
            nationality.setUn_iso_no(""+structAttr3[2]);
            nationality.setIso2alpha_cd(""+structAttr3[3]);
            nationality.setNationality(""+structAttr3[4]);
            nationality.setDescr(""+structAttr3[5]);
            nationality.setActive(""+structAttr3[6]);
            nationality.setUn_code_ind(""+structAttr3[7]);
            people.setBirthplace_country(nationality);
            //REC_CNTRY_FLAG nationality end
            
            //REC_PORT_DATE_INFO unport_of_emb  ini          
            Object strucArrayUnportinf =(oracle.sql.STRUCT)structAttr[16];
            REC_PORT_DATE_INFO unport_of_emb = new REC_PORT_DATE_INFO();
            oracle.sql.STRUCT mystruct5 = (oracle.sql.STRUCT) strucArrayUnportinf;
            Object[] structAttr4 = mystruct5.getAttributes();
             //REC_UN_PORT the_port  ini
               // REC_UN_PORT the_port =new REC_UN_PORT();
                //Object[] structAttr4_1 = (Object[])structAttr4[0];
            
            Object strucArrayUnport =(oracle.sql.STRUCT)structAttr4[0];
            REC_UN_PORT the_port =new REC_UN_PORT();
            oracle.sql.STRUCT mystruct5_1 = (oracle.sql.STRUCT) strucArrayUnport;
            Object[] structAttr4_1 = mystruct5_1.getAttributes();
  
                the_port.setSeq(""+structAttr4_1[0]);
                the_port.setCd(""+structAttr4_1[1]);
                the_port.setName(""+structAttr4_1[2]);
                the_port.setUcf_seq(""+structAttr4_1[3]);
                the_port.setCoord(""+structAttr4_1[4]);
                the_port.setActive(""+structAttr4_1[5]);
                the_port.setUcf_iso2alpha_cd(""+structAttr4_1[6]);
                the_port.setUcf_descr(""+structAttr4_1[7]);
                //REC_UN_PORT the_port  end
              
            unport_of_emb.setThe_port(the_port);
            unport_of_emb.setThe_date((Timestamp)structAttr4[1]);
            people.setUnport_of_emb(unport_of_emb);
            //REC_PORT_DATE_INFO unport_of_emb  end

            
            //TAB_PEOPLE_ON_BRD_DET people_on_brd_det  ini
            TAB_PEOPLE_ON_BRD_DET people_on_brd_det = new TAB_PEOPLE_ON_BRD_DET();
            
             oracle.sql.ARRAY peapleonbrdDet = (oracle.sql.ARRAY)structAttr[18];
            
            oracle.sql.STRUCT strucPeaploOnBrdDetArr = null;
            Object[] detalle  = (Object[]) peapleonbrdDet.getArray();
           
      
             for (Object structObj2 : detalle) {
                    REC_PEOPLE_ON_BRD_DET    peopledet =new REC_PEOPLE_ON_BRD_DET();
                    strucPeaploOnBrdDetArr = (oracle.sql.STRUCT)structObj2;
                    Object[] strucPeaploOnBrdDetArr_det = strucPeaploOnBrdDetArr.getAttributes();
                    peopledet.setSeq(""+strucPeaploOnBrdDetArr_det[0]);
                    peopledet.setPob_pob_seq(""+strucPeaploOnBrdDetArr_det[1]);
                    peopledet.setActvty_reas(""+strucPeaploOnBrdDetArr_det[2]);
                    
                   //REC_PORT_DATE_INFO unport_of_embdet ini
                    
                    Object strucArrayUnportOfEmbar =(oracle.sql.STRUCT)strucPeaploOnBrdDetArr_det[3];
                    REC_PORT_DATE_INFO unport_of_embdet = new REC_PORT_DATE_INFO();
                    oracle.sql.STRUCT strucUnportOfEmbdet = (oracle.sql.STRUCT) strucArrayUnportOfEmbar;
                    Object[] structUnportOfEmbdet = strucUnportOfEmbdet.getAttributes();
                    //REC_UN_PORT ini                  
                    Object strucArrayUnportDet =(oracle.sql.STRUCT)structUnportOfEmbdet[0];
                    REC_UN_PORT unport = new REC_UN_PORT();
                    oracle.sql.STRUCT strucUnportDet = (oracle.sql.STRUCT) strucArrayUnportDet;
                    Object[] structUnportbDetAtt = strucUnportDet.getAttributes();
                    unport.setSeq(""+structUnportbDetAtt[0]);
                    unport.setCd(""+structUnportbDetAtt[1]);
                    unport.setName(""+structUnportbDetAtt[2]);
                    unport.setUcf_descr(""+structUnportbDetAtt[3]);
                    unport.setCoord(""+structUnportbDetAtt[4]);
                    unport.setActive(""+structUnportbDetAtt[5]);
                    unport.setUcf_iso2alpha_cd(""+structUnportbDetAtt[6]);
                    unport.setUcf_descr(""+structUnportbDetAtt[7]);
                    unport_of_embdet.setThe_port(unport);                    
                    //REC_UN_PORT fin
                    unport_of_embdet.setThe_date((Timestamp) structUnportOfEmbdet[1]);
                    peopledet.setUnport_of_emb(unport_of_embdet);
                    
                     //REC_PORT_DATE_INFO unport_of_desdet ini
                    
                    Object strucArrayUnportOfDesbar =(oracle.sql.STRUCT)strucPeaploOnBrdDetArr_det[4];
                    REC_PORT_DATE_INFO unport_of_desbdet = new REC_PORT_DATE_INFO();
                    oracle.sql.STRUCT strucUnportOfdesdet = (oracle.sql.STRUCT) strucArrayUnportOfDesbar;
                    Object[] structUnportOfdesdet = strucUnportOfdesdet.getAttributes();
                      //REC_UN_PORT ini                  
                    Object strucArrayUnportDesDet =(oracle.sql.STRUCT)structUnportOfdesdet[0];
                    REC_UN_PORT unportDes = new REC_UN_PORT();
                    oracle.sql.STRUCT strucUnportDesDet = (oracle.sql.STRUCT) strucArrayUnportDesDet;
                    Object[] structUnportbDesDetAtt = strucUnportDesDet.getAttributes();
                    unportDes.setSeq(""+structUnportbDesDetAtt[0]);
                    unportDes.setCd(""+structUnportbDesDetAtt[1]);
                    unportDes.setName(""+structUnportbDesDetAtt[2]);
                    unportDes.setUcf_descr(""+structUnportbDesDetAtt[3]);
                    unportDes.setCoord(""+structUnportbDesDetAtt[4]);
                    unportDes.setActive(""+structUnportbDesDetAtt[5]);
                    unportDes.setUcf_iso2alpha_cd(""+structUnportbDesDetAtt[6]);
                    unportDes.setUcf_descr(""+structUnportbDesDetAtt[7]);
                    unport_of_desbdet.setThe_port(unportDes);                    
                    //REC_UN_PORT fin
                    
                    unport_of_desbdet.setThe_date((Timestamp) structUnportOfdesdet[1]);
                    peopledet.setUnport_of_emb(unport_of_desbdet);
                    
                      peopledet.setChange_no(""+strucPeaploOnBrdDetArr_det[5]);
                    people_on_brd_det.add(peopledet);
                }
           
            
            peoplelist.add(people);
        }
        return peoplelist;
    }
}
