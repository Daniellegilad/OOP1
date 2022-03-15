import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("danielle", "gilad", 20.000, 30, 111111111);
        Employee emp2 = new Employee("Johnny", "gilad", 0, 0,0);
        Employee emp3 = new Employee("Yoni", "zehavi",100.000,30,111111111);

        emp1.setSalary(3);
        System.out.println(emp1.getsalary());




    }
}


