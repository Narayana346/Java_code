package pratice_section.Accenture;

public class q5 {

        public static String DectoNBase(int n, int num) {
            if (n <= 1 || n > 36) {
                throw new IllegalArgumentException("Base (n) must be between 2 and 36.");
            }

            if (num < 0) {
                throw new IllegalArgumentException("Input number (num) must be a positive integer.");
            }

            // Define the symbols for digits beyond 9 (A-Z)
            char[] symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

            if (num == 0) {
                return "0"; // Special case for zero
            }

            StringBuilder result = new StringBuilder();
            while (num > 0) {
                int remainder = num % n;
                result.insert(0, symbols[remainder]);
                num /= n;
            }

            return result.toString();
        }

        public static void main(String[] args) {
            int n = 12;   // Change this to the desired base (N)
            int num = 718; // Change this to the decimal number you want to convert

            String nBaseRepresentation = DectoNBase(n, num);
            System.out.println(nBaseRepresentation);
        }


}
