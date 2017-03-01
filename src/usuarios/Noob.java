package usuarios;

import java.util.HashSet;

import exceptions.UsuarioException;
import jogos.Jogo;

public class Noob extends Usuario implements TipodeUsuarioIF{

	public Noob(String nome, String login, double dinheiro) throws UsuarioException{
		
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
		this.dinheiro = 0;
		this.x2p = 0;
		
	}
	
	@Override
	public void recompensar(String nomeJogo,int scoreObtido,boolean zerou){
		
		Jogo jogo = super.getJogo(nomeJogo);
		
		if (jogo != null)
			if(jogo.getEstilo().contains("Offline"))
				this.x2p += 30;
			if(jogo.getEstilo().contains("Multiplayer"))
				this.x2p += 10;
		
	}
	
	@Override
	public void punir(String nomeJogo, int scoreObtido, boolean zerou){
		
		Jogo jogo = super.getJogo(nomeJogo);
		
		if (jogo != null)
			if(jogo.getEstilo().contains("Online"))
				this.x2p -= 10;
			if(jogo.getEstilo().contains("Competitivo"))
				this.x2p -= 20;
			if(jogo.getEstilo().contains("Cooperativo"))
				this.x2p -= 50;
		
	}
	
	/**
	 * Compra um jogo com seu desconto
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