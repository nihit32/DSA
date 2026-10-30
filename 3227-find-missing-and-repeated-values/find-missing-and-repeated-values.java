class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hs = new HashSet<>();
        int n = grid.length;
        int sq = n*n;
        int Actualsum =  sq* (sq+1)/2;

        int missing = 0 , repeating = 0 , hashsum = 0;
        
        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                if(hs.contains(grid[i][j])){
                    repeating = grid[i][j];
                }
                else{
                    hs.add(grid[i][j]);
                    hashsum += grid[i][j];
                }
            }
        }
        missing = Actualsum - hashsum;
        int[] ans = new int[2];

        return new int[]{repeating,missing};
    }
}