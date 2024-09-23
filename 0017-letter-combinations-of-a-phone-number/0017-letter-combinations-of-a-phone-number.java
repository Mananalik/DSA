class Solution {
    public List<String> letterCombinations(String digits) {
    List<String> ans = solve("",digits);
    return ans;
    }
    static List<String> solve(String ans, String ip) {

        if(ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if(ans==""){
                return list;
            }
            list.add(ans);
            return list;
        }

        int digit = ip.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }

        ArrayList<String> list = new ArrayList<>();

        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(ans+ch, ip.substring(1)));
        }

        return list;

    }
}