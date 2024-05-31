package bridge;

import bridge.implementor.Work;

/**
 *@description: 定义员工实体类
 *@author:     yujunxin
 *@createTime: 2024/5/31 14:04
 *@version:    1.0
 */
public class Employee {

    protected Work work;

    protected Employee(Work work) {
        this.work = work;
    }

    public void doWork(){
        this.work.doWork();
    }

}
