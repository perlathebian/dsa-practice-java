import java.util.*;

public class Methods {
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for(int i = 2; i <= (int) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sumDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here: ");
        int n = sc.nextInt();
        System.out.println();
        boolean prime = isPrime(n);
        int sum = sumDigits(n);
        if(prime){
            System.out.println(n + " is prime. Digit sum = " + sum);
        } else {
            System.out.println(n + " is not prime. Digit sum = " + sum);
        }
        sc.close();
    }
}
