package br.edu.ufcg;

import java.util.HashSet;

import exceptions.JogoException;
import exceptions.LojaException;
import exceptions.UsuarioException;
import jogos.Jogo;
import usuarios.Usuario;

public class LojaController {

	HashSet<Usuario> usuarios = new HashSet<Usuario>();
	
	public LojaController() {
		
	}
	
	/**
	 * Adiciona dinheiro � conta do usu�rio cujo login foi passado por par�metro.
	 * @param login
	 * @param dinheiro
	 * @throws LojaException
	 */
	public void adicionarDinheiro(String login, double dinheiro) throws LojaException{
		
		Usuario usuario = pesquisarUsuario(login);
		
		if(usuario != null){
			if(dinheiro>=0)
				usuario.setDinheiro(dinheiro);
			else{
				throw new LojaException("Dinheiro Inv�lido.");
			}
		}else{
			throw new LojaException("Usuario n�o existe.");
		}
		
	}
	
	/**
	 *  Vende e adiciona um jogo � conta do usu�rio, caso o mesmo possua dinheiro suficiente para compr�-lo.
	 * @param login
	 * @param jogo
	 * @return
	 */
	public boolean venderJogos(String login, Jogo jogo){
		return false;
		
	}
	
	/**
	 * Imprime todos os usu�rios e seus respectivos jogos e estat�sticas.
	 */
	public void imprimirAll(){
		
		double totalPrecoJogos = 0;
		
		System.out.println("=== Central P2-CG ===");
		
		for (Usuario usuario : usuarios) {
			
			System.out.println(usuario.getLogin());
			System.out.println(usuario.getNome());
			System.out.println("Lista de jogos:");

			for (Jogo jogo : usuario.getJogos()) {
				
				totalPrecoJogos += jogo.getPreco();
				System.out.println(jogo.getNome());
				System.out.println("==> Jogou "+ jogo.getVezes_jogadas() + "vez(es)." );
				System.out.println("==> Zerou "+ jogo.getVezes_zeradas() + "vez(es).");
				System.out.println("Maior score: "+jogo.getScore());
				
			}
			System.out.println("Total de pre�o dos jogos: R$ "+ totalPrecoJogos);
		}
		
	}
	
	public void criaUsuario(String nome, String login, String tipo) throws UsuarioException{
		
		FactoryDeUsuario factory = new FactoryDeUsuario();
		
		factory.criaUsuario(nome, login, tipo);
		
	}
	
	public void criaJogo(String nome, double preco, String tipo) throws JogoException {
		
		FactoryDeJogo factory = new FactoryDeJogo();
		
		factory.criaJogo(nome, preco, tipo);
		
	}
	
	/**
	 * Adiciona um usu�rio � loja.
	 * @param usuario
	 */
	public void adicionarUsuario(Usuario usuario){
		
		usuarios.add(usuario);
		
	}
	
	/**
	 * Pesquisa um usu�rio existente na loja.
	 * @param login
	 * @return
	 */
	public Usuario pesquisarUsuario(String login){
		
		for (Usuario usuario : usuarios) {
			
			if(login.equals(usuario.getLogin()))
				return usuario;
		}
		return null;
		
	}

}
