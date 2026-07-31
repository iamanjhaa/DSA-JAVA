public class bitManu {
    // odd
  public static void oddEven(int n) {

if((n & 1) == 1){
    System.out.println("even");
     }else{
    System.out.println("odd");
     }
    }

    //Get ith

    public static int getIth(int n , int i) {
         int bitMask = 1<<i;
         if((n & bitMask) == 0){
             return 0;
         }
    return 1;

}

// set Ith

    public static int setIth (int n , int i){
        int bitMask = 1<< i;
        return n | bitMask;
    }


    // clear Last i bits

    public static int clearLastBit(int n , int i){
        int bitMask = (~0) << i;

        return n & bitMask;
    }

    //clear range

    public static int clearRange(int n , int i , int j){
        int a = (~0) << j+1;
        int b = (1 << i ) - 1;

        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
// give here accordingly function name with parameter's value
System.out.println(clearRange(15, 2 ,4 ));


    }

}
