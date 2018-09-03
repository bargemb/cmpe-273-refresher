var variable = 5;

function myFunction() {
    var variable = 10; // re-declaring would lead to Function scope in this case
    console.log(variable)
}
console.log(myFunction()); //default return value
console.log(variable); // This is from Global scope