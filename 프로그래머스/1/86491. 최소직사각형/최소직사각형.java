class Solution {
    public int solution(int[][] sizes) {
        
        for(int i = 0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        return wallet(sizes);
    }
    
    public int wallet(int[][] walletSizes) {
        int widthMax = walletSizes[0][0];
        int heightMax = walletSizes[0][1];
        
        for(int i = 1; i< walletSizes.length; i++) {
            if(walletSizes[i][0] > widthMax) {
                widthMax = walletSizes[i][0];
            }
            
            if(walletSizes[i][1] > heightMax) {
                heightMax = walletSizes[i][1];
            }
        }
        
        return widthMax * heightMax;
    }

}