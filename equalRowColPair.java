public class equalRowColPair {
    public static int equalPairs(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][0]==grid[0][j]){
                    for (int k = 0; k < grid.length; k++) {
                        if(grid[i][k]!=grid[k][j]){
                            break;
                        }else if(k==grid.length-1 && grid[i][k]==grid[k][j]) count++;
                    }
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        };
        System.out.println(equalPairs(grid));
    }
}
