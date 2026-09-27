class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Creating frequcny hashmap
        HashMap <Integer, Integer> map = new HashMap<>(); 
        
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }else{
                map.put(x,1);
            }
        }

// Creating Array of size nums.lenght+1
List <Integer>[] bucket  = new List[nums.length+1];
for (int i = 0; i < bucket.length; i++) {
    bucket[i] = new ArrayList<>();
}
map.forEach((key,value)->{
    bucket[value].add(key);
});

List<Integer> result = new ArrayList<>();

        for (int i =bucket.length-1; i>=0 && result.size()<k;i--){
            for(int num: bucket[i]){
                result.add(num);
                 if (result.size() == k) break;  // k numbers mil gaye, ruk jao
            }
        }
// Step E: List ko int[] mein convert karo (return type ke liye)
int[] finalResult = new int[k];
for (int i = 0; i < k; i++) {
    finalResult[i] = result.get(i);
}
return finalResult;
        
        
        
        
        
           }
}
