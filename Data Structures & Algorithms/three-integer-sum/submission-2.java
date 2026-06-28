class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(nums);
        int  i ;
    
            
for ( i=0 ;i <nums.length; i++){
    int j= i+1;
    int k =nums.length - 1;

if(i>0 && nums[i] == nums[i-1]){
    continue;
}
    while(j<k){
        int sum = nums[i]+nums[j]+nums[k];

       if(sum==0){
        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
        j++;
        k--;
        while(j<k && nums[j] == nums[j-1]){
            j++;
        }
       }
       
        // Sum value less that 0 then  right left i.e is j
        else if(sum<0){
            j++;
        } 
        else if(sum>0){
            k--;
        }

    }
}
     return ans;
    }
}
