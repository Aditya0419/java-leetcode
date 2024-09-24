import java.util.Stack;

public class evaluateReversePolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int fi = s.pop();
                int se = s.pop();
                int res = 0;
                switch (tokens[i]) {
                    case "+":
                        res = fi + se;
                        break;
                    case "-":
                        res = se - fi;
                        break;
                    case "*":
                        res = fi * se;
                        break;
                    case "/":
                        res = se / fi;
                        break;
                }
                s.push(res);

            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        evaluateReversePolish e = new evaluateReversePolish();
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(e.evalRPN(tokens));
    }
}
