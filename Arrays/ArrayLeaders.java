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
