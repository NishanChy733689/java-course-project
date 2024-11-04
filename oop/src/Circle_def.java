class Circle {
    private final double radius;
    public Circle(double r)
    {
        radius = r;
    }
    public double getRadius() {
        return radius;
    } public double area()
    {
        return Math.PI * radius * radius;
    } public double circumference(){
        return 2 * Math.PI * radius;
    }
}
public class Circle_def {
    public static void main(String[] args) {
        Circle[] shapes=new Circle[2];
        shapes[1]=new Circle(5);
        shapes[0]=new Circle(8);
        System.out.println(shapes[1].getRadius());
        System.out.println(shapes[1].area());
        System.out.println(shapes[1].circumference());
        System.out.println(shapes[0].getRadius());
        System.out.println(shapes[0].area());
        System.out.println(shapes[0b0].circumference());
    }
}