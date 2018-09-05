var query = "https://api.github.com/users/bargemb";

const fetch = require('node-fetch');

fetch(query).then(
    function (response) {
        if (response.status === 200) {
            console.log("Fetch successful. Status code : " + response.status);
        }
        else {
            console.log("Error in fetch. Status code : " + response.status);
        }
    }
)   ;