const numbers = [25,30,32,45,85,50,60];
console.log(returnThirdLargest(numbers));

function returnThirdLargest(numbers) {
    let outputArray = [];
    for (let i = 0; i < numbers.length; i++) {
        for (let j = 0; j < numbers.length - 1; j++) {
            if (numbers[j] > numbers[j + 1]) {
                let tempMax = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = tempMax;
            }
        }
        outputArray[i] = numbers[i];
    }
    return outputArray[outputArray.length-3];
}