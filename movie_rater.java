import java.util.Scanner;
public class movie_rater{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("What is the name of your movie");
        String name= scn.nextLine();
        scn.nextLine();
        System.out.println("What is your rating on the movie "+name);
        byte rating=scn.nextByte();
        if (rating>=9){
            System.out.println("the movie is best to you");
        }else if (rating>=7){
            System.out.println("Seems like you enjoyed the movie very much");
        } else if (rating>=4) {
            System.out.println("seems like a decent movie");
        }else{
            System.out.println("The movie is bad");
        }

    }
}
