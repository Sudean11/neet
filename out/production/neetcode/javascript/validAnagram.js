var isAnagram = function(s, t) {
    var sSplit = s.split("");
    var tSplit = t.split("");
    if(sSplit.length != tSplit.length){
        return false;
    }

    for(var a = 0; a<sSplit.length; a++){
        if(tSplit.includes(sSplit[a])){
            tSplit.splice(tSplit.indexOf(sSplit[a]),1);
        }else{
            return false;
        }
    }
    return true;
};

console.log(isAnagram("anagsram", "nagaram"));