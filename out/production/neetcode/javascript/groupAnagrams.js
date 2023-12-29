var groupAnagrams = function(strs) {
    const anagrams = {};
    for (const str of strs) {
        const sortedStr = str.split('').sort().join('');
        if (!anagrams[sortedStr]) {
            anagrams[sortedStr] = [str];
        } else {
            anagrams[sortedStr].push(str);
        }
    }
    console.log(anagrams);
    return Object.values(anagrams);
};

const result = groupAnagrams(["eat", "tan", "ate", "nat", "bat"]);
console.log(result);