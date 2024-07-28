import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Create a new array to hold the combined elements of nums1 and nums2
        int[] mergedArray = new int[nums1.length + nums2.length];
        
        // Copy the elements of nums1 into mergedArray
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        
        // Copy the elements of nums2 into mergedArray
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        
        // Sort the merged array
        Arrays.sort(mergedArray);
        
        // Find the median
        int n = mergedArray.length;
        if (n % 2 == 0) {
            // If the array length is even, the median is the average of the two middle elements
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        } else {
            // If the array length is odd, the median is the middle element
            return mergedArray[n / 2];
        }
    }
}
