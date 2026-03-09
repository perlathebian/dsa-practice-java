import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) {

            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int totalWithout = 0;
            int totalWith = 0;

            for (int i = 0; i < N; i++) {

                int price = sc.nextInt();

                totalWithout += price;

                totalWith += Math.max(price - Y, 0);
            }

            totalWith += X;

            if (totalWith < totalWithout) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }

            T--;
        }

        sc.close();
    }
}