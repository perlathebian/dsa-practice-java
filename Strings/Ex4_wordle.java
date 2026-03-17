import java.util.Scanner;

class Ex4_wordle {
    public static String wordle(String S, String T){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == T.charAt(i)){
                result.append('G');
            } else {
                result.append('B');
            }
        }
        return result.toString();
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            String S = sc.next();
            String T = sc.next();

            System.out.println(wordle(S, T));
        }

        sc.close();
    }
}
