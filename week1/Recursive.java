public class Recursive {
    public static long factorial (int n){
        if (n < 0){
            return -1;
        }
        if (n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if (n <= 0) return 0;
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static Double power(Double base, int exp){
        if(exp == 0){
            return 1.0;
        }
        if(exp == 1){
            return base;
        }
        return base * power(base, exp -1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(-3));
        System.out.println(factorial(1));
        System.out.println(factorial(5));

        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(6));

        System.out.println(power(2.0, 10));
        System.out.println(power(2.0, 0));
        System.out.println(power(2.0, 1));
    }
}
