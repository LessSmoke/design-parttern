package singleton.lazy;

public class Singleton {
    private static Singleton instance;  
    private Singleton (){}  
  
    public static Singleton getInstance() {
        // 判断当前实例是否存在不存在则创建
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  
}