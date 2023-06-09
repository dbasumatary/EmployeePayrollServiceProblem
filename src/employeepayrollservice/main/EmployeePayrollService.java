package employeepayrollservice.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public static final Scanner scanner = new Scanner(System.in);
    private List<EmployeePayrollData> employeeList;
    public EmployeePayrollService() {
        this.employeeList = new ArrayList<EmployeePayrollData>();
    }

    //UC1 - 1: Employee Payroll service to read and write employee payroll to a console
    public void readEmployeeData() {
        System.out.print("Enter the employee id: ");
        int employeeId = scanner.nextInt();
        System.out.print("Enter the employee name: ");
        scanner.nextLine();
        String employeeName = scanner.nextLine();
        System.out.print("Enter the employee salary: ");
        double employeeSalary = scanner.nextDouble();
        EmployeePayrollData newEmployee = new EmployeePayrollData(employeeId, employeeName, employeeSalary);
        employeeList.add(newEmployee);
    }

    public void writeEmployeeDate() {
        for (EmployeePayrollData payrollData : employeeList)
            System.out.println(payrollData.toString());
    }

    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readEmployeeData();
        employeePayrollService.writeEmployeeDate();
    }
}
