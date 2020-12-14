function exibirartistas() {
    fetch("http://localhost:8080/artistas")
        .then(res => res.json())
        .then(res => preenchercombo(res));
}

function preenchercombo(lista) {
    var saida = "";
    for (contador = 0; contador < lista.length; contador++) {
        saida +=
            "<option value='" + lista[contador].id + "'>" + lista[contador].nomeartistico + "</option>";
    }
    document.getElementById("cmbartistas").innerHTML = saida;
}

function filtrar() {
    fetch("http://localhost:8080/artista/" + document.getElementById("cmbartistas").value)
        .then(res => res.json())
        .then(res => preenchertabela(res.musicas));
}

function preenchertabela(lista) {
    var saida = "";
    for (contador = 0; contador < lista.length; contador++) {
        saida +=
            "<tr><th scope='row'>" + (contador + 1) + "</th><td>" + lista[contador].titulo + "</td><td>" + lista[contador].lancamento + "</td>";
    }
    saida += "</tr>";
    document.getElementById("dados").innerHTML = saida;
}