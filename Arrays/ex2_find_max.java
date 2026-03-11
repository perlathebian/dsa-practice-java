import java.util.*;

// Linear Scan (Optimal)
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T > 0){
            int N = sc.nextInt();

            int[] arr = new int[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            
            int max = arr[0];

            for(int i = 1; i < N; i++){
                if (max < arr[i]){
                    max = arr[i];
                }
            }
            System.out.println(max);
            T--;
        }

        sc.close();
    }
}

