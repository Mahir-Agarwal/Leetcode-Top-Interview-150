class Solution {
    public List<String> generateParenthesis(int n) {
        

        List<String> res = new ArrayList<>();

        solve(0,0,"",n,res);

        return res;
    }
    public void solve(int left , int right, String s , int n ,List<String> res){

        if(s.length()== n*2){
            res.add(s);
            return;
        }

        if(left <n){
            solve(left+1, right , s+"(" ,n, res);
        }
        if(right <left){
            solve(left,right+1,s+")",n,res);
        }
    }

}

//T.C-> O(4^n / sqrt(n) )
//S.C-> O(n) 