import java.util.*;

public class Word_Ladder {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Set<String> startList=new HashSet<String>();
        startList.add(beginWord);
        int result=1;
        while(!startList.isEmpty()){
            Set<String> startList2=new HashSet<String>();
            for(String word:startList){
                for(int i=0;i<word.length();i++){
                    for(char a='a';a<='z';a++){
                        if(a==word.charAt(i)) continue;
                        StringBuilder temp=new StringBuilder(word);
                        temp.setCharAt(i,a);
                        String newString=temp.toString();
                        if(newString.equals(endWord)) return result+1;
                        if(wordList.contains(newString)){
                            wordList.remove(newString);
                            startList2.add(newString);
                        }
                    }
                }
            }
            startList=startList2;result++;
        }
        return 0;
    }
    
    public int ladderLength1(String beginWord, String endWord, Set<String> wordList) {
        Set<String> startList=new HashSet<String>();
        Set<String> endList=new HashSet<String>();
        startList.add(beginWord);endList.add(endWord);
        int result=1;
        while(!startList.isEmpty()&&!endList.isEmpty()){
            if(startList.size()>endList.size()){
                Set<String> k=startList;startList=endList;endList=k;
            }
            Set<String> newSet=new HashSet<String>();
            for(String word:startList){
                for(int i=0;i<word.length();i++){
                    for(char a='a';a<='z';a++){
                        if(a==word.charAt(i)) continue;
                        StringBuilder temp=new StringBuilder(word);
                        temp.setCharAt(i,a);
                        String newString=temp.toString();
                        if(endList.contains(newString)) return result+1;
                        if(wordList.contains(newString)){
                            wordList.remove(newString);
                            newSet.add(newString);
                        }
                    }
                }
            }
            startList=newSet;result++;
        }
        return 0;
    }
}
