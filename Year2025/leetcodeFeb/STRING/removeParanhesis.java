package STRING;
import java.util.*;
public class removeParanhesis {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack <Character> st =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(!st.isEmpty())sb.append(c);
                st.push(c);
            }else{
                st.pop();
                if(!st.isEmpty())sb.append(c);
            }
        }
        return sb.toString();
        // int count = 0;
        // StringBuilder sb = new StringBuilder();
        // for(char ch : s.toCharArray()){
        //     if(ch == '('){
        //         if(count > 0){
        //             sb.append(ch);
        //         }
        //         count++;
        //     }
        //     else{
        //         count--;
        //         if(count > 0){
        //             sb.append(ch);
        //         }
        //     }
        // }
        // return sb.toString();
    }
}
