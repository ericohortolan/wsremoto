function logar() {
    var userjson = {
        "email": document.getElementById("txtemail").value,
        "senha": document.getElementById("txtsenha").value
    };
    var pacote = {
        method: "POST",
        body: JSON.stringify(userjson),
        headers: {
            "Content-type": "application/json"
        }
    };
    fetch("http://localhost:8080/login", pacote)
        .then(res => res.json())
        .then(res => {
            window.alert(res.nome);
            localStorage.setItem("userlogado", JSON.stringify(res));
            window.location = "usuario.html";
        })
        .catch(err => {
            window.alert("Login invalido");
        });
}

function exibirusuario() {
    var usuariostr = localStorage.getItem("userlogado");
    if (usuariostr == null) {
        window.location = "index.html";
    } else {
        var usuariojson = JSON.parse(usuariostr);
        document.getElementById("dados").innerHTML =
            "<h6>" + usuariojson.nome + "<br>" +
            "Email: " + usuariojson.email + " (" + usuariojson.id + ")</h6>";
        document.getElementById("foto").innerHTML =
            //"<img src=\"img/" + usuariojson.foto + "\" class=\"d-block w-100\" >"
            "<div class=\"card\" style=\"width: 100%;\"> <img src = \"img/" + usuariojson.foto + "\" class=\"card-img-top\" > </div>";
    }
}

function cadastrar() {
    var nome = document.getElementById("txtnome").value;
    var email = document.getElementById("txtemail").value;
    var foto = document.getElementById("txtfoto").value;
    var senha = document.getElementById("txtsenha").value;

    if (nome == "") {
        window.alert("Campo Nome obrigatório");
        return false;
    }
    if (email == "") {
        window.alert("Campo Email obrigatório");
        return false;
    }
    if (senha == "") {
        window.alert("Campo Senha obrigatório");
        return false;
    }

    var userjson = {
        "id": null,
        "nome": nome,
        "foto": foto,
        "email": email,
        "senha": senha
    };

    var pacote = {
        method: "POST",
        body: JSON.stringify(userjson),
        headers: {
            "Content-type": "application/json"
        }
    };
    fetch("http://localhost:8080/cadastrar", pacote)
        .then(res => res.json())
        .then(res => {
            //localStorage.setItem("userlogado", JSON.stringify(res));
            window.alert("Cadastro Realizado com sucesso, realize o login novamente");
            localStorage.clear();
            window.location = "index.html";
        })
        .catch(err => {
            window.alert("Erro no cadastro");
        });
}