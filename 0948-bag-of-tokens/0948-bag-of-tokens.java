class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0;
        int r=tokens.length-1;
        int score =0;
        int maxScore = 0;
        while(l<=r){
            if(power >= tokens[l]){
                score++;
                power -= tokens[l];
                l++;
            }
            else if(score >=1 ){
                power+= tokens[r];
                score--;
                r--;
            }
            else
                break;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}