class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int len=1;
        int k=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                len++;
            }
            else if(nums[i+1]==nums[i]){
                continue;
            }
            else{
                k=Math.max(len,k);
                len=1;
            }
            
        }
        return Math.max(len,k);
        
           
        }
        
        
    }

