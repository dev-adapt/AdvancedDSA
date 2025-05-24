package Year2025.leetcodeMay.DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class traversals {
      public int assignEdgeWeights(int[][] edges) {
       
         Map<Integer, List<Integer>> graph = buildTree(edges);
        int root = graph.keySet().iterator().next(); // pick any node

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int levels = 0;

        queue.offer(root);
        visited.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            levels++; // increment level at the start of each level

            for (int i = 0; i < levelSize; i++) {
                int node = queue.poll();
                for (int neighbor : graph.get(node)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }
      
        return countOddSumWays( levels-1);
    }
     public int countOddSumWays(int n) {
        // dp[i][0] = even sum count using i places
        // dp[i][1] = odd sum count using i places
        int[][] dp = new int[n + 1][2];

        dp[0][0] = 1; // 0 places, sum is 0 (even)
        dp[0][1] = 0;

        for (int i = 1; i <= n; i++) {
            // Add 1 → flips parity
            // Add 2 → keeps parity
            dp[i][0] = dp[i - 1][1] + dp[i - 1][0]; // sum becomes even
            dp[i][1] = dp[i - 1][0] + dp[i - 1][1]; // sum becomes odd
        }
        int mod=(int)(1e9 +7);
        return dp[n][1]%mod; 
    }
     public Map<Integer, List<Integer>> buildTree(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
}
