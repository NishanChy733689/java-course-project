import javax.swing.*;

abstract class canvas{
    abstract void drawing();
    public static void show(){
        System.out.println("I am a painting of an abstract class");
    }
}
class Monalisa extends canvas{
    void drawing(){
        System.out.println("It is a Drawing of Monalisa");
    }
}
class Last_supper extends canvas{
    void drawing(){
        System.out.println("It is a Drawing of Last supper");
    }
}class Starry_nights extends canvas{
    void drawing(){
        System.out.println("It is a Drawing of starry nights");
    }
}



public class abstraction {
    public static void main(String[] args) {
        Monalisa painting1=new Monalisa();
        Last_supper painting2=new Last_supper();
        Starry_nights painting3=new Starry_nights();

        painting1.drawing();
        painting2.drawing();
        painting3.drawing();

    }
}
