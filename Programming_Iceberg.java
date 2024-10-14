class win64{
    public static void turn_on() throws InterruptedException {
        System.out.println("Turning the machine on ....");
        Thread.sleep(1000);
    }
}
class Assembly extends win64{
    public static void get_langs() throws InterruptedException {
        System.out.println("Getting the needed programming language");
        Thread.sleep(500);
        System.out.println("....Loaded successfully");
    }
}
class Java extends Assembly{
    public static void compile(){
        System.out.println("Hi this a java programme");
    }
}
class C extends Assembly{
    public static void compile(){
        System.out.println("this is a C programme");
    }
}

public class Programming_Iceberg {
    static C c_compiler=new C();
    static Java java=new Java();
    public static void main(String[] args) throws InterruptedException {
        c_compiler.turn_on();
        c_compiler.get_langs();
        c_compiler.compile();

        java.turn_on();
        java.get_langs();
        java.compile();
    }
}
