public class DataSet {
    private double[] data;
    private int dataSize;
    private double sum;
    public DataSet() {
        data = new double[100];
        dataSize = 0; sum = 0;
    }
    public void add(double value){
        data[dataSize] = value;
        dataSize++;
        sum += value;
     }
    public double getAverage() {
        if (dataSize == 0) {
            return 0;
        } else {
            return sum / dataSize;
        }
    }
    public double getdeviation(){
        double mean=getAverage();
        double sumSquare=0;
        for (int i = 0; i<=dataSize; i++){
            sumSquare+=Math.pow(data[i]-mean,2);
        }
        return Math.sqrt(sumSquare/dataSize);
    }
    public double getAverageOfAverages(@org.jetbrains.annotations.NotNull DataSet[] dataSet){
        double sum=0;
        for (DataSet ds : dataSet){
            sum+=ds.getAverage();
        }
        return sum/dataSet.length;
    }
}

