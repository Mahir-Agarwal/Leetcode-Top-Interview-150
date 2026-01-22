//isme kuch new that i+1 nhi i only usye same element multiple time le lete aur target<0 agar target minus me jaye toh return u got this ,  aur vo same structure like others ezz , aur target nikal ne ke liye ez har baar target -  nums[i] jaise he equal hoga add that subset
class Solution {
    public int n;

    public void solve(int index,List<List<Integer>> res ,List<Integer> curr,int[] nums,int target){
    
        if(target<0)  // this is imp 
        {return;}
        else if(target==0){
            res.add(new ArrayList<>(curr));
        }else{
        for(int i=index;i<n;i++){
            curr.add(nums[i]);
            solve(i,res,curr,nums,target-nums[i]);//isme i not i+1 because hum same element multiple baar le sakte hai ;
            curr.remove(curr.size()-1);
        }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        n = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(0, res, curr, candidates, target);
        return res;
    }
}