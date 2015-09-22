package pa.acp.portal.sp.model.Util;

import java.lang.reflect.Method;

/**
 *
 * @author lalince
 */
public class ConvertirNulosBlancos {

    public Object SetBlancos(Object o){
        try {
            Class _class = o.getClass();
            Method[] methods = _class.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().startsWith("get")) {
                    String ver = (String)method.invoke(o);
                    if(ver==null)
                    {
                    Method m = o.getClass().getMethod(method.getName().replaceFirst("get", "set"), String.class);
                    m.invoke(o, "");
                    }
                    else if(ver!=null)
                    {
                        if(ver.equals("null")){
                    Method m = o.getClass().getMethod(method.getName().replaceFirst("get", "set"), String.class);
                    m.invoke(o, "");
                    }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }  
    
    return o;
    }
    
public Object SetNulos(Object o){
        
     try {
            Class _class = o.getClass();
            Method[] methods = _class.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().startsWith("get")) {
                    String ver = (String)method.invoke(o);
                    if(ver!=null)
                    {
                     if(ver.equals("".trim())||ver.equals("?".trim())){
                    Method m = o.getClass().getMethod(method.getName().replaceFirst("get", "set"), String.class);
                    m.invoke(o, new Object[]{ null });
                    }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    return o;
    }
    public  String valueOf2(Object obj) {
        return (obj == null) ? null : obj.toString();
    } 
}