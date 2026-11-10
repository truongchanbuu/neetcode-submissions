class Solution {
    public int[] productExceptSelf(int[] nums) {
        int allProduct = 1;
        int allProductExceptZero = 1;
        int countZero = 0;
        for (int n : nums) {
            allProduct *= n;
            if (n != 0) allProductExceptZero *= n;
            if (n == 0) countZero++;
        }

        System.out.println(allProductExceptZero);
        if (countZero == nums.length) return nums;

        int[] producted = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0 && countZero < 2) {
                producted[i] = allProductExceptZero;
            } else if (nums[i] == 0 && countZero >= 2) {
                producted[i] = 0;
            } else {
                producted[i] = allProduct / nums[i];
            } 
        }
        return producted;
    }
}  
