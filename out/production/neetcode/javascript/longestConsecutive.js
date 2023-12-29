var longestConsecutive = function(nums) {
    
    sortedArr = nums.sort((x,y)=>x-y);
    longestConsecutiveNumber = 1;
    currentLength = 0;
    currentNumber = 0;
    console.log(sortedArr);

    if(sortedArr.length == 0){
        longestConsecutiveNumber = 0;
    }

    for(var i = 0; i<sortedArr.length; i++){
        if( currentLength ==0 ){
            currentLength = 1;
        }else{
            
            if(currentNumber == sortedArr[i]){
                continue;
            }

            if(currentNumber + 1 == sortedArr[i]){
                currentLength++;
                if(currentLength > longestConsecutiveNumber){
                    longestConsecutiveNumber = currentLength;
                }
            }else{
                if(currentLength > longestConsecutiveNumber){
                    longestConsecutiveNumber = currentLength;
                }
                currentLength = 1;
            }
        }
        console.log(sortedArr[i] +  " "+ longestConsecutiveNumber )

        currentNumber = sortedArr[i];
    }
    console.log(longestConsecutiveNumber);
    return longestConsecutiveNumber;
};

longestConsecutive([1,2,0,1]);