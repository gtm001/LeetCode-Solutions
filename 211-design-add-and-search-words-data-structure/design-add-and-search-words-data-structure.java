class WordDictionary {
    static class Node{
        Node[] children;
        boolean eow;
        Node(){
            children = new Node[256];
            eow = false;
        }
    }
    Node root;
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // when i = str.length()-1;
    }
    
    public boolean search(String word){
        return searchHelp(word,root);
    }

    public boolean searchHelp(String word, Node curr) {
        // Node curr = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            // if there is ch = '.' char then,
            if(ch == '.'){
                for(int j=0;j<26;j++){
                    if(curr.children[j]!=null){
                        if (searchHelp(word.substring(i+1),curr.children[j])){
                            return true;
                        }
                    }
                }
                return false;
            }
            else{
            int idx = ch - 'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
         }
        }
        return curr.eow;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */