class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map <Integer, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<26;i++)
        {
            char ch = (char) ('z'-i);
            map.put(i,ch);
        }

        for(int i=0;i<words.length;i++)
        {
            int sum = 0;
            String str = words[i];
            for(int j=0;j<str.length();j++)
            {
                sum += weights[str.charAt(j) - 'a'];
            }
            sb.append(map.get(sum % 26));
        }
    return sb.toString();
    }
}