function saveButton() {

    var formulario = document.forms("pessoaform").value

    var pessoa = {
        nome,
        dataNasc,
        email,
        tell
    }

    pessoa.nome = formulario.elements("name").value
    pessoa.dataNasc = formulario.elements("datanasc").value
    pessoa.email = formulario.elements("email").value
    pessoa.tell = formulario.elements("phone").value

    console.log(pessoa)
}