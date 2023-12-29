var productExceptSelf = function(nums) {
    var preprodArr = [1];
    var postProdArr = [1];
    postProdArr[nums.length-1] = 1;
    for(var i = 1; i<nums.length; i++)  {
        preprodArr[i] = preprodArr[i-1] * nums[i -1];
    }
    for(var i = nums.length-2; i>=0; i--)  {
        postProdArr[i] = postProdArr[i+1] * nums[i + 1];
    }
    var finalArr = [];
    for(var i = 0; i<preprodArr.length; i++){
        finalArr[i] = preprodArr[i] * postProdArr[i];
    }
    console.log(finalArr);
    return finalArr;
};

productExceptSelf([1,2,3,4]);