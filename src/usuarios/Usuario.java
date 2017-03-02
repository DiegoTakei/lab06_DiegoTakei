package usuarios;

import java.text.NumberFormat;
import java.util.HashSet;

import exceptions.UpgradeInvalidoException;
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
	 * Adiciona dinheiro ao usuário caso o valor passado por parâmetro seja válido.
	 * @param valor
	 * @throws UsuarioException 
	 */
	public void adicionarDinheiro(double valor) throws UsuarioException{
		
		if (valor > 0){
			dinheiro += valor;
		}
		else{
			throw new UsuarioException("Valor inválido.");
		}

	}
	
	/*public void registraJogada(Jogo jogo, int score, boolean zerou){
=======
	/**
	 * Registra uma jogada feita pelo usuï¿½rio em um determinado jogo.
	 * @param jogo
	 * @param score
	 * @param zerou
	 */
	public void registraJogada(Jogo jogo, int score, boolean zerou){
		
		this.x2p += jogo.registraJogada(score, zerou);

	}
		
	 /**
	 * Verifica se o usuário possui determinado jogo.
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
	
	@Override
	public String toString() {
		
		String ln = System.lineSeparator();
		StringBuilder result = new StringBuilder();
		double gasto = 0;
		
		result.append(login + ln + nome + " - Jogador " + statusDoUsuario.toString()
				+ ln + "Lista de Jogos:");
		
		for (Jogo jogo : jogos) {
			result.append(" + " + jogo + ln);
			gasto += jogo.getPreco();
		}
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		result.append("Total de preco dos jogos: " + nf.format(gasto) + ln);
		result.append("--------------------------------------------");
		return result.toString();
	}

	public void upgrade() throws UpgradeInvalidoException{
		
		if(!statusDoUsuario.upgrade(x2p)){
			throw new UpgradeInvalidoException();
		} else{
		//	statusDoUsuario = new Veterano();
		}
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