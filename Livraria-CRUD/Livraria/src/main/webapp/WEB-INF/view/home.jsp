<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/home.css">
    <title>Home - Livraria</title>
</head>

<body>

    <nav>
        <img src="images/Bookstore-removebg-preview.png" width="100px" alt="">
        <input type="search" placeholder="Pesquisar...">
        <a href="#catalogo">Nossos produtos</a>
        <a href="form">Adicionar produto</a>
    </nav>

    <div class="imagem-header">
        <img src="images/Bookstore-banner.png" alt="">
    </div>

    <div class="container" id="catalogo">
        
        <c:forEach items="${livros}" var="livro">
         <div class="card-livro">
            <a href="livro?idLivro=${livro.id}">
                <img src="images/6232318-ultima.jpg" alt="">
                <h2>${livro.nome}</h2>
                <p>${livro.autor}</p>
                <h1>R$ ${livro.preco}</h1>
            </a>
        </div>
    
        </c:forEach>
    </div>

    <footer class="footer">
        <p>&copy; 2023 - Todos os direitos reservados</p>
        <p>Entre em contato pelo e-mail: contato@exemplo.com</p>
    </footer>

    
</body>

</html>