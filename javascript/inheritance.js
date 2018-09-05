function LibraryMember(){
    this.name = "";
    this.id = 0;
}
function Student() {
    LibraryMember.call(this);
    this.extendedHours = 4;
}
Student.prototype = Object.create(LibraryMember.prototype);
Student.prototype.constructor = Student;


const mayur = new Student;
mayur.id = 12345;
mayur.name = "Mayur Barge";
console.log(mayur);


const shishir = new Student;
shishir.id = 67890;
shishir.name = "Shishir Kulkarni";
shishir.extendedHours = 6;
console.log(shishir);