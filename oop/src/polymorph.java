

class tourist_spot{
    public static void location(){
        System.out.println("It is located at : ");
    }
    public static void famous(){
        System.out.println("it is famous for : ");
    }}
class Times_Square extends tourist_spot{
    public static void location(){
        System.out.println("It is a location in New York city");
    }
    public static void famous(){
        System.out.println("A famous square shaped place in New york");
    }}
class Hiroshima extends tourist_spot{
    public static void location(){
        System.out.println("It is located at : Japan");
    }
    public static void famous(){
        System.out.println("Surviving an nuclear bomb but still being the place where \n lives thrive");
    }}
class Pearl_Harbor extends tourist_spot{
    public static void location(){
        System.out.println("It is located at : Hawai in Usa");
    }
    public static void famous(){
        System.out.println("it is famous for : Its attack that happened on 1942 during ww2");
    }}


public class polymorph {
    public static void main(String[] args) {
        Hiroshima spot1=new Hiroshima();
        Times_Square spot2=new Times_Square();
        Pearl_Harbor spot3=new Pearl_Harbor();

        spot1.location();
        spot1.famous();

        spot2.location();
        spot2.famous();
        spot3.location();
        spot3.famous();
    }
}

