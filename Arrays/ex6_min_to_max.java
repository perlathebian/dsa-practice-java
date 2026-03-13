class Codechef {
    public static int minOperations(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int operations = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > min){
                operations++;
            }
        }

        return operations;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2};

        System.out.println(minOperations(arr));
    }
}