import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius=55;
        c.color="pink";
        Circle c1 = new Circle();
        c1.radius=22;
        c1.color="blue";
        Circle c2 = new Circle();
        c2.radius=50;
        Circle c3 = new Circle();
        c3.radius=80;

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Triangle t1= new Triangle(1,2,3,4);
        Triangle t2= new Triangle(2,4,6,4);
        Triangle t3= new Triangle(395, 56,75,57);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        Course course1 = new Course("QA",28,"java");
        System.out.println(course1);
        System.out.println();
        course1.breakee();





    }
}


