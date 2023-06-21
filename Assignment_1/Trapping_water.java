 /* Precumputtaion of Dp
  Create and array and store Hightest Hight from left - right
  Create and array and store Hightest Hight from right - left

*/

  class Solution {
    public int trap(int[] height) {
     
 int total_water =0;
 int left[] = new int[n];
 int right[] = new int[n];

  left[0] = height[0];
  
  for(itn i=1; i<n; i++){
  left[i] = Math.max(left[i - 1] , height[i]);
  }

  right[n-1] = height[n-1];

  for(itn i=n-2; i>=0; i--){
  right[i] = Math.max(right[i + 1] , height[i]);
  }

  for(int crt=0; crt<height.length; crt++){
   int current = height[crt];
   int current_water = Math.min(left_high , right_high) - current;
     total_water += current_water;
  }


    
        return total_water;

    }
}
