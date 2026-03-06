// 1_search_an_element_in_an_array

// Brute force (linear search)

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        boolean found = false;
        
        for(int i = 0; i < N; i++){
            if(A[i] == X){
                found = true;
                break;
            }
        }
        
        if(found){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}



// // HashSet Approach
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int X = sc.nextInt();

//         HashSet<Integer> set = new HashSet<>();

//         for(int i = 0; i < N; i++){
//             set.add(sc.nextInt());
//         }

//         if(set.contains(X)){
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }

//     }
// }


// // Sort + Binary Search Approach
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int X = sc.nextInt();

//         int[] A = new int[N];

//         for(int i = 0; i < N; i++){
//             A[i] = sc.nextInt();
//         }

//         Arrays.sort(A);

//         int left = 0;
//         int right = N - 1;

//         boolean found = false;

//         while(left <= right){

//             int mid = left + (right - left) / 2;

//             if(A[mid] == X){
//                 found = true;
//                 break;
//             }

//             else if(A[mid] < X){
//                 left = mid + 1;
//             }

//             else{
//                 right = mid - 1;
//             }
//         }

//         if(found){
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }

//     }
// }