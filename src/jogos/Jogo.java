package jogos;

import java.util.HashSet;

import br.edu.ufcg.Jogabilidade;
import exceptions.JogoException;

public abstract class Jogo {
	
	protected String nome;
	protected double preco;
	protected int score;
	protected int vezes_jogadas;
	protected int vezes_zeradas;
	protected HashSet<Jogabilidade> estilo;
	

	public Jogo(String nome, double preco) throws JogoException {
		
		if (nome != "")
			this.nome = nome;
		else{
			throw new JogoException("Nome inválido.");
		}
		
		if (preco > 0)
			this.preco = preco;
		else{
			throw new JogoException("Preço inválido.");
		}
		
		this.score = 0;
		this.vezes_jogadas = 0;
		this.vezes_zeradas = 0;
		this.estilo = new HashSet<Jogabilidade>();
		
		
	}
	
	public abstract int registraJogada(int score, boolean zerou_o_jogo);

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getScore() {
		return score;
	}

	public int getVezes_jogadas() {
		return vezes_jogadas;
	}

	public int getVezes_zeradas() {
		return vezes_zeradas;
	}

	public HashSet<Jogabilidade> getEstilo() {
		return estilo;
	}
	
	
	
	

}
