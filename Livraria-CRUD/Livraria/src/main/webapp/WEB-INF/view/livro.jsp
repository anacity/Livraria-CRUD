<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>Document</title>
</head>
<body>
    <header>
        <a href="home"><h2>Voltar</h2></a>
        <input type="search" placeholder="Pesquisar...">
        <img src="images/Bookstore-removebg-preview.png" width="100px" alt="">
    </header>
    <div class="container">
        <img src="images/6232318-atualizada.jpg" alt="">
        <div class="txt">
            <h1>${livro.nome}</h1>
            <h3>Autor: ${livro.autor}</h3>
            <h3>Ano de lançamento: ${livro.anodeLancamento}</h3>
            <h3>Editora: ${livro.editora}</h3>
            <h3>${livro.nPaginas} páginas</h3>
            <h4>Sinopse: </h4>
            <p>${livro.sinopse}</p>
            <h1>R$ ${livro.preco}</h1>
            
            <a href="form?idLivro=${livro.id}">
            <button type="button">Editar livro</button>
            </a>
            
            <a href="deletarLivro?idLivro=${livro.id}">
            	<button type="button">Deletar livro</button>
            </a>
            
        </div>
    </div>
    <h3 class="creditos">Designed by <a href="www.freepik.com"><samp>Freepik</samp></a></h3>
</body>
</html>