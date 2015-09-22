package pa.acp.portal.sp.model.plsql.TypeHandler;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import oracle.jdbc.OracleConnection;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM;
import pa.acp.portal.sp.model.plsql.type.REC_ERROR_MESSAGE;

/**
 *
 * @author lalince
 */
public class REC_AUDIT_ITEM_HANDLER implements TypeHandler<Object>{

    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        try {
            
        REC_AUDIT_ITEM audit = (REC_AUDIT_ITEM)parameter;
        List<REC_ERROR_MESSAGE> error=audit.getError_message();
        OracleConnection connection = (OracleConnection) ps.getConnection();
        String   userName =  connection.getMetaData().getUserName().trim();
        StructDescriptor structDescriptor = StructDescriptor
                .createDescriptor(userName + ".REC_AUDIT_ITEM", connection);
        StructDescriptor structDescriptor2 = StructDescriptor
                .createDescriptor(userName + ".REC_ERROR_MESSAGE", connection);
        STRUCT[] structs = null;
        structs = new STRUCT[error.size()];
        for (int index = 0; index < error.size(); index++) 
        {
        REC_ERROR_MESSAGE err =error.get(index);
        Object[] param = new Object[4];
        param[0]=  err.getCode() ;
        param[1]=  err.getDescription() ;
        param[2]=  err.getRow_number() ;
        param[3]=  err.getError_type();
        STRUCT struct = new STRUCT(structDescriptor2,
                    ps.getConnection(), param);
            structs[index] = struct;
        }
       ArrayDescriptor desc = ArrayDescriptor.createDescriptor(
        userName+".TAB_ERROR_MESSAGE", ps.getConnection());
        ARRAY oracleArray = new ARRAY(desc, ps.getConnection(), structs);
        
         Object[] params = new Object[22];
        params[0]=  audit.getTransaction_id() ;
        params[1]=  audit.getTransaction_date() ;
        params[2]=  audit.getUser_id() ;
        params[3]=  audit.getUser_company();
        params[4]=  audit.getUser_group() ;
        params[5]=   audit.getUser_roles();
        params[6]=  audit.getSource_ip_address() ;
        params[7]=   audit.getSource_application();
        params[8]=   audit.getChannel();
        params[9]=   audit.getLanguage_code();
        params[10]= audit.getService_name() ;
        params[11]=  audit.getService_operation();
        params[12]=  audit.getOperation_type();
        params[13]=  audit.getBiz_transaction_id();
        params[14]=  audit.getOrchestration_step();
        params[15]=  audit.getPage_size();
        params[16]=  audit.getPage_number();
        params[17]=  audit.getSort_index();
        params[18]=  audit.getSort_type();
        params[19]=  audit.getCompensation_indicator();
        params[20]=  audit.getOperation_success();
        params[21]=  oracleArray;
         STRUCT struct2 = new STRUCT(structDescriptor,
                    ps.getConnection(), params);
         ps.setObject(i, struct2);
            
            
            } catch (Exception e) {
            System.out.println("Audit_itemType: "+e);
        }
    }

    @Override
    public Object getResult(ResultSet rs, String string) throws SQLException {
          try {
              
              System.out.println("getResult(ResultSet rs, String string) : "); 
           } catch (Exception e) {
            System.out.println("Audit_itemType: "+e);
        }
        return null;
    }

    @Override
    public Object getResult(ResultSet rs, int i) throws SQLException {
         try {
              
             System.out.println("getResult(ResultSet rs, int i) : "); 
           } catch (Exception e) {
            System.out.println("Audit_itemType: "+e);
        }
       return null;
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
        Object structArray =(Object)cs.getObject(columnIndex);
      pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM audit = new pa.acp.portal.sp.model.plsql.type.REC_AUDIT_ITEM();
        oracle.sql.STRUCT mystruct = null;
        mystruct = (oracle.sql.STRUCT) structArray;
           Object[] structAttr = mystruct.getAttributes();  
       System.out.println("structAttr: "+structAttr[15]);
           audit.setPage_number(""+structAttr[15]);
    
       return audit;
    }
    
}
