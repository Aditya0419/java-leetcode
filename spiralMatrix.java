import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();

        int sr=0,sc=0,er= matrix.length-1,ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            System.out.println("hi");
            for (int i = sc; i <= ec; i++) {
                System.out.println("1");
                res.add(matrix[sr][i]);
            }

            for (int j = sr+1; j <= er; j++) {
                System.out.println("2");
                res.add(matrix[j][ec]);
            }

            for (int i = ec-1; i >= sc; i--) {
                System.out.println("3");
                if(sr==er){
                    break;
                }
                res.add(matrix[er][i]);
            }

            for (int j = er-1; j >= sr+1; j--) {
                System.out.println("4");
                if(sc==ec){
                    break;
                }
                res.add(matrix[j][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        System.out.println(res);
        return res;
    }
    
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(mat));
    }
}
