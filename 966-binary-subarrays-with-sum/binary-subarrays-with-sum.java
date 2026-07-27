class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      int oddcount=0;
      int ans=0;
      for(int num:nums){
        if(num%2!=0)
            oddcount++;
        ans+= map.getOrDefault(oddcount-goal,0);
        map.put(oddcount,map.getOrDefault(oddcount,0)+1);
      } 
      return ans; 
    }
}