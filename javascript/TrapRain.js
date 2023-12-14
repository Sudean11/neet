// /**
//  * @param {number[]} height
//  * @return {number}
//  */
// var trap = function(height) {
    
//     var nodeHeight = 0;
//     nodeHeight = height[0];
//     var latestWaterAmount = 0;
//     var totalWaterAmount = 0;
    
//     for(var i = 1; i<height.length; i++){
//         if(nodeHeight > height[i]){
//             latestWaterAmount += nodeHeight-height[i];
//             console.log(height[i]+ ", LatestWaterAmount "+ latestWaterAmount + ", Total Water amount: "+ totalWaterAmount);
//         }else{
//             totalWaterAmount+=latestWaterAmount;
//             console.log(height[i]+ ", LatestWaterAmount "+ latestWaterAmount + ", Total Water amount: "+ totalWaterAmount);
//             latestWaterAmount = 0;
//             nodeHeight = height[i];
//         }
//     }
//     return totalWaterAmount;
// };
    

// console.log(trap([0,1,0,2,1,0,1,3,2,1,2,1]));



/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    totalWaterAmount = 0;
    leftMost = height[0];
    leftMostIndex = 0;

    for(var i = 1; i<height.length; i++){
        if(leftMost > height[i]){
            continue;
        }
        else{
            
            var water = 0;
            for(var j = leftMostIndex; j <= i; j++){
                water+=leftMost-height[j];
            }
            console.log("leftMost: "+leftMost+", leftMostIndex: "+leftMostIndex+ ", total water: "+totalWaterAmount);
            if(water>0){
                totalWaterAmount+=water;
            }
            leftMost = height[i];
            leftMostIndex = i;
        }

    }

    
    return totalWaterAmount;
};
    

console.log(trap([0,1,0,2,1,0,1,3,2,1,2,1]));