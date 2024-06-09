package leetcodeJUNE;

// import java.util.Deque;
// import java.util.LinkedList;

//contest biweekly 132
public class winningKgames {
    static int findWinningPlayer(int[] skills, int k) {
    //     int idx=-1,previous=0,compare=k;
    //     Deque<Integer> deque = new LinkedList<Integer>();
    //     for(int i=0;i<skills.length;i++){
    //         deque.add(i);
    //     }
    //    while(compare>0){
    //     int player1=deque.pop();
    //     int player2=deque.pop();
      
    //     if(skills[player1]>skills[player2]){
    //         deque.addLast(player2);
    //         deque.addFirst(player1);
    //         idx=player1;
    //     }
    //     else {
    //         deque.addFirst(player2);
    //         deque.addLast(player1);
    //         idx=player2;
    //     }
    //     if(previous==deque.peek()) compare--;
    //     else {
    //         compare--;
    //         previous=deque.peek();
    //     }
    //    }
    //     return idx;
    int n = skills.length;
    int winnerIndex = 0; // Initialize the winner's index to the first player
    int consecutiveWins = 0; // Track consecutive wins
    
    for (int i = 1; i < n; i++) {
        // If the current player's skill is greater than the winner's skill
        // Update the winner's index and reset consecutive wins
        if (skills[i] > skills[winnerIndex]) {
            winnerIndex = i;
            consecutiveWins = 0;
        }
        
        // If the winner has won k consecutive games, return the winner's index
        if (++consecutiveWins == k) {
            return winnerIndex;
        }
    }
    
    return winnerIndex; 
    }
    public static void main(String[] args) {
        int[]skills={16,4,7,17};
        int k=562084119;
        System.out.println(findWinningPlayer(skills, k));
    }
}
