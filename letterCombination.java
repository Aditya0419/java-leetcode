import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterCombination {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        HashMap<Character,String> hm=new HashMap<>();
        StringBuilder str=new StringBuilder();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        helper(res, digits, str, hm, 0);
        return res;
    }
    public void helper(List<String> res,String digits,StringBuilder str,HashMap<Character,String> hm,int c){
        if(c==digits.length()){
            res.add(str.toString());
        }else{

            for (int i = 0; i < hm.get(digits.charAt(c)).length(); i++) {
                str.append(hm.get(digits.charAt(c)).charAt(i));
                helper(res,digits,str,hm,c+1);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
    
}
