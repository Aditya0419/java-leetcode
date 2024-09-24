import java.util.HashMap;

public class intRoman {
    public static  String intToRoman(int num) {
        String res="";
        
        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(1, "I");
        hm.put(4, "IV");
        hm.put(5, "V");
        hm.put(9, "IX");
        hm.put(10, "X");
        hm.put(40, "XL");
        hm.put(50, "L");
        hm.put(90, "XC");
        hm.put(100, "C");
        hm.put(400, "CD");
        hm.put(500, "D");
        hm.put(900, "CM");
        hm.put(1000, "M");


        
        int unit=num%10;
        int ten=((num%100)-unit)/10;
        int hundred=((num%1000)-(ten*10)-unit)/100;
        int thousand=((num%10000)-hundred)/1000;

        System.out.println(thousand+" "+hundred+" "+ten+" "+unit);

        for (int i = 0; i < thousand; i++) {
            res+=hm.get(1000);
        }

        if(hundred>=5 && hundred!=9 ){
            res+=hm.get(500);
            hundred-=5;
            for (int i = 0; i < hundred; i++) {
                res+=hm.get(100);
            }
        }else if(hundred<5 && hundred!=4){
            for (int i = 0; i < hundred; i++) {
                res+=hm.get(100);
            }
        }else if(hundred==4 || hundred == 9){
            res+=hm.get(hundred*100);
        }

        if(ten>=5 && ten!=9){
            res+=hm.get(50);
            ten-=5;
            for (int i = 0; i < ten; i++) {
                res+=hm.get(10);
            }

        }else if(ten<5 && ten!=4 ){
            for (int i = 0; i < ten; i++) {
                res+=hm.get(10);
            }
        }else if(ten==4 || ten==9){
            res+=hm.get(ten*10);
        }

        if(unit>=5 && unit!=9){
            res+=hm.get(5);
            unit-=5;
            for (int i = 0; i < unit; i++) {
                res+=hm.get(1);
                }

        }else if(unit<5 && unit!=4){
            for (int i = 0; i < unit; i++) {
                res+=hm.get(1);
            }
        }else if(unit==4 || unit==9){
            res+=hm.get(unit);
        }



        
        return res;
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(5692));
    }
}
