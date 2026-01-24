class Solution {
    public int hIndex(int[] citations) {
        
       // if(citations.length ==1 ) return 1;
        Arrays.sort(citations);

        int s = 0 ;
        int e = citations.length-1;
        int n =citations.length;
        int ans = 0 ;
        while(s<=e){
            int mid = (s+e)/2;

            if (citations[mid] >= (n-mid)){
                ans = n-mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }

        return ans ; 
    }
}

// [3,0,6,1,5]
//  0,1,3,5,6

//T.C-> O(NlogN)
//S.C-> O(1)