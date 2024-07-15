import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class delete{
    public int minimumCost(int m, int n, int[] x, int[] y) {
        // ArrayList<Integer>x=new ArrayList<>();
        // for(int i:horizontalCut)x.add(i);
        // ArrayList<Integer>y=new ArrayList<>();
        // for(int i:verticalCut)x.add(i);
        // x.sort(Comparator.reverseOrder());
        // y.sort(Comparator.reverseOrder());
        // int verticalPieces=1,horizontalPieces=1;
        // int totalCost=0;
        // int i=0,j=0;
        // while(i<m-1&&j<n-1){
        //     if(x.get(i)>y.get(j)){
        //         totalCost+=x.get(i)*horizontalPieces;
        //         verticalPieces++;
        //         i++;
        //     }else{
        //         totalCost+=y.get(i)*verticalPieces;
        //         horizontalPieces++;
        //         j++;
        //     }
        // }
        // if(i<m-1){
        //     totalCost+=x.get(i)*horizontalPieces;
        //     i++;
        // }else if(j<n-1){
        //     totalCost+=y.get(j)*verticalPieces;
        //     j++;
        // }
        // return totalCost;
        Arrays.sort(x);
        Arrays.sort(y);
        int i=x.length-1;
        int j=y.length-1;
        int row=1,col=1;
        int ans=0;
        while(i>=0 || j>=0){
            int a=i>=0?x[i]:-1;
            int b=j>=0?y[j]:-1;
            if(a>=b){
                ans+=(a*row);
                col++;
                i--;
            }else{
                ans+=(b*col);
                row++;
                j--;
            }
        }
        return ans;
    }
}

def calculate_relevance_score(submission, theme):
    score = 0
    # Check if the submission items match the theme keywords
    theme_keywords = theme.split()  # Assume theme is a string of keywords
    for item in submission['items']:
        for keyword in theme_keywords:
            if keyword.lower() in item['description'].lower():
                score += 1
    
    # Add points for completeness
    if submission['top_wear'] and submission['bottom_wear'] and submission['shoes'] and submission['accessories']:
        score += 5

    # Add points for creativity (e.g., based on admin ratings or user votes)
    score += submission.get('creativity_score', 0)
    return score

# Example usage
submission = {
    'items': [{'description': 'Red floral top'}, {'description': 'Blue jeans'}, {'description': 'White sneakers'}],
    'top_wear': True,
    'bottom_wear': True,
    'shoes': True,
    'accessories': ['Watch', 'Bracelet'],
    'creativity_score': 3
}
theme = "floral red casual"
score = calculate_relevance_score(submission, theme)
print(f"Relevance Score: {score}")

