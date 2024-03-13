function twoSum(numbers, target){
    var firstIndex = 0;
    var lastIndex = numbers.length-1
    numbers.sort()
    console.log(lastIndex)

    while(true){
        var sum = numbers[firstIndex] + numbers[lastIndex]
        if(sum == target){
            return [firstIndex, lastIndex;
        }
        if(sum > target){
            lastIndex--;
        }else{
            firstIndex++;
        }
    }
}

console.log(twoSum([2,7,11,15],9));