class Solution {
    public int isPrefixOfWord(String sentence, String wrd) {
        HashMap<String, Integer> map = new HashMap<>();
        String [] arr = sentence.split(" ");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].startsWith(wrd)) {
                return j + 1; 
            }
        }
        return -1; 
    }
}