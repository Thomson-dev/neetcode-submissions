class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int left = 0; left < nums.length; left++) {

            int right = Math.min(left + k, nums.length - 1);

            Set<Integer> window = new HashSet<>();

            for (int i = left; i <= right; i++) {

                if (window.contains(nums[i])) {
                    return true;
                }

                window.add(nums[i]);
            }
        }

        return false;
    }
}