import java.util.*;

public class Patterns {
    public static void printTriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int sumEvens(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static int countDigit(int number, int digit){
        String s = String.valueOf(number);
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == String.valueOf(digit).charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        printTriangle(4);
        System.out.println();
        int n = 10;
        System.out.println(sumEvens(n));
        System.out.println();
        System.out.println(countDigit(133234, 3));
    }
}
