class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
       List<String> strs = new ArrayList<>();
       int i=0;
       while (i<str.length()){
         
         int j=i;
         while(str.charAt(j)!='#'){
            j++;
         }


// Example string "3#neet3#code"
// i=0 j=1 at 1 we get substring 0 as 1 is exclued so at 0 we get "4"
// Connverting that string 4 into int 4 below

         int length = Integer.parseInt(str.substring(i,j));

        //  Read string of that legth ...skipin that fucking #
        j++; //+1 skiping that fucking #
        
        String s = str.substring(j,j+length);
        
        // adding that string to our list
        strs.add(s);

        // Move pointer
        i= j+length;


       }
       return strs;
    }
}
