let studentRecord = '{"name":"Mayur Barge", "age":26, "school":"San José State University"}';

console.log(typeof studentRecord);

let studentObj = JSON.parse(studentRecord);

console.log(studentObj);

console.log(typeof studentObj);