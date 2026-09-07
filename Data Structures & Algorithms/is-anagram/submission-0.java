class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isana=true;
        int[]freq=new int[256];
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)]++;
            }
            for(int i=0;i<t.length();i++){
                freq[t.charAt(i)]--;
            }
            for(int i=0;i<256;i++){
                if(freq[i]!=0){
                    isana=false;
                }
                
                }
            }
            if(isana)return true;
            else return false;
        
    }
}
