package jogos;

public class Rpg extends Jogo {

	public Rpg(String nome, double preco) throws Exception {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int registraJogada(int score, boolean zerou_o_jogo) {
		
		this.score += score;
		
		if(zerou_o_jogo == true)
			this.vezes_zeradas++;
		
		this.vezes_jogadas++;
		
		return this.getVezes_jogadas()*10;
	}

}
