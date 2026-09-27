class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        // area of rectangle = lenght (height) * breadth (width)
        
        int l = 0;
        int r = heights.length-1;

        while(l<r){
            int width = r-l;
            int heigth = Math.min(heights[l],heights[r]);
            int area  = width * heigth;

             max  = Math.max(area, max);

            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return max;
    }
}
