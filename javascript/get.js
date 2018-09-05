class Weather{
    constructor(city, temperature){
        this.city = "San Jose";
        this.temperature = 80;
    }
    get toDegree(){
        return (this.temperature - 32)*0.5556;
    }
}

let tempHere = new Weather;

console.log("Currently its " + tempHere.toDegree + "degree here at San Jose");