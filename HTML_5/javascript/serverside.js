var url = 'https://techgatha.com/servertime.php'
window.onload=function(){
    var source = new EventSource(url);
    source.onmessage=function(event){
        document.getElementById('result').innerHTML+="New time received from web server: "+event.data+"<br>";
    };
};