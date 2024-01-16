var binarySearch = function(arr, target){
    var high = arr.length-1, low = 0, index = Math.floor(arr.length/2);
    while(low <= high){
        if(target == arr[index]){
            return index;
        }else if(target < arr[index]){
            high = index-1;
            index = Math.floor((high+low)/2)
        }else{
            low = index+1;
            index = Math.floor((high+low)/2)
        }
    }
    return -1;
}

console.log(binarySearch([1,3,4], 4));