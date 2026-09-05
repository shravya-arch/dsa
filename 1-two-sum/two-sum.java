class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        /*
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if(arr[i]+arr[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        */
        Map<Integer,Integer> hmap =new HashMap<>();
        for(int i=0;i<n;i++) {
        int req=target-arr[i];
        if(hmap.containsKey(req)) {
            return new int[]{hmap.get(req),i};
        } else {
            hmap.put(arr[i],i);
        }
        }
        return new int[]{-1,-1};
        
    }
}