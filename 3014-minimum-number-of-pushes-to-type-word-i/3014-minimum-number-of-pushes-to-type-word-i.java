class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
int ans = 0;

if(n > 8){
    ans += 8;
    n -= 8;
}else{
    return n;
}

if(n > 8){
    ans += 8 * 2;
    n -= 8;
}else{
    return ans + n * 2;
}

if(n > 8){
    ans += 8 * 3;
    n -= 8;
}else{
    return ans + n * 3;
}

return ans + n * 4;
    }
}