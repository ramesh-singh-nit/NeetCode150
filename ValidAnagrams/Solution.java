public class Solution {
    public boolean isAnagram(String s, String t) {
        int [] testArr= new int[26];

        if(s.length()!= t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            testArr[s.charAt(i) - 'a']++;
            testArr[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++){
            if(testArr[i]!= 0){
                return false;
            }
        }
        return true;
    }
}
