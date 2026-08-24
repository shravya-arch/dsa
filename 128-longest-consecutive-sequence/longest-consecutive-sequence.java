class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if (n == 0) return 0;
        int currcnt=0;
        int longest=1;
        int last_smaller=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            if(nums[i]-1==last_smaller) {
                currcnt+=1;
                last_smaller=nums[i];
            } else if(nums[i]!=last_smaller) {
                currcnt =1;
                last_smaller=nums[i];
            }
            longest=Math.max(longest,currcnt);
        }
        return longest;
    }
}