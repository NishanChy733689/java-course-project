public class substringCheck {
    public static boolean checkSub(String a,String b){
        if (b.length()>a.length()){
            return false;
        }
        for (int i=0;i<a.length();i++){
            int start=i;
            for(int j=i+1;j<a.length();j++){
                String slice=a.substring(start,j);
                if (slice.equalsIgnoreCase(b)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSub("hello","ell"));
    }
}
