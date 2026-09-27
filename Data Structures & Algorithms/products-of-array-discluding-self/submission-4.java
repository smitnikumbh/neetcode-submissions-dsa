class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int result []  = new int[n];

// Pass 1 from left to right storing prefix in result
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1] * nums[i-1];
        }

// Pass 2: from right to left multiplying suffix in result
int suffixProd = 1;
for(int i=n-1;i>=0;i--){
    result[i] *= suffixProd;
    suffixProd = suffixProd * nums[i];
}
return result;
    }
}  
