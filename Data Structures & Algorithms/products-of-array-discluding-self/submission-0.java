class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] output = new int[nums.length];
        int leftprod = 1;

        for (int i = 0; i < nums.length; i++){
            output[i] = leftprod;
            leftprod *= nums[i];
        }

        int rightprod = 1;
        for (int i = nums.length - 1; i >=0; i--){
            output[i] = rightprod * output[i];
            rightprod *= nums[i];
        }
        return output;
        
    }
}  
