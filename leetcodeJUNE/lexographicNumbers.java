package leetcodeJUNE;

import java.util.ArrayList;
import java.util.List;

public class lexographicNumbers {
    static  List<Integer> lexicalOrder(int n) {
            List<Integer> ans = new ArrayList<>();
            backtrack(1, n, ans);
            return ans;
          }

          static void backtrack(int cur, int n, List<Integer> ans) {
            if (cur > n) return;
            ans.add(cur);
            backtrack(cur * 10, n, ans);
            if (cur % 10 != 9)
              backtrack(cur + 1, n, ans);
          }
      

    public static void main(String[] args) {
        System.out.println(lexicalOrder(0));
    }

}