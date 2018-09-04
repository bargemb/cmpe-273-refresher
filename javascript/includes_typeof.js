// Check whether array elements has 15 number in it
let array = [11, 12, 13, 14, 15, 16];

let result = array.includes(15);
if (result){
    console.log("Given array has 15 element");
}
else {
    console.log("Array doesn't have 15 number");
}

console.log("Type of value/object returned by includes method is : " + typeof result);
