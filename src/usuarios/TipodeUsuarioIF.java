package usuarios;

import jogos.Jogo;

public interface TipodeUsuarioIF {
	
	public abstract boolean comprarJogo(Jogo jogo);
	public abstract void recompensar(String nomeJogo, int scoreObtido, boolean zerou);				
	public abstract void punir(String nomeJogo, int scoreObtido, boolean zerou);

}
