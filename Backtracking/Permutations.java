//Har recursion call me hum saare numbers ko check karna chahte hain, Har index pe koi bhi number use ho sakta hai, isliye 0 se n tak chala rahe ho ,Ye required hai for permutations
//Ye sirf ek counter hai ki recursion next level pe jaa rahi hai ,Actually tu index kahi use nahi kar raha function me ,Iska koi special role nahi hai yahan. Tu solve(res, curr, nums, used) bhi likhta toh same kaam karta
//used[] ye ensure karta hai ki ,ek element ek permutation me ek hi baar aaye ,same value ke multiple indexes se same permutation na ban jaye 


class Solution {
    // public void solve(int index , List<List<Integer>> res ,List<Integer> curr , int []nums,boolean used[]){
    //     if(curr.size()==nums.length){
    //         res.add(new ArrayList<>(curr));
    //         return;
    //     }
    //     Set<Integer> set =  new HashSet<>();
    //     for(int i=0; i<nums.length;i++){
    //         if(!used[i]&&!set.contains(nums[i])){
    //             set.add(nums[i]);
    //             used[i] = true;
    //         curr.add(nums[i]);
    //         solve(index+1,res,curr,nums,used);
    //         curr.remove(curr.size()-1);
    //         used[i] = false;
    //         }
    //     }
    // }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
         boolean used[] =new boolean[nums.length];  
         Arrays.sort(nums);
        //  solve(0,res,curr,nums,used);
        //  return res;

        solve( 0, res , curr ,nums,used);
        return res;
    }

    public void solve(int idx ,  List<List<Integer>> res ,List<Integer> curr,int nums[],boolean used[]){
        
        if(curr.size() == nums.length){

            res.add(new ArrayList<>(curr)) ;
            return ;
        }

        Set<Integer> set = new HashSet<>();

        for(int i =0  ;i < nums.length ;i++){

            if(!used[i] && !set.contains(nums[i])){

                set.add(nums[i]);
                curr.add(nums[i]);
                used[i]= true;
                solve(idx+1,res ,curr , nums,used);
                used[i]= false;
                curr.remove(curr.size()-1);
                //set.remove(nums[i]);
            }
        }
    }
}