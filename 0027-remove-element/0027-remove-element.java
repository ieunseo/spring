class Solution {
    public int removeElement(int[] nums, int val) {
     int leng = nums.length;
        int i = 0;

        while (i < leng) {
            if (nums[i] == val) {
                nums[i] = nums[leng - 1]; 
                leng--;                   
            } else {
                i++;
            }
        }

        return leng; 
    }
}