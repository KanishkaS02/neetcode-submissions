class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] newarr=new int[n];
        //left product
        newarr[0]=1;
        for(int i=1;i<n;i++){
            newarr[i]=newarr[i-1]*nums[i-1];

        }
        //right product
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            newarr[i]*=suffix;
            suffix*=nums[i];
        }
        return newarr;
        
        
    }
}  
