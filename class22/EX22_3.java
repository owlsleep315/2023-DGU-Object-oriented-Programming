import java.util.ArrayList;
import java.util.Iterator;

class Employee {

    private String id;              // 아이디
    private String name;            // 이름
    private Integer workHours;      // 정상 작업시간
    private Integer overTimeHours;  // 잔업시간

    private PayManager payManager;

    // 생성자
    public Employee(String id, String name, Integer workHours, Integer overTimeHours) {
        this.id = id;
        this.name = name;
        this.workHours = workHours;
        this.overTimeHours = overTimeHours;
    }

    // 임금 계산
    public int calculatePay() {
        // 계산로직
        return payManager.calcPay(this);
    }

    // Getter, Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(Integer overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public PayManager getPayManager() {
        return payManager;
    }

    public void setPayManager(PayManager payManager) {
        this.payManager = payManager;
    }
}

class PayLogic1 implements PayManager {
    public int calcPay(Employee employee) {
        return 10000 * employee.getWorkHours() + 15000 * employee.getOverTimeHours();
    }

}

class PayLogic2 implements PayManager {
	public int calcPay(Employee employee) {
		return 50000 + 8000 * employee.getWorkHours() + 12000 * employee.getOverTimeHours();
	}
	
}

// 페이처리를 위한 인터페이스
interface PayManager {

    public int calcPay(Employee employee);

}

class PaymentOnConsole extends PayrollManager {
    @Override
    protected void writePayment(int amount) {
        System.out.println(amount);
    }
}

abstract class PayrollManager {

    private ArrayList<Employee> employees = new ArrayList<>();

    protected abstract void writePayment(int amount);

    public void writeEmployeePay() {
        for (Employee curEmployee : employees) {
            int amount = curEmployee.calculatePay();
            writePayment(amount);
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}

public class EX22_3 {
    public static void main(String[] args) {

        // 종업원 클래스의 인스턴스 생성
        Employee employee1 = new Employee("kim", "kim", 40, 20);
        Employee employee2 = new Employee("lee", "lee", 40, 10);
        Employee employee3 = new Employee("park", "park", 40, 30);
        Employee employee4 = new Employee("choi", "choi", 40, 0);

        employee1.setPayManager(new PayLogic1());
        employee2.setPayManager(new PayLogic1());
        employee3.setPayManager(new PayLogic2());
        employee4.setPayManager(new PayLogic2());

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        PayrollManager paymentOnConsole = new PaymentOnConsole();
        paymentOnConsole.setEmployees(employees);
        paymentOnConsole.writeEmployeePay();

    }
}