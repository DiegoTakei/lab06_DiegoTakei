package br.edu.ufcg;

import java.util.HashSet;

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
		
		return false;
	}
	
	public void registraJogada(Jogo jogo, int score, boolean zerou){
		
		this.x2p += jogo.registraJogada(score, zerou);

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
	
	
	
	
	
	

}
