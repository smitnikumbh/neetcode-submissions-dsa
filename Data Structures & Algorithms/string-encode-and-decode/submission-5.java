class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
        sb.append(str.length());
        sb.append("#");
        sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
ArrayList <String> string = new ArrayList<>();

int i=0;    
while (i < str.length()) {
int j=i;
while(str.charAt(j)!='#'){
    j++;
}

// 4#neet
int length = Integer.parseInt(str.substring(i,j));


// Now skipping  #
j++;

String text = str.substring(j,j+length);
string.add(text);

i = j+length;
}
return string;
     
    }
}
