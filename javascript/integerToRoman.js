var intToRoman = function(num) {

    var map = new Map();
    map.set(0, ["I", "V"]);
    map.set(1, ["X", "L"]);
    map.set(2, ["C", "D"]);
    map.set(3, ["M", "R"]);

    var a = 0;
    var value = "";
    while(num>0){
        console.log(num);
        var firstNum = num % 10;
        if(firstNum <=5 ){
            if(firstNum<=3){
                for (let i = 0; i < firstNum; i++) {
                    value =  map.get(a)[0] + value;
                }
            }else{
                if(firstNum == 4){
                    value = map.get(a)[0] + map.get(a)[1] + value;
                }else{
                    value = map.get(a)[1] + value;
                }
            }
        }else{
            firstNum = firstNum - 5;
            switch(firstNum){
                case 1:
                    value = map.get(a)[1] + map.get(a)[0] + value;
                    break;
                case 2:
                    value = map.get(a)[1] + map.get(a)[0] + map.get(a)[0] + value;
                    break;
                case 3:
                    value = map.get(a)[1] + map.get(a)[0]+ map.get(a)[0]+ map.get(a)[0] + value;
                    break;
                case 4:
                    value = map.get(a)[0]+ map.get(a+1)[0] + value;
                    break;
            }
        }
        num = Math.floor(num/10);
        a++;
    }

    console.log(value);
    return value;


};

intToRoman(349);