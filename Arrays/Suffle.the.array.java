class Solution {
    public int[] shuffle(int[] nums, int n) {
        
int[] ans = new int[2*n];
int store = 0;

for(int i = 0; i<n ; i++){
    
    ans[store] = nums[i];
    store++;

    ans[store] = nums[i+n];
    store++;
}



return ans;

    }
}
