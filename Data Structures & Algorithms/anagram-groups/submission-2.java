class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        // Going through each string
        for(String str : strs ){
        // TO sort  string we need to convert it into chars
        char ch [] = str.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);

        // Check if key is absernt add str if not prsent 
        // act -> key  ma
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
