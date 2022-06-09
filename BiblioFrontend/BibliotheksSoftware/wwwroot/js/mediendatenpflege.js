$(_ => {
    console.log('JQuery ready');

    const baseUrl = "https://localhost:5000";

    $('.btn btn-new').on('click', _ => {

        const medium = {
            medienNummer: 1,
            medienArt: 'asd',
            systematik: 'jd',
            isbn: '135789754321',
            titel: 'myTitel',
            verfasser: 'a cooler Verfasser',
            jahr: 2001
        }

        $.ajax({
            url: `${baseUrl}/medium`,
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(medium);
        });
    });
});