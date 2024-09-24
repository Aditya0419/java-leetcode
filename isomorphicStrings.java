import java.util.HashMap;

public class isomorphicStrings{
    public static boolean isIsomorphic(String s, String t) {
        // String res="";
        HashMap<Character,Character> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){ 
            if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))==t.charAt(i)){
                System.out.println("if "+" first string "+s.charAt(i)+" second "+t.charAt(i));
                
            }
            else if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            else {
                System.out.println("else "+" first string "+s.charAt(i)+" second "+t.charAt(i));
                if(hm.containsValue(t.charAt(i))){
                    System.out.println("else if");
                    return false;
                }else{
                    System.out.println("else else"+i);
                    hm.put(s.charAt(i),t.charAt(i));
                    
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add "));
    }
}