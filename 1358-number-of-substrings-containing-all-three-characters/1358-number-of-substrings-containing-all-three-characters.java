class Solution {
    public int numberOfSubstrings(String s) {
//Main logic of this code is that all the characters before the currect substring will be counted as a correct substrin which can be done by taking the ( min index +1 )
//Example->  a  b  c  a  b  c
//           0  1  2  3  4  5
//          |1st sub|
//             |2st sub|  {bca} & {abca} so ->  Min(1,2,3) + 1{which is bca}
//                                              = 1 which is {abca}
//therefore on each iteration we will be doing this 
        int n = s.length();
        int[] arr = {-1,-1,-1};
        int cnt=0;
        for(int i=0; i<n ; i++){
            arr[s.charAt(i) - 'a'] = i;
            if(arr[0] != -1 && arr[1] != -1 && arr[2] != -1 )
                cnt += (1+ Math.min(arr[0], Math.min(arr[1], arr[2])));
        }
        return cnt;
    }
}