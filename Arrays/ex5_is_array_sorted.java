import java.util.*;

class Codechef{
    public static boolean check(int[] nums){
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            // That line compares the current element with the next element in the array, and 
            // the % n ensures that when the loop reaches the last element it wraps around and 
            // compares it with the first element.
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        int[] nums = {6, 7, 1, 2, 3, 4, 5};
        System.out.println(check(nums));
    }
}