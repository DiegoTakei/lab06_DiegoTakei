package usuarios;

import java.util.HashSet;

import exceptions.UsuarioException;
import jogos.Jogo;

public class Veterano extends Usuario {

public Veterano(String nome, String login, double dinheiro) throws UsuarioException{
		
		if(nome != "")
			this.nome = nome;
		else{
			throw new UsuarioException("Nome inv�lido.");
		}
		
		if(login != "")
			this.login = login;
		else{
			throw new UsuarioException("Login inv�lido.");
		}
		if(dinheiro >= 0)
			this.dinheiro = dinheiro;
		else{
			throw new UsuarioException("Dinheiro inv�lido.");
		}
		
		this.jogos = new HashSet<>();
		this.x2p = 1000;
		
}
	
	/**
	 * Compra um jogo com seu desconto.
	 * @param jogo
	 * @return
	 */
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
