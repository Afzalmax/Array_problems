int removeElement(int* nums, int numsSize, int val) {
    int k = 0; // Initialize the counter for the remaining elements
    
    // Loop through the array
    for (int i = 0; i < numsSize; i++) {
        // If the current element is not equal to val, move it to the k-th position
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++; // Increment the counter
        }
    }
    
    // k is the number of elements not equal to val
    return k;
}
