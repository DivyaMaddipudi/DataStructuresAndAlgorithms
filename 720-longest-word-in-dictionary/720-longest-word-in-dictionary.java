class Solution {
    
    class TrieNode {
        TrieNode[] children;
        String word;
        
        public TrieNode() {
            children = new TrieNode[26];
        }
    }
    
    TrieNode root;
    public void insert(String word) {
        TrieNode curr = root;
        // System.out.println(word);
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(curr.children[ch-'a'] == null) {
                curr.children[ch-'a'] = new TrieNode();
            }
            curr = curr.children[ch-'a'];
        }
        curr.word = word;
    }
    
    String maxWord = "";
    int max = 0;
    public String longestWord(String[] words) {
        root = new TrieNode();
        if(words == null || words.length == 0) return "";
        
        for(String word: words) {
            insert(word);
        }
        
        TrieNode curr = root;
        dfs(curr);
        return maxWord;
    }
    
    
    public void dfs(TrieNode root) {
        if(root.word != null && root.word.length() > max) {
            max = root.word.length();
            maxWord = root.word;
        }
        
        for(int i=0;i<26;i++) {
            if(root.children[i] != null && root.children[i].word != null) {
                dfs(root.children[i]);
            }
        }
    }
}