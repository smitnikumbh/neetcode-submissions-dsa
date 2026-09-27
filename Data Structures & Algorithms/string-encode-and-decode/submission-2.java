class Solution {

    public String encode(List<String> strs) {
StringBuilder sb = new StringBuilder();
for (String str:strs){
sb.append(str.length());
sb.append("#");
sb.append(str);
}
return sb.toString();
    }

    public List<String> decode(String str) {
         List<String> strs = new ArrayList<>();


int i = 0;
while(i<str.length()){
    int j=i;
    while(str.charAt(j)!='#'){
        j++;
    }
    int length= Integer.parseInt(str.substring(i,j));

    // Skip that fucking #
    j++;
    String st = str.substring(j,j+length);
    
    strs.add(st);
    i=j+length;

}
return strs;

    }
    
}
