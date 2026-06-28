class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>(); 
        
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }else{
                map.put(x,1);
            }
        }
        // Now we will convert this Map to list to sort

        ArrayList <Map.Entry<Integer,Integer>>list = new ArrayList<>(map.entrySet());

        list.sort((a,b)-> b.getValue()- a.getValue());

        int result []= new int[k];

        for (int i =0; i<k;i++){
            result [i] = list.get(i).getKey();
        }
        return result;
        
        
        
        
        
           }
}
