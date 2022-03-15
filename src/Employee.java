public class Employee {
    String firstName;
    String lastName;
    private double salary;


    void setSalary(double newSalary){
        if(newSalary > 0)
            this.salary = newSalary;
    }

      public double getsalary(){
        return this.salary;
    }

    private int floor;
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", floor=" + floor +
                ", id=" + id +
                '}';
    }

    public Employee(String firstName, String lastName, double salary, int floor, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.floor = floor;
        this.id = id;




    }
}