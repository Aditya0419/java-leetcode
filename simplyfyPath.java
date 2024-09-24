import java.util.Stack;
wrong code




public class simplyfyPath {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i)=='/' && sb.length()>0){
                String dir=sb.toString();

                if(dir.equals("..") && !s.empty()){
                    s.pop();
                }else if(!dir.equals("...") && ! dir.equals(".")){
                    s.push(dir);
                }

                sb.setLength(0);
            }
            else if(i<path.length() && path.charAt(i)!='/'){
                sb.append(path.charAt(i));
            }
        }

        String res="";

        while(!s.isEmpty()){
            res="/"+s.pop()+res;
        }

        return res.length()==0?"/":res;

    }
}
