public class Course {
    String name;
    int numOfStudents;
    String subject;

    Course (String name, int numOfStudents, String subject){
        this.name=name;
        this.numOfStudents=numOfStudents;
        this.subject=subject;
    }
    void breakee(){
        System.out.println("go for a 45 min break");
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", subject='" + subject + '\'' +
                '}';
    }

}
