package usuarios;

import java.util.HashSet;

import exceptions.UsuarioException;
import jogos.Jogo;

public class Usuario {
	
	private TipodeUsuarioIF statusDoUsuario;
	protected String nome;
	protected String login;
	protected HashSet<Jogo> jogos;
	protected double dinheiro;
	protected int x2p;	
	
	/**
	 * Adiciona dinheiro ao usu�rio caso o valor passado por par�metro seja v�lido.
	 * @param valor
	 * @throws UsuarioException 
	 */
	public void adicionarDinheiro(double valor) throws UsuarioException{
		
		if (valor > 0){
			dinheiro += valor;
		}
		else{
			throw new UsuarioException("Valor inv�lido.");
		}

	}
	
	/*public void registraJogada(Jogo jogo, int score, boolean zerou){
=======
	/**
	 * Registra uma jogada feita pelo usu�rio em um determinado jogo.
	 * @param jogo
	 * @param score
	 * @param zerou
	 */
	public void registraJogada(Jogo jogo, int score, boolean zerou){
		
		this.x2p += jogo.registraJogada(score, zerou);

	}
		
	 /**
	 * Verifica se o usu�rio possui determinado jogo.
	 * @param nomeJogo
	 * @return
	 */
	public boolean contemJogo(String nomeJogo){
		
		for (Jogo jogo : jogos) {
			if (nomeJogo.equals(jogo.getNome())) return true;
		}
		return false;
	}
	
	public Jogo getJogo(String nomeJogo){
		
		for (Jogo jogo : jogos) {
			if(nomeJogo.equals(jogo.getNome()))
				return jogo;
		}
		return null;
	}
	


	public String getNome() {
		return nome;
	}


	public String getLogin() {
		return login;
	}


	public HashSet<Jogo> getJogos() {
		return jogos;
	}


	public double getDinheiro() {
		return dinheiro;
	}


	public int getX2p() {
		return x2p;
	}


	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
	
	
	
	
	

}