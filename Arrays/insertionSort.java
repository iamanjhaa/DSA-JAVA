public class insertionArray {
    public static void main(String[] args) {
        int arr[] = {8,12,3,4,2,1};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > key) {
              arr[ prev + 1 ]= arr[prev];
                prev--;

            }

            arr[prev + 1] = key;
        }
        System.out.println("sorted insertion array ");
for (int i = 0; i < arr.length; i++){
    System.out.print(  arr[i] + " ");
}
    }
}
