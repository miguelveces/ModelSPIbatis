package pa.acp.portal.sp.model.plsql.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import oracle.jdbc.OracleConnection;

import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import pa.acp.portal.sp.model.plsql.type.REC_VISIB_DET;
import pa.acp.portal.sp.model.plsql.type.REC_VSL_COND;

public class REC_VSL_COND_HANDLER implements TypeHandler<Object>{ 
    
    public REC_VSL_COND_HANDLER() {
        super();
    }
    @Override
    public void setParameter(PreparedStatement ps, int i,
                             Object parameter, JdbcType jdbcType) {
    try
        {
        REC_VSL_COND vslc =(REC_VSL_COND)parameter;
        OracleConnection connection = (OracleConnection) ps.getConnection();
        String   userName =  connection.getMetaData().getUserName().trim();
        StructDescriptor structDescriptor = StructDescriptor.createDescriptor(userName + ".REC_VSL_COND", connection);
        Object[] params = new Object[13];
        params[0]=vslc.getSeq();
        params[1]=vslc.getFuel_oil_on_brd();
        params[2]=vslc.getDiesel_oil_on_brd();
        params[3]=vslc.getLube_oil_on_brd();
        params[4]=vslc.getFw_on_brd();
        params[5]=vslc.getBallast_tanks_on_brd();
        params[6]=vslc.getMiscs_weight_on_brd();
        params[7]=vslc.getConstant_fuel_consump();
        params[8]=vslc.getProvision_cgo_on_brd();
        params[9]=vslc.getLpg_cool_qty();        
        params[10]=vslc.getSalt_qty();
        params[11]=vslc.getMsvi_seq();
        params[12]=vslc.getChange_no();
        STRUCT struct = new STRUCT(structDescriptor,
        ps.getConnection(), params);
        ps.setObject(i, struct);
        }
        catch (SQLException e) {
               }
        
    }
    

    public Object getResult(ResultSet resultSet, String string) {
        return null;
    }

    public Object getResult(ResultSet resultSet, int i) {
        return null;
    }
    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
        
        Object structArray =(Object)cs.getObject(columnIndex);
        REC_VSL_COND vslc = new REC_VSL_COND ();
        oracle.sql.STRUCT mystruct = null;
        mystruct = (oracle.sql.STRUCT) structArray;
        Object[] structAttr = mystruct.getAttributes(); 
        vslc.setSeq(""+structAttr[0]);
        vslc.setFuel_oil_on_brd(""+structAttr[1]);
        vslc.setDiesel_oil_on_brd(""+structAttr[2]);
        vslc.setLube_oil_on_brd(""+structAttr[3]);
        vslc.setFw_on_brd(""+structAttr[4]);
        vslc.setBallast_tanks_on_brd(""+structAttr[5]);
        vslc.setMiscs_weight_on_brd(""+structAttr[6]);
        vslc.setConstant_fuel_consump(""+structAttr[7]);
        vslc.setProvision_cgo_on_brd(""+structAttr[8]);
        vslc.setLpg_cool_qty(""+structAttr[9]);
        vslc.setSalt_qty(""+structAttr[10]);
        vslc.setMsvi_seq(""+structAttr[11]);
        vslc.setChange_no(""+structAttr[12]);
      
        return vslc;
        
    }
}
