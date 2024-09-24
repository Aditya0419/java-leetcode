import java.util.List;

public class snakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0, j = 0;
        for (int j2 = 0; j2 < commands.size(); j2++) {
            String command = commands.get(j2);
            switch (command) {
                case "UP":
                    i--;
                    break;
                case "DOWN":
                    i++;
                    break;
                case "RIGHT":
                    j++;
                    break;
                case "LEFT":
                    j--;
                    break;
                default:
                    break;
            }
        }

        return (i*n)+j;
    }
}
