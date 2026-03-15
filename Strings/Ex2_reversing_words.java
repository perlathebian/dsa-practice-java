import java.util.Stack;

class Ex2_reversing_words {
    public static String reverseWords(String str){
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        int n = words.length;

        for(int i = n - 1; i >= 0; i--){
            if(!words[i].equals("")){
                result.append(words[i]);

                if(result.length() > 0) {
                    result.append(" ");
                }
            }
        }
        return result.toString().trim();
    }

    public static String reverseWordsStack(String s) {

        String[] words = s.trim().split("\\s+");

        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {

            result.append(stack.pop());

            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static String reverseWordsTwoPointer(String s) {

        StringBuilder result = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            result.append(s.substring(j + 1, i + 1));

            if (j > 0) {
                result.append(" ");
            }

            i = j - 1;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String ex = "OpenAI   creates amazing   AI   models";
        System.out.println(reverseWords(ex));
        System.out.println(reverseWordsStack(ex));
        System.out.println(reverseWordsTwoPointer(ex));
    }
}
