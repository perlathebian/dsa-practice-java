import java.util.Stack;

class Ex3_removing_parantheses {
    public static String removeOuterParantheses(String str){
        StringBuilder result = new StringBuilder();

        int depth = 0;
        int start = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                depth++;
            } else {
                depth--;
            }

            if(depth == 0){
                result.append(str.substring(start + 1, i));
                start = i + 1;
            }
        }

        return result.toString();
    }

    public static String removeParanthesesDepthCounter(String str){
        StringBuilder result = new StringBuilder();
        int depth = 0;
        for(char c : str.toCharArray()){
            if(c == '('){
                if(depth > 0){
                    result.append(c);
                }
                depth++;
            } else {
                depth--;
                if(depth > 0){
                    result.append(c);
                }
            }
        }
        
        return result.toString();
    }

    public static String removeParanthesesStack(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c == '('){
                stack.push(c);
                if(stack.size() > 1){
                    result.append(c);
                }
            }
            else{
                if(stack.size() > 1){
                    result.append(c);
                }
                stack.pop();
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String ex1 = "((()))";
        String ex2 = "(()(()))";
        String ex3 = "()()";
        String ex4 = "((())())(()(()))";

        // System.out.println(removeOuterParantheses(ex1));
        // System.out.println(removeOuterParantheses(ex2));
        // System.out.println(removeOuterParantheses(ex3));
        // System.out.println(removeOuterParantheses(ex4));

        // System.out.println(removeParanthesesDepthCounter(ex1));
        // System.out.println(removeParanthesesDepthCounter(ex2));
        // System.out.println(removeParanthesesDepthCounter(ex3));
        // System.out.println(removeParanthesesDepthCounter(ex4));

        System.out.println(removeParanthesesStack(ex1));
        System.out.println(removeParanthesesStack(ex2));
        System.out.println(removeParanthesesStack(ex3));
        System.out.println(removeParanthesesStack(ex4));
    }
}