class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int fast = 1; fast < nums.length; fast++){
            if (nums[k] != nums[fast]){
                k++;
                nums[k] = nums[fast];
            } 
        }
        return k + 1;
    }
}