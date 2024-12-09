import java.util.ArrayList;
import java.util.Scanner;

public class arrayTrial{
    ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
    public void getArr() {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> line = new ArrayList<>();
        System.out.println("How many rows do you want ?");
        int row_count = scn.nextInt();

        for (int i = 0; i < row_count; i++) {
            System.out.println("How many colmns do you want ?");
            int columnCount = scn.nextInt();
            for (int j=0;j<columnCount;j++){
                System.out.println("Enter your value for" + i + "," + j + " ");
                int temp = scn.nextInt();
                scn.nextLine();
                line.add(temp);
            }
            arr.add(line);






        }
    }

    public void getElement(int row, int column){
        ArrayList<Integer> fetch=arr.get(row);
        System.out.println("The value at "+row+", "+column+" is "+fetch.get(column));
    }

    public static void main(String[] args) {
        arrayTrial arr=new arrayTrial();
        arr.getArr();
        arr.getElement(2,2);
    }
}
