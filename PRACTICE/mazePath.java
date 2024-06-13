package PRACTICE;

public class mazePath {
    static String path(int sr, int sc, int n,int m,String s){
        if(sr==n && sc<m)return path(sr, sc+1, n, m, s+"R");
        if(sc==m && sr<n)return path(sr+1, sc, n, m, s+"D");
        if(sr==n && sc==m)return s+"  ";
        return path(sr, sc+1, n, m,s+"R")+path(sr+1, sc, n, m,s+"D");
    }
    public static void main(String[] args) {
        int n=3,m=3,sr=1,sc=1;
        String s="";
        System.out.println(path(sr, sc, n, m,s));
    }
}
