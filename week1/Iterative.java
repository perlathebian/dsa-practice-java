public class Iterative {
        public static long factorial(int n){
            if (n < 0){
                return -1;
            }
            if(n <= 1){
                return 1;
            }
            long fact = 1;
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            return fact;
        }

        public static int fibonacci(int n){
            if (n == 1 || n == 2) return 1;  
            int prev2 = 1;
            int prev1 = 1;
            int current = 0;
            for (int i = 3; i <= n; i++) {
                current = prev2 + prev1;
                prev2 = prev1;
                prev1 = current;
            }
            return current;
        }

        public static Double power(Double base, int exp){
            if (exp == 0){
                return 1.0;
            }
            Double p = 1.0;
            for(int i = 1; i <= exp; i++){
                p *= base;
            }
            return p;
        }

        public static void main(String[] args) {
            // System.out.println(factorial(5));
            // System.out.println(factorial(-3));
            // System.out.println(factorial(0));
            // System.out.println(factorial(1));

            // System.out.println(fibonacci(6));

            System.out.println(power(2.0, 10));
            System.out.println(power(2.0, 1));
            System.out.println(power(2.0, 0));
        }
}
