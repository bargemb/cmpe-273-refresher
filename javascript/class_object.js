class Address{
    constructor(streetName, city, postalCode,country){
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
};

let sjsuAdd = new Address("1 Washington Sq", "San Jose", "95192", "USA");

console.log("San José State University is in " + sjsuAdd.country);