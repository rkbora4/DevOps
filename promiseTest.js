var request = require("request");
var promise = require('promise');



var jsonData=function parse(){
    return new Promise(function(resolve, reject){
        var url = 'https://feeds.citibikenyc.com/stations/stations.json'


request({
    url: url,
    json: true
}, function (error, response, body) {
            // in addition to parsing the value, deal with possible errors
            if (error) return reject(error);
            try {
                // JSON.parse() can throw an exception if not valid JSON
                resolve(body);
            } catch(e) {
                reject(e);
            }
        });
    });

}
exports.jsonData=jsonData;
/* parse().then(function(val) {
    console.log(val);
}).catch(function(err) {
    console.err(err);
});  */