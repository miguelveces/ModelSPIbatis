package pa.acp.portal.sp.model.plsql.mappers;
/**
 *
 * @author lalince
 */
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface Get_DeclaredDocsDet_Mapper {
    
    @Transactional(timeout = 60)
    public void GetVisibInfoMapper(Map<String, Object> params);
  //  @Transactional(timeout = 60)
   // public void GetPglInfoMapper(Map<String, Object> params);
   @Transactional(timeout = 60)
   public void GetVslConditionInfoMapper(Map<String, Object> params);
   
   
   
   //MAVceces mapper para la implementacion de people on brd
   
    @Transactional(timeout = 60)
    public void GetPeapleOnBoredCrlMapper(Map<String, Object> params);
    
    
    @Transactional(timeout = 60)
    public void GetPeapleOnBoredPglMapper(Map<String, Object> params);

}
