package Facade;

import Facade.impl.AModuleImpl;
import Facade.impl.BModuleImpl;
import Facade.impl.CModuleImpl;

/**
    外观模式，统一管理子系统内部的各个类和接口
    将内部子系统的功能进行组合完成客户端的需求
 */
public class Facade {
    public void test(){
        InterfaceA a = new AModuleImpl();
        a.testA();
        InterfaceB b = new BModuleImpl();
        b.testB();
        InterfaceC c = new CModuleImpl();
        c.testC();
    }
}
