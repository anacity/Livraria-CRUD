<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/form.css">
    <title>Form - Livro</title>
</head>
<body>
    <header>
        <a href="home"><h2>Voltar</h2></a>
        <h1>Cadastro de produtos</h1>
        <img src="images/Bookstore-removebg-preview.png" alt="">
    </header>
    <div class="container">
            <img src="images/undraw_learning_re_32qv.svg" alt="">
        <form method="POST" action="${livro.id != null ? 'atualizarLivro' : 'adicionarLivro' }?idLivro=${livro.id}">
            <div>
                <label>Foto do livro</label>
                <input type="file">
            </div>
            <div>
                <input name="nome" type="text" placeholder="Nome do livro">
            </div>
            <div>
                <input name="autor" type="text" placeholder="Autor(a)">
            </div>
            <div>
                <label>Ano de lançamento:</label>
                <input name="anodeLancamento" type="number">
            </div>
            <div>
                <input name="editora" type="text" placeholder="Editora">
            </div>
            <div>
                <label>Páginas:</label>
                <input name="nPaginas" type="number">
            </div>
            <div>
                <textarea name="sinopse" id="sinopse" placeholder="Sinopse do livro"></textarea>
            </div>
            <div>
                <label>Preço:</label>
                <input name="preco" type="number">
            </div>
    
            <button type="submit">Salvar alterações</button>
        </form>
    </div>

</body>
</html>