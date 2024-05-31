package singleton.simple;

/**
 *@description: 简单单例模式
 *@author:     yujunxin
 *@createTime: 2024/5/30 17:09
 *@version:    1.0
 */
public class SingleObject {
 
   /**创建 SingleObject 的一个对象**/
   private static SingleObject instance = new SingleObject();
 
   /**让构造函数为 private，这样该类就不会被实例化**/
   private SingleObject(){}
 
   /**获取唯一可用的对象*/
   public static SingleObject getInstance(){
      return instance;
   }

   /** 方法 **/
   public void showMessage(){
      System.out.println("Hello World!");
   }
}