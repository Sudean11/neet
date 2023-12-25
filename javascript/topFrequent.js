var topKFrequent = function(nums, k) {
    setMap = new Map();
    nums.forEach(element => {
        if(setMap.has(element)){
            setMap.set(element, setMap.get(element)+1);
        }else{
            setMap.set(element, 1);
        }
    });
    let a  = Array.from(setMap.entries()).sort((x,y)=> x[1]-y[1]);
};

topKFrequent([1,1,1,2,2,3], 2);