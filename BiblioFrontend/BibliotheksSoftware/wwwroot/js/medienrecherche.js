// JavaScript source code
$(_ => {
    console.log('hallo');
    $('#txtFilter').on('keypress', _ => {
        if (_.which == 13) {
            console.log('loading books..');
            $('tbody').empty();
            const bookname = $('#txtFilter').val();
            console.log(`name= ${bookname}`);
            const baseUrl = 'http://localhost:8080/medien';
            $.getJSON(baseUrl)
                .then(data => {
                    console.table(data);

                    for (const item of data) {
                        //$('<li>').html(item.body).appendTo($('#lstComments'));
                        if (item.sachtitel.includes($('#txtFilter').val())) {
                            $(`<tr id=${item.medienNummer}>`).appendTo('tbody');
                            $('<td>').html(item.sachtitel).appendTo(`#${item.medienNummer}`);
                            $('<td>').html(item.verfasser).appendTo(`#${item.medienNummer}`);
                            $('<td>').html(item.systematik).appendTo(`#${item.medienNummer}`);
                            $('<td>').html(item.medienNummer).appendTo(`#${item.medienNummer}`);
                            $('<td>').html(item.jahr).appendTo(`#${item.medienNummer}`);
                        }

                    }
                });
            console.log('request sent');
        }
    });

    $('#btnSearch').on('click', _ => {
        console.log('loading books..');
        $('tbody').empty();
        const bookname = $('#txtFilter').val();
        console.log(`name= ${bookname}`);
        const baseUrl = 'http://localhost:8080/medien';
        $.getJSON(baseUrl)
            .then(data => {
                console.table(data);
                const ul = $('#lstMedien');
                for (const item of data) {
                    //$('<li>').html(item.body).appendTo($('#lstComments'));
                    if (item.sachtitel.includes($('#txtFilter').val())) {
                        $(`<tr id=${item.medienNummer}>`).appendTo('tbody');
                        $('<td>').html(item.sachtitel).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.verfasser).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.systematik).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.medienNummer).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.jahr).appendTo(`#${item.medienNummer}`);
                    }

                }
            });
        console.log('request sent');
    });

    $('#selectType').on('change', _ => {
        const selType = $('#selectType option :selected').val();
        $('tbody').empty();

        const baseUrl = 'http://localhost:8080/medien';
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
                switch (selType) {
                    case 0: //sachtitel
                        data.sort((a, b) => a.sachtitel > b.sachtitel ? 1 : -1);
                        break;
                    case 1: //Verfasser
                        data.sort((a, b) => a.verfasser > b.verfasser ? 1 : -1);
                        break;
                    case 2: //system
                        data.sort((a, b) => a.systematik > b.systematik ? 1 : -1);
                        break;
                    case 3: //medNR
                        data.sort((a, b) => a.medienNummer > b.medienNummer ? 1 : -1);
                        break;
                    case 4: //jahr
                        data.sort((a, b) => a.jahr > b.jahr ? 1 : -1);
                        break;
                }
                //data.sort((a, b) => a.medienNummer > b.medienNummer ? 1 : -1);

                for (const item of data) {
                    //$('<li>').html(item.body).appendTo($('#lstComments'));
                    if (item.sachtitel.includes($('#txtFilter').val())) {
                        $(`<tr id=${item.medienNummer}>`).appendTo('tbody');
                        $('<td>').html(item.sachtitel).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.verfasser).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.systematik).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.medienNummer).appendTo(`#${item.medienNummer}`);
                        $('<td>').html(item.jahr).appendTo(`#${item.medienNummer}`);
                    }

                }
            });
    });

});