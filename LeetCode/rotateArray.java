//!https://leetcode.com/problems/rotate-array/

class rotateArray {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int j, last;
            last = nums[nums.length - 1];
            for (j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
        System.out.print(nums);
    }
}