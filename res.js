var body=require('./promiseTest.js');
var promise = require('promise');
var express=require('express')
 , app = express();

 var mustacheExpress=require('mustache-express');

 // assign the mustache engine to .html files
app.engine('html', mustacheExpress());

// set .html as the default extension 
app.set('view engine', 'html');

app.set('views', __dirname + '/views');

 app.get('/index/:value',function(req,res){
    body.jsonData().then(function(val){
       // console.log(val);
            let values1=req.params.value;
        //res.writeHead(200,{'Content-type': 'application/json'});
        
        var arr= val.stationBeanList.length;
       // console.log(arr);
        var vv=val.stationBeanList;
        var arry=[];
        for(var i=0;i<arr;i++){
            console.log("Value here "+values1);
            var vvi=vv[i];
            console.log(vvi[values1]);
            arry.push(vvi[values1]);
   
        }
        res.render('index',{"arry":arry,"val":values1});
   
       // console.log(arry);
})
    }).listen(3000);