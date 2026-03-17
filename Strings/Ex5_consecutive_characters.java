import java.util.*;

class Ex5_consecutive_characters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;

        while(t-- > 0){
            int n = sc.nextInt();
            String S = sc.next();
            for(int i = 1; i < n; i++){
                if(S.charAt(i) == S.charAt(i - 1)){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}