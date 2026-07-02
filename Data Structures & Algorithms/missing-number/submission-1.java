class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int finalsum=0;
        for(int i=0;i<=n;i++){
            finalsum+=i;

        }
        return finalsum-sum;
        
        
    }
}
