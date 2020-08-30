/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int dest = target - nums[i];
            if (map.containsKey(dest)) {
                return new int[] {map.get(dest), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum Solution");
    }
}
