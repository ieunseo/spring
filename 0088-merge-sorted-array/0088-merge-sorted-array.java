class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1.length = m+n
        // nums2.length = n
        int i = m - 1; // 배열은 0부터 시작임으로 끝 위치는 -1
        int j = n - 1;
        int k = m + n - 1; // 총길이.

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){ // 더 큰값을 nums1[k] 자리에 넣음
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        // nums2[] 가 nums1[] 보다 길때 방어로직
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}