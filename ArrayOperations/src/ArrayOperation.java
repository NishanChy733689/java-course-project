public class ArrayOperation {
    public int arraySpanner(int[] array){
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for (int i:array){
           if (i<min){
               min=i;
           }
           if (i>max){
               max=i;
           }
       }
        return max-min;
    }
    public String arrayElementFinder(int[] array,int element){
        for (int i:array){
            if (i==element)
            {
                return "Yes your searched element is present";

            }
        }
        return "Sorry we couldn't find you intended element";
    }
}
