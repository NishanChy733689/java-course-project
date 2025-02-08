import javax.imageio.stream.ImageInputStream;

public class substringFreq{
    public static int countSubFreq(String a,String b){
        if (b.length()>a.length()){
            return -1;
        }
        int counter=0;
        for (int i=0;i<a.length();i++){
            int start=i;
            for(int j=i+1;j<a.length();j++){
                String slice=a.substring(start,j);
                if (slice.equalsIgnoreCase(b)){
                    counter+=1;
                }
            }
        }
        return counter;
    }

    public static String replaceSubstring(String a,String b,String replace){
        if (b.length()>a.length()){
            return "error";
        }
        String res="";
        for (int i=0;i<a.length();i++){
            int start=i;
            for(int j=i+1;j<a.length();j++){
                String slice=a.substring(start,j);
                if (slice.equalsIgnoreCase(b)){
                    res=a.replace(slice,replace);
                    System.out.println(res);
                }
            }
        }
        return res;
    }

    public static int lexcicographicalChecker(String a,String b){
        if (a.length()>b.length()){
            String  temp=a;
            a=b;
            b=temp;
        }
        for(int i=0;i<a.length();i++){
            if (a.charAt(i)!=b.charAt(i) ) {
                return a.charAt(i)-b.charAt(i);
            }
        }
        return a.length()-b.length();
    }

    public static void main(String[] args) {
        System.out.println(countSubFreq("Supercalifragilisticexpialidocious","li"));
        System.out.println(replaceSubstring("Supercalifragilisticexpialidocious","Super","superman"));
        int res=lexcicographicalChecker("pae","pan");
        if (res<0){
            System.out.println("second string is bigger");
        } else if (res == 0) {
            System.out.println("both are the same");
        }else {
            System.out.println("first string is bigger");
        }
    }
}
