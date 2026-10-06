class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> window = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {

            // Duplicate exists in the current window
            if (window.contains(nums[right])) {
                return true;
            }

            // Add the new value
            window.add(nums[right]);

            // Keep the window size at most k
            if (window.size() > k) {
                window.remove(nums[right - k]);
            }
        }

        return false;
    }
}