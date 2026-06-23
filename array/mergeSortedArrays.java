// https://leetcode.com/problems/merge-sorted-array/description/

/*ALGORITHM:
    1. Initialize last to m + n - 1 (the last index of nums1).
    2. While both m > 0 and n > 0.
        - Compare nums1[m - 1] and nums2[n - 1].
        - Place the larger value at nums1[last] and decrement the corresponding pointer.
        - Decrement last.
    3. If any elements remain in nums2, copy them to nums1.
*/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //size of the final array
        int lastIdx = m + n - 1; // we can also take size of array 1

        //while there are elements left in both of the arrays
        while(m > 0 && n > 0){
            //if the ele of arr1 > ele of arr2
            //put the ele of arr1 in the last idx in the arr1
            if(nums1[m - 1] > nums2[n - 1]){
                nums1[lastIdx] = nums1[m-1];
                m--; 
            }
            //if ele from arr2 is greater than or equal to the ele from arr1
            //put the ele from arr2 in the lastidx of arr1
            else{
                nums1[lastIdx] = nums2[n - 1];
                n--;
            }
            lastIdx--;
        }

        //if there are still elements remaining elements from the nums2 array
        while(n > 0){
            nums1[lastIdx] = nums2[n - 1];
            n--;
            lastIdx--;
        }
    }
}