var isValidSudoku = function(board) {
    
    console.log(validateRow(board) &&
    validateColumn(board) &&
    validateBox(board));
    
    return validateRow(board) &&
    validateColumn(board) &&
    validateBox(board);

};

function validateRow(board){
    var rowValidated = true;
    for(var singleRow of board){
        rowValidated = rowValidated && checkValidity(singleRow);
    }
    return rowValidated;
}

function checkValidity(data){
    var checkArr = [];
    for(var singleData of data){
        if(singleData.length != 1){
            return false;
        }
        if(singleData == "."){
            continue;
        }
        if(checkArr.includes(singleData)){
            return false;
        }
        checkArr.push(singleData);
    }
    return true;
}

function validateColumn (board){
    var columnValidated = true;
    for(var i = 0; i<board.length; i++){
        columnValidated = columnValidated && checkValidity(board.map(x=>x[i]));
    }
    return columnValidated;
}

function validateBox(board){
    var boxValidated = true;
    
    // loop through 0 - 8
    // first 3 in first arr, second 3 in second arr, third 3 in third arr
    // after 4 add all arrays in new arr and restart until 6
    arr1 = [];
    arr2 = [];
    arr3 = [];
    arr = [];
    for(var i = 0; i< 9; i++){
        for(var j = 0; j<9; j++){
            if(j < 3){
                arr1.push(board[i][j])
            }            
            else if(j<6){
                arr2.push(board[i][j]);
            }
            else if(j<9){
                arr3.push(board[i][j]);
            }
        }
        if((i+1)%3 == 0){
            arr.push(arr1);
            arr.push(arr2);
            arr.push(arr3);
            arr1 = [];
            arr2 = [];
            arr3 = [];
        }
    }

    for(var a of arr){
        boxValidated = boxValidated && checkValidity(a);
    }
    return boxValidated;
}

isValidSudoku([
    ["5","3",".",".","7",".",".",".","."]
    ,["6",".",".","1","9","5",".",".","."]
    ,[".","9","8",".",".",".",".","6","."]
    ,["8",".",".",".","6",".",".",".","3"]
    ,["4",".",".","8",".","3",".",".","1"]
    ,["7",".",".",".","2",".",".",".","6"]
    ,[".","6",".",".",".",".","2","8","."]
    ,[".",".",".","4","1","9",".",".","5"]
    ,[".",".",".",".","8",".",".","7","9"]
]
);