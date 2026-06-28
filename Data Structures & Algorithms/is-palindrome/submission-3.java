class Solution {
    public boolean isPalindrome(String s) {
        
       char sArr[] = s.toCharArray();
        int left = 0;
  int right  =s.length()-1;

        while (left<right){
         

         if(!Character.isLetterOrDigit(sArr[left])){
            left++;
            continue;
         }
          if(!Character.isLetterOrDigit(sArr[right])){
           right--;
            continue;
         }
            if (Character.toLowerCase(sArr[left]) != Character.toLowerCase(sArr[right])) {
    return false;
}
else{
                left ++;
                right --;
            }

          }

        

return true;

    }
}
