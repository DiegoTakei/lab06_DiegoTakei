package br.edu.ufcg;

public class Plataforma extends Jogo {

	public Plataforma(String nome, double preco) throws Exception {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int registraJogada(int score, boolean zerou_o_jogo) {
		
		this.score += score;
		
		if(zerou_o_jogo == true)
			this.vezes_zeradas++;
		
		return this.vezes_zeradas*20;
	}

}
