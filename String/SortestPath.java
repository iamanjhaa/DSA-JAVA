public static double SortestPath(String path) {
  int x =0;
int y = 0;
for(inr i = 0; i< path.length(); i++) {
  char dir = path.charAt(i);
  if(dir == 'E') { 
    x++;
  if(dir == 'W') { 
    x--;
  }
   else if(dir == 'N') { 
    y++;
   } else if (dir == 'S' ) {
     y--;
   }
  }
  int X2 = x*x;
  int Y2 = y*y;
  return Math.sqrt( X2 + Y2) ;
}
}


//E : East 
// W : West 
// N : North 
// S South 
      
  
