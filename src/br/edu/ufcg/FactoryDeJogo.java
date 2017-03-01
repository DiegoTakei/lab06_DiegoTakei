package br.edu.ufcg;

import exceptions.JogoException;
import jogos.Jogo;
import jogos.Luta;
import jogos.Plataforma;
import jogos.Rpg;

public class FactoryDeJogo {

	public FactoryDeJogo() {
		// TODO Auto-generated constructor stub
	}
	
	public Jogo criaJogo(String nome, double preco, String tipo) throws JogoException{
		
		if(tipo.equals("Luta"))
			return criaJogoLuta(nome,preco);
		else if(tipo.equals("Plataforma"))
				return criaJogoPlataforma(nome, preco);
		else if(tipo.equals("RPG"))
				return criaJogoRPG(nome,preco);
		else
			return null;
		
	}
	
	private Jogo criaJogoLuta(String nome, double preco) throws JogoException{
		
		return new Luta(nome, preco);
		
	}
	
	private Jogo criaJogoPlataforma(String nome, double preco) throws JogoException{
		
		return new Plataforma(nome, preco);
		
	}
	
	private Jogo criaJogoRPG(String nome, double preco) throws JogoException{
		
		return new Rpg(nome,preco);
	}

}
