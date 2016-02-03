class TrieNode {
    // Initialize your data structure here.
    boolean isLeaf;
    TrieNode[] alphebat;
    public TrieNode() {
        isLeaf=false;
        alphebat=new TrieNode[26];
    }
}

public class Implement_Trie {
    private TrieNode root;

    public Implement_Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            char k=word.charAt(i);
            if(temp.alphebat[k-'a']==null) temp.alphebat[k-'a']=new TrieNode();
            temp=temp.alphebat[k-'a'];
        }
        temp.isLeaf=true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            char k=word.charAt(i);
            if(temp.alphebat[k-'a']==null) return false;
            else temp=temp.alphebat[k-'a'];
        }
        return temp.isLeaf;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode temp=root;
        for(int i=0;i<prefix.length();i++){
            char k=prefix.charAt(i);
            if(temp.alphebat[k-'a']==null) return false;
            temp=temp.alphebat[k-'a'];
        }
        return true;
    }
}
