package leetcode;

public class maximumTime {
    static String maxTime(String s) {
        StringBuilder str=new StringBuilder(s);
     char z=s.charAt(0);
     char one=s.charAt(1);
     char three=s.charAt(3);
     char four=s.charAt(4);
     //checking the HH
     if(z=='?'&&one=='?'){
         str.setCharAt(0 ,'2' );
         str.setCharAt( 1,'3' );
     }
    else if(z=='?'&&one!='?'){
             if(one>'3') str.setCharAt(0 ,'1' );
             else  str.setCharAt( 0,'2' );
    }
    else if(z!='?'&&one=='?'){
             if(z<'2')str.setCharAt(1,'9');
             else str.setCharAt(1,'3');
    }else{
         str.setCharAt(0,z);
         str.setCharAt(1 ,one );
    }

    if(three=='?'&&four=='?'){
     str.setCharAt(3 ,'5' );
     str.setCharAt( 4,'9' );
 }
else if(three=='?'&&four!='?'){
      str.setCharAt(3, '5');
}
else if(three!='?'&&four=='?'){
        str.setCharAt(4,'9');
}else{
     str.setCharAt(3,three);
     str.setCharAt(4 ,four );
}
     
    
     return str.toString();
 }

    public static void main(String[] args) {
        String time = "2?:3?";
        System.out.println(maxTime(time));
    }
}
