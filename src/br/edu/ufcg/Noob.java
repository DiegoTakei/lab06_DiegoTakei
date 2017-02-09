package br.edu.ufcg;

import java.util.HashSet;

public class Noob extends Usuario {

	public Noob(String nome, String login, double dinheiro) throws Exception{
		
		if(nome != "")
			this.nome = nome;
		else{
			throw new Exception("Nome inválido.");
		}
		
		if(login != "")
			this.login = login;
		else{
			throw new Exception("Login inválido.");
		}
		if(dinheiro >= 0)
			this.dinheiro = dinheiro;
		else{
			throw new Exception("Dinheiro inválido.");
		}
		
		this.jogos = new HashSet<>();
		this.x2p = 0;
		
	}

	@Override
	public boolean comprarJogo(Jogo jogo) {
		
		if(this.dinheiro > jogo.getPreco()/10){
			this.x2p += (10 * jogo.getPreco());
			this.dinheiro -= jogo.getPreco()/10;
			this.jogos.add(jogo);
			
			return true;
			
		}else{
			return false;
		}
	}
	
	

}
