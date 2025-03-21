public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        towerOfHanoi(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        towerOfHanoi(n - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        int n = 3;
        char source = 'A';
        char target = 'C';
        char auxiliary = 'B';

        towerOfHanoi(n, source, target, auxiliary);
    }
}
