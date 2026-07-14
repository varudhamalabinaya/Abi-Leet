class Solution {
    public int mostWordsFound(String[] sentences) {
       int high=0;
       for(String str:sentences) {
        String currL[]=str.split(" ");
        int m=currL.length;
        if(high<m){
            high=m;
        }
       }
       return high;
    }
}