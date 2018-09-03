function printTable(number = 2) {
    if (number >= 2 ){
        let output = "";
        for (let i = 1; i <= 10; i++) {
            output += number * i + " ";
        }
        console.log(output);
    }
    else {
        console.log("Multiplication table not allowed for numbers < 2");
    }
}

printTable(13);
printTable();   //defaults to 2
