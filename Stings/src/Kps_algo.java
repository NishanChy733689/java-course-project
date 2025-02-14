import java.util.Scanner;

public class Kps_algo {
    public static void kmpSearch(String pat,String txt){
        int j=0;
        int M=pat.length();
        int N=txt.length();
        int[] lps=new int[M];

        ComputeLpsArr(pat,M,lps);
        int i=0;
        while(N-i>=(M-j)){
            if (pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if (j==M){
                System.out.println("Found the pattern at "+(i-j));
                j=lps[j-1];
            } else if (i<N && pat.charAt(j)!=txt.charAt(i)) {
                if (j !=0){
                    j=lps[j-1];
                }else{
                    i+=1;
                }
            }
        }
    }
    public static void ComputeLpsArr(String pat,int M,int[] lps){
        int len=0;
        int i=1;
        lps[0]=0;
        while(i<M){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else {
                    lps[i]=len;
                    i++;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the text to search in : ");
        String text=scn.nextLine();

        System.out.println("Enter the pattern to search for : ");
        String pat=scn.nextLine();

        kmpSearch(pat,text);

    }
}
