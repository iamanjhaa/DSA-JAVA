class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int next =0;
        int n = nums.length;
        for(int i = 0; i<n ; i++){

            //circlur or rotation nikalne ki formula
            next = (i+1)%n;

            if(nums[i] > nums[next]){
                count++;
            }
        }
        // agr humar array jo ki already sorted hai to fir humara only 0 aur 1 tyme break mangta hai 
        // us se jyda nhi wrna wo unsorted array kehlayega !!
        return count<=1;
    }
}
