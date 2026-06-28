class Solution {
    public int[] twoSum(int[] num, int target) {
        int left  = 0;
        int right  = num.length-1;

        int sum;
        while(left<right){

            sum = num[left] + num[right];
            if (sum==target){
               return new int[]{left+1, right+1};
            }
else if(sum > target){
    right --;
}
else if(sum < target){
    left ++;
}

   

        }
    return new int[]{-1,-1};
    }
}
