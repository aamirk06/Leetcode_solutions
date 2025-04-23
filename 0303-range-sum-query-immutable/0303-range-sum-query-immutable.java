class NumArray {
   int[] prifixSum = null;

    public NumArray(int[] nums) {
       prifixSum = new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
        prifixSum[i+1]=prifixSum[i]+nums[i];
       }
    }

    public int sumRange(int left, int right) {
        return prifixSum[right+1]-prifixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */