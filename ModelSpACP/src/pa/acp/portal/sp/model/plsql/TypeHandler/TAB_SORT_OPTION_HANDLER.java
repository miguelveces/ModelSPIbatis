package pa.acp.portal.sp.model.plsql.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleConnection;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import pa.acp.portal.sp.model.plsql.type.REC_SORT_OPTION;
import pa.acp.portal.sp.model.plsql.type.TAB_SORT_OPTION;

/**
 *
 * @author lalince
 */
public class TAB_SORT_OPTION_HANDLER implements TypeHandler<Object>{

    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
  
        try {
         TAB_SORT_OPTION obtion = (TAB_SORT_OPTION) parameter;
        OracleConnection connection = (OracleConnection) ps.getConnection();
        String   userName =  connection.getMetaData().getUserName().trim();
        StructDescriptor structDescriptor = StructDescriptor
                .createDescriptor(userName + ".REC_SORT_OPTION", connection);
        STRUCT[] structs = null;
        structs = new STRUCT[obtion.size()];
        for (int index = 0; index < obtion.size(); index++) 
        {
         REC_SORT_OPTION tabOb = obtion.get(index);
        Object[] params = new Object[5];
         params[0] = tabOb.getSort_index();
         params[1] = tabOb.getSort_name();
         params[2] = tabOb.getSort_column();
         params[3] = tabOb.getSelected();
         params[4] = tabOb.getSort_type();
         STRUCT struct = new STRUCT(structDescriptor,
                    ps.getConnection(), params);
            structs[index] = struct;
        }
                
        ArrayDescriptor desc = ArrayDescriptor.createDescriptor(
        userName+".TAB_SORT_OPTION", ps.getConnection());
        ARRAY oracleArray = new ARRAY(desc, ps.getConnection(), structs);
        ps.setArray(i, oracleArray);
         } catch (Exception e) {
            System.out.println("Sort_optionType: "+e);
        }
    }

    @Override
    public Object getResult(ResultSet rs, String string) throws SQLException {
        try {
              
             System.out.println("Sort_optionType  getResult(ResultSet rs, String string) : "); 
           } catch (Exception e) {
            System.out.println("Audit_itemType: "+e);
        }
        return null;
    }

    @Override
    public Object getResult(ResultSet rs, int i) throws SQLException {
         try {
              
             System.out.println("Sort_optionType  getResult(ResultSet rs, int i)  : "); 
           } catch (Exception e) {
            System.out.println("Audit_itemType: "+e);
        }
        return null;
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
         TAB_SORT_OPTION obtion = new  TAB_SORT_OPTION();
        Object[] structArray = (Object[]) cs.getArray(columnIndex).getArray();
        oracle.sql.STRUCT mystruct = null;
        for (Object structObj : structArray) {
        REC_SORT_OPTION tabOb = new  REC_SORT_OPTION();
        mystruct = (oracle.sql.STRUCT) structObj;
        Object[] structAttr = mystruct.getAttributes();
        tabOb.setSort_index((String) structAttr[0]);
        tabOb.setSort_name((String) structAttr[1]);
        tabOb.setSort_column((String) structAttr[2]);
        tabOb.setSelected((String) structAttr[3]);
        tabOb.setSort_type((String) structAttr[4]);
        obtion.add(tabOb);
        }
        return obtion;
    }
    
}

