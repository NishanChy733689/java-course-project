
class Parent{
    int num=10;
    public void sayHello(){
        System.out.print("hello from USA :"+num);
    }
}
class Child extends Parent{
    int num=30;
    @Override
    public void sayHello(){
        System.out.println("hello from Canada :"+num+" "+super.num);
    }
}

public class overriding {
    public static void main(String[] args) {
        Child p=new Child();
        p.sayHello();


    }
}
