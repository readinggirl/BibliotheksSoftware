const bootstrap = require('bootstrap');
$(_ => {
    console.log('JQuery ready');

    const baseUrl = "https://localhost:5000";

    $('.btn btn-new').on('click', _ => {

        
        $.ajax({
            url: `${baseUrl}/benutzer/id`,
            method: 'POST',
            contentType: 'application/json',
            data://zsmfügen
        })
        //.then(x=>)
        //.fail()
    });


});


