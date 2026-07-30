class solution {
  public static double  maximumSub(int[] nums , int k ) { // n= 4

double maxAvg = 100000;
    int sum = 0;
     for(int i = 0; i<nums.length-k ; i++ ) {
       for(int j = i; j <i+k ; j++ ) {
        sum = sum + nums[j];
       } 
       int avg = sum / k;
       maxAvg = Math.max(maxAvg , avg) ;
     }
  return maxAvg;
  }
}
       
         
  
