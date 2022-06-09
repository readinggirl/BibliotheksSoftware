$(_ => {
    console.log('JQuery ready');

    const baseUrl = "http://localhost:8080/medien";

    $('.btn-new').on('click', _ => {
        console.log('click button new')
        let max = 0;
        $.getJSON(baseUrl)
            .then(data => {
                for (const item of data) {
                    if (item.medienNummer > max) {
                        max = item.medienNummer;
                    }
                }
                console.log(max);
                $('#inputMediennummer').val(max + 1);
            });
        console.log('medien NR set')
    });

    $('.btn-speichern').on('click', _ => {
        const medium = {
            medienNummer: $('#inputMediennummer').val(),
            medienArt: $('#inputMedienart options :selected').html(),
            systematik: $('#inputSystematik').val(),
            isbn: $('#inputISBN').val(),
            titel: $('#inputSachtitel').val(),
            verfasser: $('#inputVerfasser1').val(),
            jahr: $('#inputErscheinungsjahr').val(),
        }

        $.ajax({
            url: 'baseUrl',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(medium),
        })
            .then(_ => console.log('post medium done'));
    })
});