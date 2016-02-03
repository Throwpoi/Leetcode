
public class Add_And_Search_Word {
    TrieNode root=new TrieNode();
    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            char k=word.charAt(i);
            if(temp.alphebat[k-'a']==null) temp.alphebat[k-'a']=new TrieNode();
            temp=temp.alphebat[k-'a'];
        }
        temp.isLeaf=true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    boolean help(String word, TrieNode root){
        if(word.length()==0) return root.isLeaf;
        char k=word.charAt(0);
        if(k=='.'){
            for(int j=0;j<26;j++){
                if(root.alphebat[j]!=null&&help(word.substring(1),root.alphebat[j])) return true;
            }
            return false;
        }
        else{
            if(root.alphebat[k-'a']==null) return false;
            else return help(word.substring(1),root.alphebat[k-'a']);
        }
    }
    
    public boolean search(String word) {
        return help(word,root);
    }
}
