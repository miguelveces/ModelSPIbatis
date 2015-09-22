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

import pa.acp.portal.sp.model.plsql.type.REC_DOC_REQ;
import pa.acp.portal.sp.model.plsql.type.REC_TXN_SUB_DET;
import pa.acp.portal.sp.model.plsql.type.REC_VISIT_ORDER;

public class REC_TXN_SUB_DET_HANDLER implements TypeHandler<Object>{
    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) {
        try {
            
        REC_TXN_SUB_DET txtsub =(REC_TXN_SUB_DET)parameter;
        OracleConnection connection = (OracleConnection) ps.getConnection();
         String   userName =  connection.getMetaData().getUserName().trim();
        StructDescriptor structDescriptor = StructDescriptor.createDescriptor(userName + ".REC_TXN_SUB_DET", connection);
            Object[] params = new Object[15];
            params[0]=txtsub.getTxn_no();
            params[1]=txtsub.getTxn_typ();
            params[2]=txtsub.getTxn_status();
            params[3]=txtsub.getTxn_status_date();
            params[4]=txtsub.getTxn_status_user_id();
            params[5]=txtsub.getSvc_order_no();
            params[6]=txtsub.getVo_seq();
            params[7]=txtsub.getVisitorder();
            params[8]=txtsub.getDocreq();
            params[9]=txtsub.getStatusdescription();
            params[10]=txtsub.getSubmit_info();
            params[11]=txtsub.getSync_status();
            params[12]=txtsub.getSync_tries();
            params[13]=txtsub.getSync_message();
            params[14]=txtsub.getChange_no();
            STRUCT struct = new STRUCT(structDescriptor,
            ps.getConnection(), params);
            ps.setObject(i, struct);
          
          } catch (Exception e) {
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
    public Object getResult(CallableStatement cs, int columnIndex)throws SQLException {
        Object structArray =(Object)cs.getObject(columnIndex);
        REC_TXN_SUB_DET txtsub = new REC_TXN_SUB_DET();
        oracle.sql.STRUCT mystruct = null;
        mystruct = (oracle.sql.STRUCT) structArray;
        Object[] structAttr = mystruct.getAttributes();  
        txtsub.setTxn_no(""+structAttr[0]);
        txtsub.setTxn_typ(""+structAttr[1]);
        txtsub.setTxn_status(""+structAttr[2]);
        txtsub.setTxn_status_date(""+structAttr[3]);
        txtsub.setTxn_status_user_id(""+structAttr[4]);
        txtsub.setSvc_order_no(""+structAttr[5]);
        txtsub.setVo_seq(""+structAttr[6]);
        txtsub.setVisitorder(new REC_VISIT_ORDER());
        txtsub.setDocreq(new REC_DOC_REQ());
        txtsub.setStatusdescription(""+structAttr[9]);
        txtsub.setSubmit_info(""+structAttr[10]);
        txtsub.setSync_status(""+structAttr[11]);
        txtsub.setSync_tries(""+structAttr[12]);
        txtsub.setSync_message(""+structAttr[13]);
        txtsub.setChange_no(""+structAttr[14]);
        return txtsub;
    }
}
