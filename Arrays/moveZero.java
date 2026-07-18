public class moveZero {
    
    void pushZerosToEnd(int[] arr) {
        // code here
        int j = 0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

// ==========================
// Dry Run
// ==========================

// Input:
// arr = [1, 0, 2, 0, 3, 4]

// Initially:
// j = 0

// i = 0
// arr[0] = 1 (Non-zero)
// Swap arr[0] with arr[0]
// Array = [1, 0, 2, 0, 3, 4]
// j = 1

// i = 1
// arr[1] = 0
// Skip

// i = 2
// arr[2] = 2 (Non-zero)
// Swap arr[2] with arr[1]
// Array = [1, 2, 0, 0, 3, 4]
// j = 2

// i = 3
// arr[3] = 0
// Skip

// i = 4
// arr[4] = 3 (Non-zero)
// Swap arr[4] with arr[2]
// Array = [1, 2, 3, 0, 0, 4]
// j = 3

// i = 5
// arr[5] = 4 (Non-zero)
// Swap arr[5] with arr[3]
// Array = [1, 2, 3, 4, 0, 0]
// j = 4

// Final Output:
// [1, 2, 3, 4, 0, 0]

