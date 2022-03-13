public class Triangle {
    int A;
    int B;
    int C;
    int height;

    Triangle(int a, int b, int c, int height){
        this.A=a;
        this.B=b;
        this.C=c;
        this.height=height;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", height=" + height +
                '}';
    }


}

