import java.util.*;

class Codechef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[N];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }

            for(int i = 0; i < N; i++){
                B[i] = sc.nextInt();
            }

            int totalCost = 0;
            for(int i = 0; i < N; i++){
                if(A[i] >= X){
                    totalCost += B[i];
                }
            }

            System.out.println(totalCost);
            T--;
        }
    }
}
