class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
       

        while(left <= right){
             int mid = left + (right - left) /2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
} 


// if want isert 2 at it's correct  index in array 
//suppose [1,3,4,5] convert into [1,2,3,4,5]
