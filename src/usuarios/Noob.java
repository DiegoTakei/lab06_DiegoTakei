package usuarios;

import java.util.HashSet;

import exceptions.UsuarioException;
import jogos.Jogo;

public class Noob extends Usuario {

	public Noob(String nome, String login, double dinheiro) throws UsuarioException{
		
		if(nome != "")
			this.nome = nome;
		else{
			throw new UsuarioException("Nome inválido.");
		}
		
		if(login != "")
			this.login = login;
		else{
			throw new UsuarioException("Login inválido.");
		}
		if(dinheiro >= 0)
			this.dinheiro = dinheiro;
		else{
			throw new UsuarioException("Dinheiro inválido.");
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
