public class rotator {
        public static int rotateNumber(int num, int k) {

            String numStr = Integer.toString(num);


            int len = numStr.length();

            k = k % len;

            String rotatedStr = numStr.substring(len - k) + numStr.substring(0, len - k);

            return Integer.parseInt(rotatedStr);
        }

        public static void main(String[] args) {
            int num = 12345678;
            int k = 3;
            int result = rotateNumber(num, k);
            System.out.println(result);
        }
    }




