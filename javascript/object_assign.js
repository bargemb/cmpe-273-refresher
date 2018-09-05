class Address{
    constructor(streetName, city, postalCode,country){
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
};

let sjsuAdd = new Address("1 Washington Sq", "San Jose", "95192", "USA");

newUniAdd = Object.assign({}, sjsuAdd);

console.log(newUniAdd);

console.log(typeof newUniAdd);