class Solution {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> list= new ArrayList<>();

        backtrack(0 , n , k , res , list);
        return res;
    }

    public void backtrack(int idx , int n , int k  , List<List<Integer>> res ,List<Integer> list){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        //Set<Integer> set=  new HashSet<>();
        for(int i =idx+1 ;i<=n ; i++){
            
                list.add(i);
                backtrack(i,n , k ,res,list);
                list.remove(list.size()-1);
                
            
        }
    }
}

//T.C - >  O( C(n,k) * k ) where C(n,k) is the number of combinations from 1...n of size k and k is 
//S.C - > O(k) for the recursion stack and O( C(n,k) * k ) for the result list ;    