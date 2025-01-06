import java.util.ArrayList;

public class StairPath {
    public static void main(String[] args) {
        int n = 4; // Number of stairs
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        // Base case: If there are no stairs left
        if (n == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        
        // Base case: If negative stairs
        if (n < 0) {
            return new ArrayList<>();
        }
        
        // Recursive calls
        ArrayList<String> path1 = getStairPaths(n - 1); // Taking 1 step
        ArrayList<String> path2 = getStairPaths(n - 2); // Taking 2 steps
        ArrayList<String> path3 = getStairPaths(n - 3); // Taking 3 steps
        
        // Combine results
        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1) {
            paths.add(1 + path);
        }
        for (String path : path2) {
            paths.add(2 + path);
        }
        for (String path : path3) {
            paths.add(3 + path);
        }
        
        return paths;
    }
}
