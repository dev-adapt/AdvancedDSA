
public class crawlerLogFolder {
    public static int minOperations(String[] logs) {
       int count=0;
        for(String i:logs){
            if(i.equals("../"))count--;
            else if(i.equals("./"))count=count;
            else count++;
            if(count<0)count=0;
        }
        return count<0?0:count;
    }
    public static void main(String[] args) {
        String []logs = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
        String []logs2={"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs2));
    }
}