class Solution {
    class TrieNode{
        TrieNode childern[];
        int count;
        public TrieNode(){
            childern=new TrieNode[26];
            for(int i=0;i<26;i++){
                childern[i]=null;
            }
            count=0;
        }
    }
    class Trie{
        TrieNode root;
        public Trie(){
            root=new TrieNode();
        }
        public  void insert(String s){
            TrieNode node=root;
            for(char ch:s.toCharArray()){
                int i=ch-'a';
                if(node.childern[i]==null){
                    node.childern[i]=new TrieNode();
                }
                node.childern[i].count+=1;
               
                node=node.childern[i];
            }
        }
        public  int count_prefix(String s){
            TrieNode node=root;
            int sum=0;
            for(char ch:s.toCharArray()){
                int i=ch-'a';
                
                    sum+=node.childern[i].count;
            
                node=node.childern[i];
            }    
            return sum;
    }
        }
    
    public int[] sumPrefixScores(String[] words) {
        Trie trie=new Trie();
        for(String s:words){
            trie.insert(s);
        }
        int ans[]=new int[words.length];
        int count=0;
        for(String s:words){
            ans[count++]=trie.count_prefix(s);
        }
        return ans;
    }
}