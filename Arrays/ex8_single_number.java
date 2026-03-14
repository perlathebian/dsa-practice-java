class Codechef {
    public static int singleNumber(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {9, 1, 9, 2, 1};
        System.out.println(singleNumber(arr));
    }
}