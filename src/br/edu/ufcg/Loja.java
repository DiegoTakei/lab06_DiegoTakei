package br.edu.ufcg;

import java.util.HashSet;

import exceptions.LojaException;
import jogos.Jogo;
import usuarios.Usuario;

public class Loja {

	HashSet<Usuario> usuarios = new HashSet<Usuario>();
	
	public Loja() {
		
	}
	
	public void adicionarDinheiro(String login, double dinheiro) throws LojaException{
		
		Usuario usuario = pesquisarUsuario(login);
		
		if(usuario != null){
			if(dinheiro>=0)
				usuario.setDinheiro(dinheiro);
			else{
				throw new LojaException("Dinheiro Inválido.");
			}
		}else{
			throw new LojaException("Usuario não existe.");
		}
		
	}
	
	public boolean venderJogos(String login, Jogo jogo){
		return false;
		
	}
	
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
			System.out.println("Total de preço dos jogos: R$ "+ totalPrecoJogos);
		}
		
	}
	
	public void adicionarUsuario(Usuario usuario){
		
		usuarios.add(usuario);
		
	}
	
	public Usuario pesquisarUsuario(String login){
		
		for (Usuario usuario : usuarios) {
			
			if(login.equals(usuario.getLogin()))
				return usuario;
		}
		return null;
		
	}

}
