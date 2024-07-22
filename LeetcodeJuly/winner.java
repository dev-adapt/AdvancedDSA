public class winner {
    public static String losingPlayer(int x, int y) {
       int count=1;
       x--;
       y-=4;
       while(x>=1 && y>=4){
        x--;
        y-=4;
        count++;
       }
       return count%2==0?"Bob":"Alice";
    }

    public static void main(String[] args) {
        int x=3,y=11;
        System.out.println(losingPlayer(x, y));
    }
}
