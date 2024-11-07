
public class minChange {
    public static int minChanges(String s) {
        int n = s.length();
        int operations = 0;
        for(int i=0; i<n-1; i+=2){
            if(s.charAt(i) != s.charAt(i+1)) operations++;
        }
        return operations;
    }
    public static void main(String[] args) {
        String s="11000111";
        System.out.println("hello");
        System.out.println(minChanges(s));
        System.out.println("byebye");
    }
}
