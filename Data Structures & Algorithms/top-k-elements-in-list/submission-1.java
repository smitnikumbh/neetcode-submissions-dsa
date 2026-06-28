class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        
        // Adding frequency
        for (int x:nums){
          if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
          }else{
            map.put(x,1);
          }
        }
// Sorting this Mapn-> to sort lets convert to arraylist
ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

// Sorting desending based on values
list.sort((a,b)->b.getValue() - a.getValue());

int[] result = new int[k];
for (int i = 0; i < k; i++) {
    result[i]=  list.get(i).getKey();
   
}

 return result;   
    }
}
