package usuarios;

import jogos.Jogo;

public interface TipodeUsuarioIF {

	public abstract int recompensar(Jogo jogo, int scoreObtido, boolean zerou);				
	public abstract int punir(Jogo jogo, int scoreObtido, boolean zerou);
	public abstract boolean upgrade(int x2p);
	public int getDesconto();
	public int getDeltaX2P();

}
