var containsDuplicate = function(nums) {
    const set = new Set();
    for(var element of nums){
        if(set.has(element)){
            return true;
        }
        set.add(element);
    };
    return false;
};

console.log(containsDuplicate([1,2,3,1]));