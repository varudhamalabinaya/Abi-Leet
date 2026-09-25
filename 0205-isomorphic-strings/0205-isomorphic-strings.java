class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        if(arr1.length != arr2.length){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverse = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){

            char c1 = arr1[i];
            char c2 = arr2[i];

            if(map.containsKey(c1) && map.get(c1) != c2){
                return false;
            }

            if(reverse.containsKey(c2) && reverse.get(c2) != c1){
                return false;
            }

            map.put(c1, c2);
            reverse.put(c2, c1);
        }
        return true;
    }}
  //  return true;
