import java.util.Scanner;

public class StringFrequency {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your string to work : ");
        String string=scn.nextLine();
        char[] strings=string.toCharArray();
        int[] freq=new int[strings.length];
        for (int i=0;i<strings.length;i++){
            freq[i]=1;
            for (int j=i+1;j<strings.length;j++){
                if(strings[i]==strings[j]){
                    freq[i]++;
                    strings[j]='0';
                }
            }
        }
        for (int k=0;k<strings.length;k++){
            if (strings[k]!='0'&& strings[k]!=' '){
                System.out.println(strings[k]+" == "+freq[k]);
            }
        }
    }
}