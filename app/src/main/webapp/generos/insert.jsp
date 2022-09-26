<%@ page contentType="html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=>, initial-scale=1.0">
    <title>Novo Genero</title>
</head>
<body>
    <h1> Novo Genero</h1>
    <form action="/generos/insert" method="post">
        <label for="nome">Nome</label>
        <input type="text" name="nome" placeholder="Nome do Gênero" />
        <a href="/generos/list">Voltar</a>
        <button type="submit">Salvar</button>
    </form>
</body>
</html>