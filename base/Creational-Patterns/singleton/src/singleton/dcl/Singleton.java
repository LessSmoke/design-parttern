package singleton.dcl;

public class Singleton {

    // 使用volatile关键字确保变量的可见性
    // 这是单例类的唯一实例。使用volatile关键字是为了确保在不同线程中对该变量的可见性。当一个线程修改了这个变量的值，新值对其他线程立即可见。
    private volatile static Singleton singleton;

    // 私有构造函数，防止外部实例化
    private Singleton() {}

    // 公有静态方法，提供全局访问点
    public static Singleton getSingleton() {
        // 首先检查实例是否已存在
        if (singleton == null) {
            // 同步块，确保线程安全
            synchronized (Singleton.class) {
                // 第二次检查实例是否已存在
                if (singleton == null) {
                    // 创建实例
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}