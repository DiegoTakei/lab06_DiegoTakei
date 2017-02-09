package br.edu.ufcg;

import java.util.HashSet;

public class Loja {

	HashSet<Usuario> usuarios = new HashSet<Usuario>();
	
	public Loja() {
		
	}
	
	public void adicionarDinheiro(String login, double dinheiro){
		
		Usuario usuario = pesquisarUsuario(login);
		
		if(usuario != null){
			usuario.setDinheiro(dinheiro + usuario.getDinheiro());
		}
		
	}
	
	public void venderJogos(String login, Jogo jogo){
		
	}
	
	public void imprimirAll(){
		
	}
	
	public Usuario pesquisarUsuario(String login){
		
		for (Usuario usuario : usuarios) {
			
			if(login.equals(usuario.getLogin()))
				return usuario;
		}
		return null;
		
	}

}
