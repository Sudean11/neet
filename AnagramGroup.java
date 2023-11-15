// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGroup {

    public static void main(String[] args) {
        new AnagramGroup().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> anagramHash = new HashMap<>();
        for(String singleString: strs){

            char[] stringArray = singleString.toCharArray();
            Arrays.sort(stringArray);
            String sortedWord = new String(stringArray);

            if(anagramHash.containsKey(sortedWord)){
                anagramHash.get(sortedWord).add(singleString);
            }else{
                List<String> list = new ArrayList<>();
                list.add(singleString);
                anagramHash.put(sortedWord, list);
            }
        }
        List<List<String>> returnValue = new ArrayList<>();
        for(String key: anagramHash.keySet()){
            returnValue.add(anagramHash.get(key));
           
        }

        return returnValue;
        
    }
}
