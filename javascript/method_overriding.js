function LibraryMember(){
    this.name = "";
    this.id = 0;
    this.hours = 9;
}
LibraryMember.prototype.showHours = function () {
    console.log("My library hours are : " +this.hours);
}

function Student() {
    LibraryMember.call(this);
    this.category = "Student";
}
Student.prototype = Object.create(LibraryMember.prototype);
Student.prototype.showHours = function () {
    console.log("My library hours are : " + this.hours + ", since I'm " + this.category)
}

const foo = new LibraryMember;
foo.id = 67890;
foo.name = "Foo Bar";
foo.showHours();

const mayur = new Student;
mayur.id = 12345;
mayur.name = "Mayur Barge";
mayur.hours = 12
mayur.showHours();
