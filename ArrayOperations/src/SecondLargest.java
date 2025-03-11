import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        //Define the array
        int[] array={1,6,8,4,5,6};
        // Sort the array so the second large number is the second last element
        Arrays.sort(array);

        //Create the tracker object
        numTracker tracker=new numTracker();

        //Iterate through the array and keep updating the tracker
        for(int i=0;i<array.length;i++){
            int curr=array[i];
            tracker.update(curr);
        }

        //print the results
        System.out.println(tracker.getLastHigh());
    }
}

class numTracker{
    // Make two pointers
    private static int current;
    private static int lastHigh;

    public static void update(int newInt){
        // store the previous pinter value
        int temp=current;
        // update the pointer current
        current=newInt;
        //update the pointer lastHigh
        if (current>temp){
            lastHigh=temp;
        }
    }
    //the getter method for lastHigh
    public static int getLastHigh(){
        return lastHigh;
    }
}
