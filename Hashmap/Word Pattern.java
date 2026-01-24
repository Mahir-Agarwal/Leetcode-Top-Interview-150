class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map =  new HashMap<>();
        Set<String> set = new HashSet<>();
        String arr[]  =s.trim().split("\\s");
        if (pattern.length() != arr.length) return false;

        for(int i = 0 ; i<pattern.length();i++){

            char ch = pattern.charAt(i);
            String curr = arr[i];
            if(map.containsKey(ch) ){
                if(!map.get(ch).equals(curr)) return false;
            }else{
                if(set.contains(curr)) return false;

                set.add(curr);
                map.put(ch , curr);
            }

            // map.putIfAbsent(ch, curr);
            
        } 

        return true;
    }
}