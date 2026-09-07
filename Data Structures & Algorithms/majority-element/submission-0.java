class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
        if(map.get(nums[i])>nums.length/2){
            return nums[i];
        }
    }
    return -1;
}
}