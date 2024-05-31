package singleton.lazySafe;

public class Singleton {
    private static Singleton instance;  
    private Singleton (){}

    /** 加了锁**/
    public static synchronized Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  
}