import java.util.Arrays;

public class zigZagConversion {
    public static String convert(String s, int numRows) {
        if(s.length()==0 || s.length()==1 || s.length()==2 || numRows==1) return s;
        StringBuilder[] str = new StringBuilder[numRows];

        for (int i = 0; i < str.length; i++) {
            str[i] = new StringBuilder();
        }

        int row = 0;
        boolean goingDown = false;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i);
            if (row == 0 || row == numRows-1) goingDown = !goingDown;
            System.out.println(row+" "+i+" "+goingDown);
            if(goingDown){
                str[row].append(s.charAt(i));
                row++;
            }else{
                str[row].append(s.charAt(i));
                row--;
            }
        }
        System.out.println(Arrays.toString(str));

        StringBuilder res=new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            res.append(str[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("paypalishiring", 4));
    }
}
