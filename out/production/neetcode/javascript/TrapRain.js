var trap = function(height) {
    totalWaterAmount = 0;
    leftMax = height[0];
    rightMax = height[height.length-1]
    leftIndex = 0;
    rightIndex = height.length-1;

    while(leftIndex < rightIndex){

        if(leftIndex <= rightIndex){
            leftIndex++;
            if(height[leftIndex] < leftMax){
                totalWaterAmount+= leftMax-height[leftIndex];
                
            }else{
                leftMax = height[leftIndex];
            }
        }else{
            rightIndex--;
            if(height[rightIndex] < rightIndex){
                totalWaterAmount+= rightMax-height[rightIndex];
            }else{
                rightMax = height[rightIndex];
            }
        }


    }


    return totalWaterAmount;
};
    

console.log(trap([0,1,0,2,1,0,1,3,2,1,2,1]));