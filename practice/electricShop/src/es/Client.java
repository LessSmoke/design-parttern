package es;

import es.entity.AbstractUser;
import es.factory.SalesPromotionFactory;
import es.factory.UserAbstractFactory;
import es.factory.UserFactoryProducer;
import es.stragedy.handler.SalesPromotion;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Set;

public class Client {

    private static SalesPromotionFactory salesPromotionFactory;

    public static void main(String[] args) throws Exception {
        try {
            init();
        } catch (Exception e) {
            System.out.println("初始化失败");
            throw e;
        }
        try {
            UserAbstractFactory factory = UserFactoryProducer.getFactory("buyer");
            AbstractUser user = factory.createUser("风清扬");
            user.action();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        salesPromotionFactory.executeSalesPromotion("SalesPromotion1");

    }

    private static void init() throws Exception {
        // 使用反射的方式初始化策略列表

        // 创建Reflections对象，指定要扫描的包名
        Reflections reflections = new Reflections("es.strategy");

        // 获取接口的所有实现类
        Set<Class<? extends SalesPromotion>> subTypes = reflections.getSubTypesOf(SalesPromotion.class);
        HashMap<String, SalesPromotion> map = new HashMap<>();
        for(Class<? extends SalesPromotion> item : subTypes){
            String key = item.getName();
            // 使用默认构造函数创建实例
            SalesPromotion promotionInstance = createInstance(item);
            map.put(key,promotionInstance);
        }

        // 初始化策略工厂
        salesPromotionFactory = SalesPromotionFactory.getSalesPromotionFactory(map);
    }

    // 使用默认构造函数创建实例
    public static <T> T createInstance(Class<? extends T> clazz) throws Exception {
        return clazz.getDeclaredConstructor().newInstance();
    }

    // 使用带参数的构造函数创建实例
    public static <T> T createInstanceWithParameters(Class<? extends T> clazz, Object... initargs) throws Exception {
        Class<?>[] parameterTypes = new Class[initargs.length];
        for (int i = 0; i < initargs.length; i++) {
            parameterTypes[i] = initargs[i].getClass();
        }
        return clazz.getDeclaredConstructor(parameterTypes).newInstance(initargs);
    }
}
