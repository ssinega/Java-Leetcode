class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>(); //hashmap - store numbers and their indices
        for(int i=0;i<nums.length;i++)  {
            int complement = target - nums[i];
            if (map.containsKey(complement))  { //check complement already exists in map
                return new int[] {map.get(complement),i}; //return the indices

            }
            map.put(nums[i],i);
        }
        return new int[] {};
        
    }
}
