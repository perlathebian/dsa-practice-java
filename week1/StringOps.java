import java.util.HashMap;

public class StringOps {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int countVowels(String s){
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String reverseWords(String sentence){
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if (i != 0) result.append(" ");
        }
        return result.toString();
    }
}
