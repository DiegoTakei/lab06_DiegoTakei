package usuarios;

import br.edu.ufcg.Jogabilidade;
import jogos.Jogo;

public class Veterano implements TipodeUsuarioIF{


	@Override
	public int recompensar(Jogo jogo, int scoreObtido, boolean zerou){
		
		int x2p = jogo.registraJogada(scoreObtido, zerou);
		
		if(jogo.getEstilo().contains(Jogabilidade.Online))
			x2p += 10;
		if(jogo.getEstilo().contains(Jogabilidade.Cooperativo))
			x2p += 20;		
		
		return x2p;
	}
	
	@Override
	public int punir(Jogo jogo, int scoreObtido, boolean zerou){

		int x2p = jogo.registraJogada(scoreObtido, zerou);

		if(jogo.getEstilo().contains(Jogabilidade.Competitivo))
			x2p -= 20;
		if(jogo.getEstilo().contains(Jogabilidade.Offline))
			x2p -= 20;
		
		return x2p;
	}
	
	@Override
	public boolean upgrade(int x2p) {
		return false;
	}
	
	@Override
	public String toString(){
		return "Veterano";
	}

	@Override
	public int getDesconto() {
		
		return 20;
	}

	@Override
	public int getDeltaX2P() {
		
		return 15;
	}

}