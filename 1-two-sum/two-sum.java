class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int firstval = nums[i];
            int secondval = target - nums[i];

            if(hm.containsKey(secondval)){
                return new int[] {hm.get(secondval), i};
            }else{
                hm.put(nums[i],i);
            }
        }

        return new int[] {-1,-1};
    }
}