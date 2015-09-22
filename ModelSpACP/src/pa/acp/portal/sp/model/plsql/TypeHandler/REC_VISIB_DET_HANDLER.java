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

public class REC_VISIB_DET_HANDLER  implements TypeHandler<Object>{
    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) {
      
        
        try {
            REC_VISIB_DET vis =(REC_VISIB_DET)parameter;
            OracleConnection connection = (OracleConnection) ps.getConnection();
            String   userName =  connection.getMetaData().getUserName().trim();
            StructDescriptor structDescriptor = StructDescriptor.createDescriptor(userName + ".REC_VISIB_DET", connection);
            Object[] params = new Object[20];
            params[0]=vis.getSeq();
            params[1]=vis.getVisib_id();
            params[2]=vis.getSource();
            params[3]=vis.getVisib_ind();
            params[4]=vis.getLoad_ind();
            params[5]=vis.getBlind_dist_cp1_trn();
            params[6]=vis.getBlind_dist_cp2_trn();
            params[7]=vis.getBlind_dist_cp3_trn();
            params[8]=vis.getCph_for_trn();
            params[9]=vis.getCpl_for_trn();
            params[10]=vis.getTrn_visib_calc_meth();
            params[11]=vis.getFwd_anchor_gear_cond();
            params[12]=vis.getRadar_no1_oper();
            params[13]=vis.getRadar_no2_oper();
            params[14]=vis.getGyro_compas_work();
            params[15]=vis.getGyro_repeat_at_cp();
            params[16]=vis.getRmk();
            params[17]=vis.getAis_oper_ind();
            params[18]=vis.getMsvi_seq();
            params[19]=vis.getChange_no();
            STRUCT struct = new STRUCT(structDescriptor,
            ps.getConnection(), params);
            ps.setObject(i, struct);
           
           } catch (SQLException e) {
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
        REC_VISIB_DET vis = new REC_VISIB_DET();
        oracle.sql.STRUCT mystruct = null;
        mystruct = (oracle.sql.STRUCT) structArray;
        Object[] structAttr = mystruct.getAttributes(); 
        vis.setSeq(""+structAttr[0]);
        vis.setVisib_id(""+structAttr[1]);
        vis.setSource(""+structAttr[2]);
        vis.setVisib_ind(""+structAttr[3]);
        vis.setLoad_ind(""+structAttr[4]);
        vis.setBlind_dist_cp1_trn(""+structAttr[5]);
        vis.setBlind_dist_cp2_trn(""+structAttr[6]);
        vis.setBlind_dist_cp3_trn(""+structAttr[7]);
        vis.setCph_for_trn(""+structAttr[8]);
        vis.setCpl_for_trn(""+structAttr[9]);
        vis.setTrn_visib_calc_meth(""+structAttr[10]);
        vis.setFwd_anchor_gear_cond(""+structAttr[11]);
        vis.setRadar_no1_oper(""+structAttr[12]);
        vis.setRadar_no2_oper(""+structAttr[13]);
        vis.setGyro_compas_work(""+structAttr[14]);
        vis.setGyro_repeat_at_cp(""+structAttr[15]);
        vis.setRmk(""+structAttr[16]);
        vis.setAis_oper_ind(""+structAttr[17]);
        vis.setMsvi_seq(""+structAttr[18]);
        vis.setChange_no(""+structAttr[19]);
        
        return vis;
    }
}
