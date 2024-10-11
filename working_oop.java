public class working_oop {

    public static void main(String[] args){
        employ employee=new employ(1,27,1997,200000);
        System.out.println(employee.display());

        Counter obj1=new Counter();
        obj1.increment(456);
        System.out.println(obj1.detail());

    }
}
