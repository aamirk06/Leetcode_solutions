class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0){
         return 0;
        }
        
        int maximum=nums[0];
        int minimum=nums[0];
        int result=nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i]<0){
             int temp = maximum;
                maximum = minimum;
                minimum = temp;
            }
           maximum=Math.max(nums[i],nums[i]*maximum);
           minimum=Math.min(nums[i],nums[i]*minimum);
            result = Math.max(result, maximum);

        }
        return result;
    }
}