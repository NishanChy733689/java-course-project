class Shape1 {
    public void showArea(int side){
        System.out.println("The area of the square is "+side*side);
    }
    public void showArea(int height,int width){
        System.out.println("The area of the square is "+height*width);
    }
    public void showArea(float radius){
        System.out.println("The area of the circle is "+radius*radius*Math.PI);
    }
}



public class PolyP {
    public static void main(String[] args) {
        Shape1[] arr=new Shape1[3];
        arr[0]=new Shape1();
        arr[1]=new Shape1();
        arr[2]=new Shape1();

        arr[0].showArea(6);
        arr[1].showArea(10,13);
        arr[2].showArea(2.5f);

    }
}
//
//When a method is used for multiple different purposes then it is called polymorphism
//The code overloads the showArea method in the class called Shape1 and makes the function usable for
//rectangle square and circle.Based on the parameter we are passing to the methods compile time polymorphism
//is being used
//
