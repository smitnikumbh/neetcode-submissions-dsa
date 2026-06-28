class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric from left
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric from right
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            // Compare (case-insensitive)
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }

        return true;
    }
}