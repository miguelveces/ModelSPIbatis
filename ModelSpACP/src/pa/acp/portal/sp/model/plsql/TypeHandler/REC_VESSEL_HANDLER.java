package pa.acp.portal.sp.model.plsql.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleConnection;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import pa.acp.portal.sp.model.plsql.type.REC_VESSEL;

/**
 *
 * @author lalince
 */
public class REC_VESSEL_HANDLER implements TypeHandler<Object> {

    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
    try {
        REC_VESSEL vessel = (REC_VESSEL)parameter;  
        OracleConnection connection = (OracleConnection) ps.getConnection();
        String   userName =  connection.getMetaData().getUserName().trim();
        StructDescriptor structDescriptor = StructDescriptor
                .createDescriptor(userName + ".REC_VESSEL", connection);
        Object[] params = new Object[25];
        params[0]=vessel.getSeq();
        params[1]=vessel.getShip_no();
        params[2]=vessel.getShip_name();
        params[3]=vessel.getCall_letters();
        params[4]=vessel.getMetric_len_overall();
        params[5]=vessel.getMetric_extm_beam();
        params[6]=vessel.getImo_no();
        params[7]=vessel.getEmail();
        params[8]=vessel.getYear_built();
        params[9]=vessel.getSmall_craft_typ();
        params[10]=vessel.getSmall_craft_typ_desc();
        params[11]=vessel.getPre_ship_no();
        params[12]=vessel.getShip_typ();
        params[13]=vessel.getShip_typ_desc();
        params[14]=vessel.getFlag_cd();
        params[15]=vessel.getFlag_desc();
        params[16]=vessel.getBuilder();
        params[17]=vessel.getVsl_owner();
        params[18]=vessel.getHull_matrl();
        params[19]=vessel.getHull_matrl_desc();
        params[20]=vessel.getHull_color();
        params[21]=vessel.getHull_color_desc();
        params[22]=vessel.getSmall_craft_rmk();
        params[23]=vessel.getSmall_craft_speed_knot();
        params[24]=vessel.getChange_no();
        STRUCT struct = new STRUCT(structDescriptor,
        ps.getConnection(), params);
        ps.setObject(i, struct);
        } catch (Exception e) {
            System.out.println("Sort_optionType: "+e);
        } 
    }

    @Override
    public Object getResult(ResultSet rs, String string) throws SQLException {
          try {
              
             System.out.println("VesselType  getResult(ResultSet rs, String string) : "); 
           } catch (Exception e) {
            System.out.println("Audit_itemType: "+e);
        }
         return null;
    }

    @Override
    public Object getResult(ResultSet rs, int i) throws SQLException {
          try {
              
             System.out.println("VesselType  getResult(ResultSet rs, int i)  : "); 
           } catch (Exception e) {
            System.out.println("Audit_itemType: "+e);
        }
        return null;
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
       
        return null;
    }
    
}

