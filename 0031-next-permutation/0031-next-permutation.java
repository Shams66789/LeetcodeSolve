class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
    
        // Find the first element from the right that is smaller than the element next to it
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
    
        // If there is no such element, the array is sorted in descending order, so reverse it
        if (i < 0) {
            reverse(nums, 0, n - 1);
            return;
        }
    
        // Find the smallest element from the right that is greater than nums[i]
        int j = n - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }
    
        // Swap nums[i] and nums[j]
        swap(nums, i, j);
    
        // Reverse the sub-array nums[i+1...n-1]
        reverse(nums, i + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}