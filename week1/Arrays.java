public class Arrays {
    public static int[] reverse(int[] arr){
        int[] reverseArr = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            reverseArr[j++] = arr[i]; 
        }
        return reverseArr;
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean hasDuplicate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(reverse(arr)));
        System.out.println("Max: " + findMax(arr));
        System.out.println(hasDuplicate(arr));
    }
}
