class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        if(n<=1){
            return s;
        }

        boolean[][] dp = new boolean[n][n];

        int start = 0;
        int maxLen = 1;

        for(int i = 0; i < n; i++){
            dp[i][i] = true;
        }

        for(int len = 2; len <= n; len++){
            for(int i = 0; i <= n - len; i++ ){
                int endInd = i + (len - 1);
                if(s.charAt(i)==s.charAt(endInd)){
                    if(len == 2 || dp[i+1][endInd-1]){
                        dp[i][endInd] = true;

                        if(len>maxLen){
                            maxLen = len;
                            start = i;
                        }
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}