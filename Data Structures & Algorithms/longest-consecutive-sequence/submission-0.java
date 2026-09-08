class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlength=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int current=nums[i];
                int length=1;
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                maxlength=Math.max(length,maxlength);
            }

        }
        return maxlength;
    }
}
