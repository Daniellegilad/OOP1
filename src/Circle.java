public class Circle {
    double radius;
    String color="black";

    double calcArea(double r){
        return r*r*3.14;
    }

    double calcHekef(double r){
        return 2*r*3.14;
    }

    @Override
    public String toString(){
        return "the radius and color of this circle is "+this.radius+" and "+this.color;
    }

}
