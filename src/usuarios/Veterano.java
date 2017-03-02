package usuarios;

import java.util.HashSet;

import br.edu.ufcg.Jogabilidade;
import exceptions.UsuarioException;
import jogos.Jogo;

public class Veterano extends Usuario implements TipodeUsuarioIF{

	public Veterano(String nome, String login, double dinheiro) throws UsuarioException{
		
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
		this.x2p = 1000;
		
	}
	
	@Override
	public void recompensar(String nomeJogo, int scoreObtido, boolean zerou){
		
		Jogo jogo = super.getJogo(nomeJogo);
		
		if(jogo.getEstilo().contains(Jogabilidade.Online))
			this.x2p += 10;
		if(jogo.getEstilo().contains(Jogabilidade.Cooperativo))
			this.x2p += 20;		
	}
	
	@Override
	public void punir(String nomeJogo, int scoreObtido, boolean zerou){

		Jogo jogo = super.getJogo(nomeJogo);

		if(jogo.getEstilo().contains(Jogabilidade.Competitivo))
			this.x2p -= 20;
		if(jogo.getEstilo().contains(Jogabilidade.Offline))
			this.x2p -= 20;
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
	
	@Override
	public boolean upgrade(int x2p) {
		return false;
	}

}