class Solution {
    class TrieNode {
        TrieNode[] children;
        boolean isEnd;
        
        public TrieNode() {
            children = new TrieNode[26];
        }
    }
    
    TrieNode root;
    public void insert(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            
            if(curr.children[ch-'a'] == null) {
                curr.children[ch-'a'] = new TrieNode();
            }
            curr = curr.children[ch-'a'];
        }
        curr.isEnd = true;
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        for(int i=0;i<dictionary.size();i++) {
            insert(dictionary.get(i));
        }
        
        String[] str =sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for(int j=0;j<str.length;j++) {
            if(j != 0) {
                res.append(" ");
            }
            String word = str[j];
            StringBuilder temp = new StringBuilder();
            TrieNode curr = root;
            
            for(int i=0;i<word.length();i++) {
                char ch = word.charAt(i);
                if(curr.children[ch-'a'] == null || curr.isEnd) {
                    break;
                } 
                temp.append(ch);
                curr = curr.children[ch-'a'];
            }
            
            if(curr.isEnd) {
                res.append(temp);
            } else {
                res.append(word);
            }
        }
        return res.toString();
    }
}