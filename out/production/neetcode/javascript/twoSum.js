function twoSum(nums, target){
    var a = nums;
    for(var i = 0; i<a.length; i++){
        for(var j = i+1; j<a.length; j++){
            if(a[i]+a[j]== target){
                console.log(i, j);
            }
        }
    }


}

twoSum([2,7,11,15],9);