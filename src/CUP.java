public class CUP {
    char SIZE='M';
    String DRINK="tea";

    void drink(){
        System.out.println("drinking");
    }

    void spill(){
        System.out.println("ohh god no the drink spilled");
    }

    @Override
    public String toString() {
        return "CUP{" +
                "SIZE=" + SIZE +
                ", DRINK='" + DRINK + '\'' +
                '}';
    }
}
