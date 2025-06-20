class Solution {
    // Bubble sort in descending order
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {  // Sorting in descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

  
    public int removeElement(int[] nums, int val) {
        int count = 0;

       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];  
                count++;                
            }
        }

       
        int[] sortedArray = new int[count];
        for (int i = 0; i < count; i++) {
            sortedArray[i] = nums[i];
        }
        bubbleSort(sortedArray);

        // Optionally, copy the sorted array back to `nums`
        for (int i = 0; i < count; i++) {
            nums[i] = sortedArray[i];
        }

        return count;  // Return the number of valid elements after removal
    }
}
