package br.com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.bookstore.dao.ConnectionFactory;
import br.com.bookstore.dao.LivroDao;
import br.com.bookstore.model.Livro;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String inicio() {
		//Conectar ao banco de dados
		ConnectionFactory.conectar();
		//Redirecionar para rota /home
		return "redirect:home";
	}

	@RequestMapping("/home")
	// String -> retorno de uma página
	public String index(Model model) {
		LivroDao dao = new LivroDao();
		
		model.addAttribute("livros", dao.listar());
		
		return "home";
	}
	
	@RequestMapping("/form")
	public String form(Long idLivro, Model model) {
		LivroDao dao = new LivroDao();
		
		Livro l = new Livro();
		
		if(idLivro != null) {
			l = dao.buscar(idLivro);
		}
		
		model.addAttribute("livro", l);
		
		return "form";
	}
	
	@RequestMapping("/livro")
	public String livro(Long idLivro, Model model) {
		LivroDao dao = new LivroDao();
		
		model.addAttribute("livro", dao.buscar(idLivro));
		
		return "livro";
	}
	
	@RequestMapping(value = "adicionarLivro", method = RequestMethod.POST)
	public String adicionarLivro(Livro livro) {
		LivroDao dao = new LivroDao();
		dao.inserir(livro);
		return "redirect:home";
	}
	
	@RequestMapping(value = "atualizarLivro", method = RequestMethod.POST)
	public String atualizarLivro(Long idLivro, Livro livro) {
		LivroDao dao = new LivroDao();
		
		dao.atualizar(livro, idLivro);
		
		return "redirect:home";
	}
	
	@RequestMapping("deletarLivro")
	public String deletarLivro(Long idLivro) {
		
		LivroDao dao = new LivroDao();
		
		dao.excluir(idLivro);
		
		return "home";
	}
}
