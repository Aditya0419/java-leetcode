import java.util.ArrayList;
import java.util.Arrays;

public class candyProb {
    public static int candy(int[] ratings) {
        int candies = 0;
        int[] candy = new int[ratings.length];

        for (int i = 0; i < ratings.length; i++) {
            candy[i] = 1;
        }

        for (int i = 0; i < ratings.length - 1; i++) {
            int j = i;
            if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]) {
                candy[i] = candy[i + 1] + 1;
                System.out.println("upper if");

                while (j - 1 >= 0 && ratings[j - 1] > ratings[j] && candy[j - 1] <= candy[j]) {
                    candy[j - 1] = candy[j] + 1;
                    j--;
                    System.out.println(Arrays.toString(candy) + " i: " + i + "xx " + ratings.length);
                }

            }

        }
        System.out.println(Arrays.toString(candy));
        for (int i = ratings.length - 1; i > 0; i--) {
            System.out.println(Arrays.toString(candy) + "i: " + i);
            if (ratings[i] > ratings[i - 1] && candy[i] <= candy[i - 1]) {
                System.out.println("lower if");
                System.out.println(Arrays.toString(candy) + "i: " + i);
                candy[i] = candy[i - 1] + 1;

                int j = i;

                while (j + 1 < ratings.length && ratings[j + 1] > ratings[j] && candy[j + 1] <= candy[j]) {
                    System.out.println(Arrays.toString(candy));

                    System.out.println("problem: " + candy[j] + " " + candy[j + 1]);
                    candy[j + 1] = candy[j] + 1;
                    j++;

                }

            }
            System.out.println(Arrays.toString(candy));

        }

        for (int i = 0; i < candy.length; i++) {
            candies += candy[i];
        }

        return candies;
    }

    public static void main(String[] args) {
        int[] arr = { 3,2,1,1,4,3,3 };
        candy(arr);
    }
}
