class solution {
  public static int findDist(int[] nums1 , int[] nums2 , int d) {
    int count = 0;
    for(int i =0; i<nums1.length; i++) {
      boolean found = false;
      for(int j = 0; j<nums2.length; j++) {

    if(Math.abs(nums1[i] - nums2[j] ) <= d) {
      
        found = true;
        break;
      } 
      }

    if(found == false) {
      count++;
    }
    }
    return count;
  }
}
