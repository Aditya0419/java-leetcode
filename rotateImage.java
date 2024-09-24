import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class rotateImage {
    public static void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j < i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int sc = 0;
        int ec = matrix.length - 1;
        while (sc < ec) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][sc];
                matrix[i][sc] = matrix[i][ec];
                matrix[i][ec] = temp;
            }
            sc++;
            ec--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
    }
}
