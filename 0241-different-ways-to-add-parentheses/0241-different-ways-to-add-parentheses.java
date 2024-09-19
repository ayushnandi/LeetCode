class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0  ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                List<Integer> left = diffWaysToCompute(s.substring(0,i));
                List<Integer> right = diffWaysToCompute(s.substring(i+1));
                for(int l : left){
                    for(int r : right){
                        if(c=='+'){
                            list.add(l + r);
                        }
                        else if(c=='-'){
                            list.add(l - r);
                        }
                        else if(c=='*'){
                            list.add(l * r);
                        }
                    }
                }
            }
        }
        if(list.size()==0){
            list.add(Integer.valueOf(s));
        }
        return list;
    }
}