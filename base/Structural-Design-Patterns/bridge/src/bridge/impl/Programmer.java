package bridge.impl;

import bridge.implementor.Work;

/**
 *@description: 程序员实体类
 *@author:     yujunxin
 *@createTime:  14:00
 *@version:    1.0
 */
public class Programmer implements Work {

    @Override
    public void doWork() {
        System.out.println("程序员的工作内容：写代码");
    }

}
