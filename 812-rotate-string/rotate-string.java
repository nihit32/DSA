class Solution {
    public boolean rotateString(String s, String goal) {
        int s_len = s.length();
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)) return true; 
        for(int i=0; i<s_len; i++){
            String temp = "";
            temp = s.substring(1) + s.charAt(0);
            s = temp;

            if(temp.equals(goal)) return true;
        }
        return false;


    }
}