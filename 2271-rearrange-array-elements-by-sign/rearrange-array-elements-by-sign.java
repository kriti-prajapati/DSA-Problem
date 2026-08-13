class Solution {
    public int[] rearrangeArray(int[] arr) {
      ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        for( int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr1.add(arr[i]);
            }
            else{
                arr2.add(arr[i]);

            }
        }
        int p=0;
         int n=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr1.get(p++);
            }
            else {
                arr[i]=arr2.get(n++);
            }
        }
    return arr;
    }
}
  
    
