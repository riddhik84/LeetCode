class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        boolean firstcaps = false;
        
        int lowers = 0;
        int uppers = 0;
        
        for(int i = 0; i < len; i++){
            char ch = word.charAt(i);
            if(i == 0 && Character.isUpperCase(ch)){
                firstcaps = true;
            }
            if(Character.isUpperCase(ch)){
                ++uppers;
            }
            if(Character.isLowerCase(ch)){
                ++lowers;
            }
        }
        
        if((lowers == len) || (uppers == len) || (firstcaps && lowers == len - 1))
            return true;
        
        return false;
    }
}