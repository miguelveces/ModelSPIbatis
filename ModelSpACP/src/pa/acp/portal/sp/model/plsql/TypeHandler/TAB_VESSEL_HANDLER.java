package pa.acp.portal.sp.model.plsql.TypeHandler;

/**
 *
 * @author lalince
 */
//import com.llhcompany.dao.bean.TAB_VESSEL;

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

import pa.acp.portal.sp.model.Util.ConvertirNulosBlancos;
import pa.acp.portal.sp.model.plsql.type.REC_VESSEL;
import pa.acp.portal.sp.model.plsql.type.TAB_VESSEL;

public class TAB_VESSEL_HANDLER implements TypeHandler<Object> {

    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
   
    }

    @Override
    public Object getResult(ResultSet rs, String string) throws SQLException {
        
         return null;
    }

    @Override
    public Object getResult(ResultSet rs, int i) throws SQLException {
       
        return null;
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
       TAB_VESSEL veselList = new TAB_VESSEL();
        Object[] structArray = (Object[]) cs.getArray(columnIndex).getArray();
        oracle.sql.STRUCT mystruct = null;
        ConvertirNulosBlancos comver2 = new ConvertirNulosBlancos();
        for (Object structObj : structArray) {
        REC_VESSEL vessel = new REC_VESSEL();
        mystruct = (oracle.sql.STRUCT) structObj;
        Object[] structAttr = mystruct.getAttributes();
        vessel.setSeq(comver2.valueOf2(  structAttr[0]));
        vessel.setShip_no(comver2.valueOf2(  structAttr[1]));
        vessel.setShip_name(comver2.valueOf2(  structAttr[2]));
        vessel.setCall_letters(comver2.valueOf2(  structAttr[3]));
        vessel.setMetric_len_overall(comver2.valueOf2(  structAttr[4]));
        vessel.setMetric_extm_beam(comver2.valueOf2(  structAttr[5]));
        vessel.setImo_no(comver2.valueOf2(  structAttr[6]));
        vessel.setEmail(comver2.valueOf2(  structAttr[7]));
        vessel.setYear_built(comver2.valueOf2(  structAttr[8]));
        vessel.setSmall_craft_typ(comver2.valueOf2(  structAttr[9]));
        vessel.setSmall_craft_typ_desc(comver2.valueOf2(  structAttr[10]));
        vessel.setPre_ship_no(comver2.valueOf2(  structAttr[11]));
        vessel.setShip_typ(comver2.valueOf2(  structAttr[12]));
        vessel.setShip_typ_desc(comver2.valueOf2(  structAttr[13]));
        vessel.setFlag_cd(comver2.valueOf2(  structAttr[14]));
        vessel.setFlag_desc(comver2.valueOf2(  structAttr[15]));
        vessel.setBuilder(comver2.valueOf2(  structAttr[16]));
        vessel.setVsl_owner(comver2.valueOf2(  structAttr[17]));
        vessel.setHull_matrl(comver2.valueOf2(  structAttr[18]));
        vessel.setHull_matrl_desc(comver2.valueOf2(  structAttr[19]));
        vessel.setHull_color(comver2.valueOf2(  structAttr[20]));
        vessel.setHull_color_desc(comver2.valueOf2(  structAttr[21]));
        vessel.setSmall_craft_rmk(comver2.valueOf2(  structAttr[22]));
        vessel.setSmall_craft_speed_knot(comver2.valueOf2(  structAttr[23]));
        vessel.setChange_no(comver2.valueOf2(  structAttr[24]));
       // ConvertirNulosBlancos comver = new ConvertirNulosBlancos();
        //comver.SetBlancos(vessel);
        veselList.add(vessel);
        }
        return veselList;
    }
    
}

