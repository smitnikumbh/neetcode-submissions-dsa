class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> freqmap = new HashMap<>();

        for (String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
             String key = new String(ch);



            if(!freqmap.containsKey(key)){
             freqmap.put(key,new ArrayList<>());
        }
        freqmap.get(key).add(str);
        
    
    }
        return new ArrayList<>(freqmap.values());
}
}