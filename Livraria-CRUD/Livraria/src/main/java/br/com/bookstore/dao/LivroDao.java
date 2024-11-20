package br.com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.bookstore.model.Livro;

public class LivroDao {
	private Connection conexao;
	
	public LivroDao() {
		conexao = ConnectionFactory.conectar();
		
	}
	
	public void inserir(Livro livro) {
		String sql = "INSERT INTO livros (nome, preco, sinopse, autor, editora, nPaginas, anodeLancamento)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement smtp;
		try {
			
			smtp = conexao.prepareStatement(sql);
			
			smtp.setString(1, livro.getNome());
			smtp.setDouble(2, livro.getPreco());
			smtp.setString(3, livro.getSinopse());
			smtp.setString(4, livro.getAutor());
			smtp.setString(5, livro.getEditora());
			smtp.setInt(6, livro.getnPaginas());
			smtp.setInt(7,  livro.getAnodeLancamento());
			
			smtp.execute();
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			System.out.println("Deu erro: " + e.getMessage());
		}
	}

	public List<Livro> listar(){
		String sql = "SELECT * FROM livros";
		
		PreparedStatement smtp;
		List<Livro> livros = new ArrayList<Livro>();
		try {
			smtp = conexao.prepareStatement(sql);
			
			ResultSet resultado = smtp.executeQuery();
			
			while (resultado.next()) {
				Livro li = new Livro();
				
				li.setId(resultado.getLong("id"));
				li.setNome(resultado.getString("nome"));
				li.setPreco(resultado.getDouble("preco"));
				li.setSinopse(resultado.getString("sinopse"));
				li.setAutor(resultado.getString("autor"));
				li.setEditora(resultado.getString("editora"));
				li.setnPaginas(resultado.getInt("nPaginas"));
				li.setAnodeLancamento(resultado.getInt("anodeLancamento"));
				livros.add(li);
				
			}
			resultado.close();
			smtp.close();
			conexao.close();
			return livros;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
	}
	
	public Livro buscar(Long id) {
		String sql = "SELECT * FROM livros WHERE id = ?";
		
		PreparedStatement smtp;
		
		try {
			smtp = conexao.prepareStatement(sql);
			smtp.setLong(1, id);
			ResultSet resultado = smtp.executeQuery();
			Livro l = null;
			
			while(resultado.next()) {
				l = new Livro();
				l.setId(resultado.getLong("id"));
				l.setNome(resultado.getString("nome"));
				l.setPreco(resultado.getDouble("preco"));
				l.setSinopse(resultado.getString("sinopse"));
				l.setAutor(resultado.getString("autor"));
				l.setEditora(resultado.getString("editora"));
				l.setnPaginas(resultado.getInt("nPaginas"));
				l.setAnodeLancamento(resultado.getInt("anodeLancamento"));
				
			}
			
			smtp.close();
			resultado.close();
			conexao.close();
			return l;
			
		} catch(Exception e) {
			throw new RuntimeException();
		}
				
	}
	
	public void excluir(Long id) {
		String sql = "DELETE FROM livros WHERE id = ?";
		
		PreparedStatement smtp;
		
		try {
			
			smtp = conexao.prepareStatement(sql);
			smtp.setLong(1, id);
			
			smtp.execute();
			smtp.close();
			conexao.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	public void atualizar(Livro livro, Long id) {
		String sql = "UPDATE livros SET nome = ?, preco = ?, sinopse = ?, autor = ?, editora = ?, nPaginas = ?, anodeLancamento = ? WHERE id = ?";
		
		PreparedStatement smtp;
		
		try {
			smtp = conexao.prepareStatement(sql);
			smtp.setString(1, livro.getNome());
			smtp.setDouble(2, livro.getPreco());
			smtp.setString(3, livro.getSinopse());
			smtp.setString(4, livro.getAutor());
			smtp.setString(5, livro.getEditora());
			smtp.setInt(6, livro.getnPaginas());
			smtp.setInt(7, livro.getAnodeLancamento());
			smtp.setLong(8, id);
			
			smtp.execute();
			smtp.close();
			conexao.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
	}
	
}
