import java.util.*;

class FrequencyCounter {
    public static HashMap<String, Integer> freqCount(String sentence){
        String[] words = sentence.trim().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void printWordCount(HashMap<String, Integer> map){
        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }
    }

    public static void mostFreqWord(HashMap<String, Integer> map){
        int maxFreq = 0;
        String freqWord = "";
        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                freqWord = entry.getKey();
            }
        }
        System.out.println(freqWord + ": " + maxFreq);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = sc.nextLine();
        HashMap<String, Integer> map = freqCount(sentence);
        System.out.println();
        printWordCount(map);
        System.out.println();
        mostFreqWord(map);
        sc.close();
    }
}