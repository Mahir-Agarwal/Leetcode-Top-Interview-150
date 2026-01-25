class Solution {
    public boolean isPalindrome(String s) {
        

        StringBuilder res =  new StringBuilder();

        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch) || Character.isLetter(ch)) {
                res.append(Character.toLowerCase(ch));
            }
        }

        return check(0, res.length()-1,res.toString());
    }

    public boolean check(int s , int e , String str){

        while(s<e){
            if(str.charAt(s) !=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }

        return true;
    }
}