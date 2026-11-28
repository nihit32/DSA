class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> list  = new ArrayList<>();
       while(true){
        int sum = 0;
        while(n>0){
            int dig = n%10;
            sum += Math.pow(dig,2);
            n /= 10;
        }
        if(sum == 1) return true;
        if(list.contains(sum)) return false;
        else list.add(sum);
        n = sum;
       }
    }
}