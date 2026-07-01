class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int num=0;
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);

            }
            else{
                num=i;
            }
        }
        return num;
        
    }
}
