const bootstrap = require('bootstrap');
$(_ => {
    console.log('JQuery ready');

    const baseUrl="https://localhost:5000";
    const url=`${baseUrl}/benutzer/id`;

    $.post(url);
     
});


