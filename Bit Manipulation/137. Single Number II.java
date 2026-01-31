class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int  i = 0 ; i<32 ; i++){

            int count1 = 0;

            for(int k : nums){
                
                if( (k& (1<<i)) !=0){
                    count1++;
                }
            }
            if(count1%3==1){
                res |= (1<<i);
            } 
        }

        return res;
    }
}

//T.C -> O(32*N)  => O(N)
//S.C -> O(1)