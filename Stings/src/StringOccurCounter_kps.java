import java.util.Scanner;

public class StringOccurCounter_kps {
    public static void kmpCounter(String pat,String txt){
        int j=0;
        int M=pat.length();
        int N=txt.length();
        int[] lps=new int[M];

        Kps_algo.ComputeLpsArr(pat,M,lps); // You need the Kps_Algo.java file to run this
                                           // This method is imported from there
        int i=0;
        int counter=0;
        while(N-i>=(M-j)){
            if (pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if (j==M){
                System.out.println("Found the pattern at the index :  "+(i-j));
                counter++;
                j=lps[j-1];
            } else if (i<N && pat.charAt(j)!=txt.charAt(i)) {
                if (j !=0){
                    j=lps[j-1];
                }else{
                    i+=1;
                }
            }
        }
        System.out.println("The given pattern has repeated : "+counter+" times in the given string");


    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the text to search in : ");
        String text=scn.nextLine();

        System.out.println("Enter the pattern to search for : ");
        String pat=scn.nextLine();

        kmpCounter(pat,text);

    }
}

