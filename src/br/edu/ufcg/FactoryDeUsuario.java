package br.edu.ufcg;

import exceptions.UsuarioException;
import usuarios.Noob;
import usuarios.TipoUsuarioEnum;
import usuarios.Usuario;
import usuarios.Veterano;

public class FactoryDeUsuario {

	public FactoryDeUsuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario criaUsuario(String nome, String login, TipoUsuarioEnum tipo) throws UsuarioException{
		Usuario usuario = null; 
		switch (tipo) {
			case NOOB:
				usuario = new Usuario(nome, login, new Noob());
				break;
			case VETERANO:
				usuario = new Usuario(nome, login, new Veterano());
				break;
	
			}
		
		return usuario;
	}

}
