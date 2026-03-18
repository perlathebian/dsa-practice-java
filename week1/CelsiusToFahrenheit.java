import java.util.*;

class CelsiusToFahrenheit {
    public static Double converter(Double c){
        Double f = c * (9.0/5) + 32;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        Double c = sc.nextDouble();
        System.out.printf("%.2f°C = %.2f°F%n", c, converter(c));
        sc.close();
    }
}
