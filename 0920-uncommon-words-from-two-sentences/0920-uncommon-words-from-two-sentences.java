class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s = s1 + " " + s2;
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        int j = 0 ;
        String [] arr = new String[result.size()];
        for(String i : result){
            arr[j++]= i;
        }
        return arr;  
    }
}