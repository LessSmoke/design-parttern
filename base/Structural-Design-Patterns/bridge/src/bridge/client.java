package bridge;

import bridge.impl.ProjectManager;

public class client {

    public static void main(String[] args) {
        Employee employee = new Employee(new ProjectManager());
        employee.doWork();
    }
}
