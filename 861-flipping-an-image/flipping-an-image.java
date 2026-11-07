class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[][] arr = new int [row][col];

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                arr[i][image[i].length-j-1] = image[i][j];
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
}