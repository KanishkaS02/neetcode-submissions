class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0,r=n-1;
        int maximum=0;
        while(l<r){
            int h=Math.min(heights[l],heights[r]);
            int w=r-l;
            int a=h*w;
            maximum=Math.max(a,maximum);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return maximum;
        
    }
}
