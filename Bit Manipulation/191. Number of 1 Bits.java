
class Solution {
    public int hammingWeight(int n) {
        int total =0;
        for(int i =0 ; i<32 ; i++){

            if( (n&(1<<i))!=0) total++;
        }

        return total;
    }
}

    /// Another Approach
    ///  Integer.bitCount(n)
    
    //T.C: O(1)
    //S.C: O(1)