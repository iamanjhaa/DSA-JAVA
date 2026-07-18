
    class RotateArray {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        
        d = d%n;
        
        reverse(arr, 0, d-1);
        reverse(arr, d , n-1);
        reverse(arr, 0 , n-1);
       
        
        
        
    }
    
    
    
    static void reverse(int arr[] , int start , int end){
        
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}




// ==========================
// Dry Run
// ==========================

// Input:
// arr = [1, 2, 3, 4, 5, 6, 7]
// d = 2

// n = 7
// d = d % n = 2

// --------------------------
// Step 1:
// reverse(arr, 0, d-1)
// reverse(arr, 0, 1)

// Before:
// [1, 2, 3, 4, 5, 6, 7]

// After:
// [2, 1, 3, 4, 5, 6, 7]

// --------------------------
// Step 2:
// reverse(arr, d, n-1)
// reverse(arr, 2, 6)

// Before:
// [2, 1, 3, 4, 5, 6, 7]

// After:
// [2, 1, 7, 6, 5, 4, 3]

// --------------------------
// Step 3:
// reverse(arr, 0, n-1)
// reverse(arr, 0, 6)

// Before:
// [2, 1, 7, 6, 5, 4, 3]

// After:
// [3, 4, 5, 6, 7, 1, 2]

// ==========================
// Final Output
// ==========================

// [3, 4, 5, 6, 7, 1, 2]
//
// Array ko left side me d = 2 positions rotate kar diya gaya.



