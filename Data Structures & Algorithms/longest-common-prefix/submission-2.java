class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Edge case — null or empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume entire first word is the prefix
        // We shrink it as we compare with other words
        String prefix = strs[0];

        // Start from second word — first word is already our prefix
        for (int i = 1; i < strs.length; i++) {

            // Keep shrinking prefix until strs[i] starts with it
            // indexOf returns 0 if strs[i] STARTS WITH prefix
            while (strs[i].indexOf(prefix) != 0) {

                // Remove last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix is empty — no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // What remains is the longest common prefix
        return prefix;
    }
}





// ## Dry Run

// ```
// strs = ["flower", "flow", "flight"]
// prefix = "flower"

// i=1 → compare "flow" with "flower"
//    "flow".indexOf("flower") = -1 → shrink → "flowe"
//    "flow".indexOf("flowe")  = -1 → shrink → "flow"
//    "flow".indexOf("flow")   =  0 ✅ stop
//    prefix = "flow"

// i=2 → compare "flight" with "flow"
//    "flight".indexOf("flow") = -1 → shrink → "flo"
//    "flight".indexOf("flo")  =  0 ✅ stop
//    prefix = "flo"

// return "flo" ✅
// ```