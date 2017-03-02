package usuarios;

import br.edu.ufcg.Jogabilidade;
import jogos.Jogo;

public class Noob implements TipodeUsuarioIF{

	@Override
	public int recompensar(Jogo jogo,int scoreObtido,boolean zerou){
		
		int x2p = jogo.registraJogada(scoreObtido, zerou);
		if (jogo != null)
			if(jogo.getEstilo().contains(Jogabilidade.Online))
				x2p += 30;
			if(jogo.getEstilo().contains(Jogabilidade.Multiplayer))
				x2p += 10;
			
		return x2p;
		
	}
	
	@Override
	public int punir(Jogo jogo, int scoreObtido, boolean zerou){
		
		int x2p = jogo.registraJogada(scoreObtido, zerou);
		if (jogo != null)
			if(jogo.getEstilo().contains(Jogabilidade.Online))
				x2p -= 10;
			if(jogo.getEstilo().contains(Jogabilidade.Competitivo))
				x2p -= 20;
			if(jogo.getEstilo().contains(Jogabilidade.Cooperativo))
				x2p -= 50;
			
		return x2p;
		
	}
		
	@Override
	public boolean upgrade(int x2p) {
		return x2p >= 1000;
	}
	
	@Override
	public String toString(){
		return "Noob";
	}

	@Override
	public int getDesconto() {
		
		return 10;
	}

	@Override
	public int getDeltaX2P() {
	
		return 10;
	}

	
	

}