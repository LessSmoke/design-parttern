package bridge.impl;

import bridge.implementor.Work;

/**
 *@description: 产品经理实体类
 *@author:     yujunxin
 *@createTime: 2024/5/31 14:02
 *@version:    1.0
 */
public class ProjectManager implements Work {
    @Override
    public void doWork() {
        System.out.println("产品经理的工作是：制定需求");
    }
}
