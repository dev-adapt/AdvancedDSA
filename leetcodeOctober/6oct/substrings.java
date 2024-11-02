import java.util.*;;

public class substrings {
    public static int minLength(String str) {
        StringBuilder s=new StringBuilder(str);
        boolean flag=true;
        while(flag){
            boolean check=false;
            for(int i=0;i<s.length();i++){
               
              
                char curr=s.charAt(i);
                if(curr=='A'){
                    if(i+1<s.length()&&s.charAt(i+1)=='B'){
                        
                        s.delete(i,i+2);
                        check=true;
                    }
                } else if(curr=='C'){
                    if(i+1<s.length()&&s.charAt(i+1)=='D'){
                        
                        s.delete(i,i+2);
                        check=true;
                    }
                }
               
               
            }
            if(check==false)flag=false;
            System.out.println(s);
        }
        return s.length();
    }
    public static void main(String[] args) {
        String str="CCCCDDDD";
        System.out.println(minLength(str));

    }
}
