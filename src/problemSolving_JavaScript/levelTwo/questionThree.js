let arr = [1,2,3,4]
let newArr = []
let length = arr.length - 1


for (let i = 0; i <= length; i++) {
    let temp = 1
    for(let j = 0; j <= length; j++){
        if(i === j){
            continue
        }
        temp *= arr[j]
    }
    newArr.push(temp)
}

console.log(newArr)