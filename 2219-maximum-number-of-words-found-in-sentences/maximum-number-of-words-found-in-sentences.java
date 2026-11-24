class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount = 0;
        for(String temp : sentences){
            String arr[] = temp.split(" ");
            int count = arr.length;
            if(maxcount < count) maxcount = count;
        }

        return maxcount;
    }
}