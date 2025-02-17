import java.util.HashSet;
import java.util.Set;

public class uniqueSubstring {
    public static String find(String str){
        Set<Character> set=new HashSet<>();
        int start=0;
        String longest="";
        for(int i=0;i<str.length();i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(start));
                start++;
            }
            set.add(str.charAt(i));
            if (i-start+1>longest.length()){
                longest=str.substring(start,i+1);
            }

        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println(find("monkeymonkeysdfa "));

    }
}