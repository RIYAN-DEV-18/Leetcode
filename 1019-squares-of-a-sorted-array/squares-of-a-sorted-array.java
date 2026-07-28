class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, i = nums.length - 1;
        int[] result = new int[nums.length];
        while (left <= right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq <= rightSq){
                result[i] = rightSq;
                right--;
            } else {
                result[i] = leftSq;
                left++;
            }
            i--;
        }
        return result;
    }
}