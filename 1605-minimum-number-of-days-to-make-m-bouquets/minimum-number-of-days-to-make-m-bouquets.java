class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long required=(long)m*k;
        if(required>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high= Integer.MIN_VALUE;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high= Math.max(high,day);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int count=0;
            int bouquets=0;
            for(int bloom: bloomDay){
                if(bloom<= mid){
                    count++;
                }
                    else{
                         bouquets+= count/k;
                    count=0;
                }
            }
            bouquets += count/k;
            if(bouquets>=m){
                high= mid-1;
            }
            else low=mid+1;
        }
    
    return low;
}
}