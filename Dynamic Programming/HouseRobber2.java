class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length<2)
            return nums[0];
        int[]startfirst = new int[nums.length+1];
        int[]startsecond = new int[nums.length+1];
        startfirst[0]=0;
        startfirst[1]=nums[0];
        startsecond[0]=0;
        startsecond[1]=0;
        for(int i=2;i<=nums.length;i++){
            startfirst[i]= Math.max(startfirst[i-1],startfirst[i-2]+nums[i-1]);
            startsecond[i]= Math.max(startsecond[i-1],startsecond[i-2]+nums[i-1]);
            

        }
        return Math.max(startfirst[nums.length-1],startsecond[nums.length]);
    }
}
