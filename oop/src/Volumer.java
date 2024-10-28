class Shape {
    public static void Get_Cuboid(int height, int width, int length) {
        System.out.println("height = " + height + ", width = " + width + ", length = " + length);
        System.out.println("Volume = " + height * width * length);
    }

    public static void Get_Cube(int edge) {
        System.out.println("edge = " + edge);
        System.out.println("Volume = " + edge * edge * edge);
    }
}

public class Volumer {
    public static void main(String[] args) {
        // Call static methods using the class name
        Shape.Get_Cube(5);
        Shape.Get_Cuboid(20,10,40);
    }
}