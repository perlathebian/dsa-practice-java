class Codechef {
    public static int largestNumber(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return largest+secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 1, 1, 5, 3};
        System.out.println(largestNumber(nums));
    }
}