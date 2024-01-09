var isPalindrome = function(s) {

    var newStr = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    var arr = newStr.split("");

    var newStr2 = newStr.split("").reverse().join('');
    if(newStr == newStr2){
        return true;
    }
    return false;
};

console.log(isPalindrome("A man, a plan, a canal: Panama"));
