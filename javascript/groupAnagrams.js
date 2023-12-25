var anagrams = new Map();
var groupAnagrams = function(strs) {
   
    for(var a = 0; a<strs.length; a++){
        var anagramChecked = false;
        for(const key of anagrams.keys()){
            if(key == "empty"){
                anagramChecked = anagramChecked || checkIfIsAnagram("", strs[a]);
            }
            else{
                anagramChecked = anagramChecked || checkIfIsAnagram(key, strs[a]);
            }
        }
        if(!anagramChecked){

            if(strs[a] == ''){
                anagrams.set("empty", [""]);
            }else{
                const existingValuesForKey1 = []; 
                existingValuesForKey1.push(strs[a]);
                anagrams.set(strs[a], existingValuesForKey1);
            
            }

        }
    }
    const flattenedArray = Array.from(anagrams.values());
    console.log(anagrams);
    console.log(flattenedArray);
    anagrams = new Map();
    return flattenedArray;
};

function checkIfIsAnagram (first, second){
    for(var i = 0; i<first.split("").length; i++){
        if(!second.includes(first.split("")[i])){
            return false;
        }
    }
    if(first == ""){
        existingValuesForKey1 = anagrams.get("empty") || []; 
        existingValuesForKey1.push(second);
        anagrams.set("empty", existingValuesForKey1);
    }else{
        existingValuesForKey1 = anagrams.get(first) || []; 
        existingValuesForKey1.push(second);
        anagrams.set(first, existingValuesForKey1);
    }
    return true;
}

groupAnagrams(["", "b"]);