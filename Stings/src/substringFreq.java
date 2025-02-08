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

    public static void main(String[] args) {
        System.out.println(countSubFreq("Supercalifragilisticexpialidocious","li"));
    }
}
