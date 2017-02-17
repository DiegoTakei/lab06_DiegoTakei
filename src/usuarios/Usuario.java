package usuarios;

import java.util.HashSet;

import jogos.Jogo;

public abstract class Usuario {
	
	protected String nome;
	protected String login;
	protected HashSet<Jogo> jogos;
	protected double dinheiro;
	protected int x2p;
	
	public abstract boolean comprarJogo(Jogo jogo);

	
	public boolean adicionarDinheiro(double valor){
		
		if (valor > 0){
			dinheiro += valor;
		}
		else{
			throw new UsuarioException("Valor inv�lido.")
		}
		
		return false;
	}
	
	public void registraJogada(Jogo jogo, int score, boolean zerou){
		
		this.x2p += jogo.registraJogada(score, zerou);

	}
	
	public boolean contemJogo(String nomeJogo){
		
		for (Jogo jogo : jogos) {
			if (nomeJogo.equals(jogo)) return true;
		}
		return false;
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
