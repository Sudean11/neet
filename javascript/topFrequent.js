var topKFrequent = (nums, k) => {
    var array = [];
    for(const num of nums){
        numExists = array.some(x=>x.name == num);
        if(!numExists){
            array.push({name: num, count: 1});
        }else{
            valueToUpdate = array.find(x=>x.name == num);
            valueToUpdate.count = valueToUpdate.count +1;
        }
    }

    array.sort((x, y)=>y.count - x.count);
    console.log(array);
    cd = array.splice(0,k);
    ab = cd.map(x=>x.name);

    console.log(ab);
    return ab;
};
topKFrequent([1,1,1,2,2,3], 2);