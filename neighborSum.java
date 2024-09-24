public class neighborSum {
    int[][] grid;
    public neighborSum(int[][] grid) {
        this.grid=grid;
    }
    
    public int adjacentSum(int value) {
        int s=-1,k=-1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==value){
                    s=i;k=j;
                    break;
                }
            }
            if(s!=-1 && k!=-1){
                break;
            }
        }
        if(s==-1 && k==-1) return 0;
        int sum=0;
        if(s>0) sum+=grid[s-1][k];
        if(k>0) sum+=grid[s][k-1];
        if(s<grid.length-1) sum+=grid[s+1][k];
        if(k<grid[0].length-1) sum+=grid[s][k+1];

        return sum;
    }
    
    public int diagonalSum(int value) {
        int s=-1,k=-1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==value){
                    s=i;k=j;
                    break;
                }
            }
            if(s!=-1 && k!=-1){
                break;
            }
        }
        if(s==-1 && k==-1) return 0;
        int sum=0;
        if(s==-1 && k==-1) return 0;
        if(s>0 && k>0) sum+=grid[s-1][k-1];
        if(s<grid.length-1 && k>0) sum+=grid[s+1][k-1];
        if(s<grid.length-1 && k<grid[0].length-1) sum+=grid[s+1][k+1];
        if(s>0 && k<grid[0].length-1) sum+=grid[s-1][k+1];

        return sum;
    }
}
