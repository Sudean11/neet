var copyWithin = ( fruits, toIndex, fromIndex) =>{
    
    var newArr = [];

    //[ 'Banana', 'Orange', 'Banana', 'Orange', 'Apple',  'Mango' ] 

    fruits.map((singleFruit, index)=>{
        if(index<toIndex){
            newArr.push(singleFruit);
            return;
        }
        let newIndex = index - toIndex;
        newArr.push(fruits[newIndex])
    })
    fruits = newArr;
    return fruits;

}


var copyWithin = ( fruits, toIndex, fromIndex, count) =>{
    
    var newArr = [];
    var total = 0; 
    fruits.map((singleFruit, index)=>{
        if(index<toIndex){
            newArr.push(singleFruit);
            return;
        }
        if(total == count){
            newArr.push(singleFruit);
            return;
        }
        total++;
        let newIndex = index - toIndex;
        newArr.push(fruits[newIndex])
    })
    fruits = newArr;
    return fruits;

}

const fruits = ["Banana", "Orange", "Apple", "Mango", "Kiwi",'pear']; 
console.log(copyWithin(fruits,1,2,4));  