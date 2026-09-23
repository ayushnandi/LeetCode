class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        generate(str,"",0,0,n);
        return str;
    }
    void generate(List<String> ans, String s, int open, int close, int n) {
        if (open == n && close == n) {
            ans.add(s);
            return;
        }

        if (open > close)
            generate(ans, s + ")", open, close + 1, n);

        if (open < n)
            generate(ans, s + "(", open + 1, close, n);
    }
}