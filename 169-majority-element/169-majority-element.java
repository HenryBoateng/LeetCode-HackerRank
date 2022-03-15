class Solution {
    public int majorityElement(int[] nums) {
        int allCount = nums.length/2;
        
        for (int n : nums){
            int count = 0;
            for (int elem : nums){
                if (elem == n){
                    count += 1;
                }
            }
            if (count > allCount) {
            return n;
        }
        
        }
        return -1;
    }
}