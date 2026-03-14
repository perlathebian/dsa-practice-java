class Codechef {
    public static void nonDecreasing(int[] nums){
        boolean nonDecreasing = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                nonDecreasing = false;
                break;
            }
        }
        
        if(nonDecreasing){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1000, 2000, 5000, 3000, 1000};
        int[] nums2 = {1, 2, 3};

        nonDecreasing(nums1);
        nonDecreasing(nums2);
    }
}
