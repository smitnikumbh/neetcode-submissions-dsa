class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();

        for(int x:nums){
            set.add(x);
        }
        int longest=0;
        int streak = 1;
        int current = 0;

        for(int num: nums){
            if(!set.contains(num-1)){
                current = num;
                streak = 1;
                while(set.contains(current+1)){
                    current++;
                    streak ++;
                }
            }
            longest = Math.max(longest,streak);
        }

return longest;
    }
}
