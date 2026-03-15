import java.util.HashMap;

class Ex1_dna_storage {
    public static String dnaMapping(String binarySequence){
        int n = binarySequence.length();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i += 2){
            char first = binarySequence.charAt(i);
            char second = binarySequence.charAt(i+1);
            if(first == '0' && second == '0'){
                result.append('A');
            } else if(first == '0' && second == '1'){
                result.append('T');
            } else if (first == '1' && second == '0'){
                result.append('C');
            } else {
                result.append('G');
            }
        }
        return result.toString();
    }

    public static String hashmapAlternative(String binSequence){
        int n = binSequence.length();

        HashMap<String, Character> map = new HashMap<>();
        map.put("00", 'A');
        map.put("01", 'T');
        map.put("10", 'C');
        map.put("11", 'G');

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i += 2){
            String pair = binSequence.substring(i, i+2);
            result.append(map.get(pair));
        }

        return result.toString();
    }

    public static String indexMapping(String binarySequence){
        char[] map = {'A', 'T', 'C', 'G'};
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < binarySequence.length(); i += 2){
            int value = (binarySequence.charAt(i) - '0')*2 + (binarySequence.charAt(i+1) - '0');
            result.append(map[value]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String ex = "100011100001";
        System.out.println(dnaMapping(ex));
        System.out.println(hashmapAlternative(ex));
        System.out.println(indexMapping(ex));
    }
}