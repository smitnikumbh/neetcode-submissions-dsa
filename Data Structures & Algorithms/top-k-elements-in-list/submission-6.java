class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        // Create Array of arraylist for bucket short
        ArrayList <Integer> bucket [] = new ArrayList[nums.length+1];
        for (int i=0; i<nums.length+1;i++){
            bucket[i] = new ArrayList();
        }

        map.forEach((key,value)->{
            bucket[value].add(key);
        });

        int result[] = new int[k];

int idx= 0;

        for(int i= bucket.length-1;i>=0;i--){
     for(Integer num:bucket[i] ){
        result[idx] = num;
        idx++;
        if(idx==k){
            return result;
        }
     }
        }
return result;
    }
}
