public class stringValidator {
    public static boolean identify(String str){
        if (str.isEmpty()){
            return false;
        }
        char str_0=str.charAt(0);
        if (!Character.isLetter(str.charAt(0)) && str_0!='_'){
            return false;
        }
        for (int i=1;i<str.length();i++){
            if (!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i)!='_'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(identify("_helloboi"));
    }
}
