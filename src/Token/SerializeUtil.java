package Token;


import java.io.ByteArrayInputStream;  
import java.io.ByteArrayOutputStream;  
import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
  
public class SerializeUtil {  
  
    /** 
     *  
     * <p>Title: ObjTOSerialize</p> 
     * <p>Description: 序列化一个对象</p> 
     * @param obj 
     * @return 
     * @author guangshuai.wang 
     */  
    public static byte[] ObjTOSerialize(Object obj){  
        if(obj != null){
        ObjectOutputStream oos = null;  
        ByteArrayOutputStream byteOut = null;  
        try{  
            byteOut = new ByteArrayOutputStream();  
            oos = new ObjectOutputStream(byteOut);  
            oos.writeObject(obj);  
            byte[] bytes = byteOut.toByteArray();  
            return bytes;  
        }catch (Exception e) {  
            System.out.println("对象序列化失败");  
        }  
        }else{
            System.out.println("序列化对象不存在");  
        }
        return null;  
    }  
    /** 
     *  
     * <p>Title: unSerialize</p> 
     * <p>Description: 反序列化</p> 
     * @param bytes 
     * @return 
     * @author guangshuai.wang 
     */  
    public static Object unSerialize(byte[] bytes){  
        if(bytes != null){
            ByteArrayInputStream in = null;  
            try{  
                in = new ByteArrayInputStream(bytes);  
                ObjectInputStream objIn = new ObjectInputStream(in);  
                return objIn.readObject();  
            }catch (Exception e) {  
               System.out.println("反序列化失败");  
            }  
        }else{
            System.out.println("反序列化对象不存在");
        }
        return null;  
    }  
} 