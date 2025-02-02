import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li=new ArrayList<>();

        HashMap<String,ArrayList<String>> hm=new HashMap<>();

        for(String s :strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            if(hm.containsKey(String.valueOf(ch))){
                hm.get(String.valueOf(ch)).add(s);
            }else{
                ArrayList<String> al=new ArrayList<>();
                al.add(s);
                hm.put(String.valueOf(ch),al);
            }
        }

        li.addAll(hm.values());
        

        System.out.println(hm);
        return li;
    }
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
