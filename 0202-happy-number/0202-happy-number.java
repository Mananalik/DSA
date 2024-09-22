class Solution {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;
        do {
            s = findSq(s);
            f = findSq(findSq(f));
        }while(f!=s);
        if(s==1){
            return true;
        }
        return false;
    }
    static int findSq(int num){
        int ans=0;
        while(num>0){
            int rem = num%10;
            ans = ans + rem*rem;
            num=num/10;
        }
        return ans;
    }
}