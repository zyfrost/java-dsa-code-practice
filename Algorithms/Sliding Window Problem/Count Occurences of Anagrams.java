//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        int[] patFreq = new int[26];
        int[] txtFreq = new int[26];
        int k = pat.length();
        for(int i = 0 ; i< k ;i++){
            int index = pat.charAt(i)- 97;
            patFreq[index]++;
        }
        
        for(int i = 0 ; i< k ;i++){
            int index = txt.charAt(i)- 97;
            txtFreq[index]++;
        }
        int count = 0;
        if(Arrays.equals(patFreq,txtFreq)){
            count++;
        }
        int n = txt.length();
        for(int i = 1; i< n - k + 1 ; i++){
            int removeCharIndex = txt.charAt(i-1)-97;
            int addedCharIndex = txt.charAt(i + k - 1)-97;
             txtFreq[addedCharIndex]++;
            txtFreq[removeCharIndex]--;
            if(Arrays.equals(patFreq,txtFreq)){
            count++;
        }
        }
        return count;
    }
}
