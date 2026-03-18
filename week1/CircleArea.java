import java.util.*;

public class CircleArea {
    public static Double area(Double r){
        Double a = Math.PI * r * r;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cirle radius: ");
        Double r = sc.nextDouble();
        System.out.printf("Area of circle with radius %.2f = %.2f%n", r, area(r));
        sc.close();
    }
}
