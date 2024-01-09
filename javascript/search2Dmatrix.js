var searchMatrix = function(matrix, target) {
    var a = [].concat(...matrix);
    return a.includes(target);
};

console.log(searchMatrix([[1,3,5,7],[10,11,16,20],[23,30,34,60]],4));