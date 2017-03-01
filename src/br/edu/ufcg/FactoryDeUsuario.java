package br.edu.ufcg;

import exceptions.UsuarioException;
import usuarios.Noob;
import usuarios.Usuario;

public class FactoryDeUsuario {

	public FactoryDeUsuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario criaUsuario(String nome, String login, String tipo) throws UsuarioException{
		
		if(tipo.equals("Noob")){
			return new Noob(nome,login,0);
		}
		
		return null;
		
		
		
	}

}
