// JavaScript source code
$(_ => {
    console.log('hallo');
    $('#txtFilter').on('keypress', _ => {
        if (_.which == 13) {
            console.log('loading books..');
            const bookname = $('#txtFilter').val();
            console.log(`name= ${bookname}`);
            const baseUrl = 'http://localhost:8080/medien';
            $.getJSON(baseUrl)
                .then(data => {
                    const ul = $('#lstMedien');
                    for (const item of data) {
                        //$('<li>').html(item.body).appendTo($('#lstComments'));
                        $('#lstMedien').append($('<li>').html(item.body));
                    }
                });
            console.log('request sent');
        }
    });

    $('#btnSearch').on('click', _ => {
        console.log('loading books..');
        const bookname = $('#txtFilter').val();
        console.log(`name= ${bookname}`);
        const baseUrl = 'http://localhost:8080/medien';
        $.getJSON(baseUrl)
            .then(data => {
                console.table(data);
                const ul = $('#lstMedien');
                for (const item of data) {
                    //$('<li>').html(item.body).appendTo($('#lstComments'));
                    $('#lstMedien').append($('<li>').html(item.medienNummer));
                }
            });
        console.log('request sent');
    });

    $('#selectType').on('change', _ => {
        const selected = $('#selectType option:selected').val();

        const baseUrl = 'http://localhost:8080/Medien';
        $.getJSON(baseUrl)
            .then(data => {
                console.log('HALO');
                console.table(data);
                // const list = data;
                //const list = [
                //{ Mediennummer: 1, Sachtitel: 'Hello' },
                //{ Mediennummer: 2, Sachtitel: 'Zebra' }
                //]
                //console.log(list);

                //list = list.sort((a, b) => a.selected > b.selected ? 1 : -1);
                data.sort((a, b) => a.selected > b.selected ? 1 : -1);

                for (const item of data) {
                    //$('<li>').html(item.body).appendTo($('#lstComments'));
                    $('#lstMedien').append($('<li>').html(item.body));
                }
            });
    });

    //$('#selectType').on('click', _ => {
    //    const list = [
    //        { Mediennummer: 2, Sachtitel: 'Zello' },
    //        { Mediennummer: 5, Sachtitel: 'Hebra' }
    //    ]
    //    console.log(list);

    //    list = list.sort((a, b) => a.Mediennummer > b.Mediennummer ? 1 : -1);

    //    console.log(list);
    //});




});