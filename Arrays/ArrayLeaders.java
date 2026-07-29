public class ArrayLeaders {
    public static void FindLeader(int arr[]){
        int n = arr.length;
        int maxRight = arr[n-1];
        System.out.println("leader  " + maxRight);
        for(int i = n-2; i>=0; i--){
            if(arr[i] > maxRight){
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {2,17,9,5,3};
        FindLeader(arr);
    }
}

ex [16,17,4,3,5,2]
    output : 17,5,2 



    // we should find the max numbers from right side end and compare with Previous one if found greater number 
    //Compare with next then print also them and continue step by step compare 
