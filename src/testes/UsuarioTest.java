package testes;

import org.junit.Before;
import org.junit.Test;

import exceptions.UsuarioException;
import usuarios.Noob;
import usuarios.Veterano;

public class UsuarioTest {
	
	@Before
	public void test() throws Exception{
		
		new Noob("Noob","Noob123",0);
		new Veterano("Veterano", "Veterano123", 0);
		
	}
	
	@Test (expected = UsuarioException.class)
	public void inserirNoobNomeInvalido() throws UsuarioException{
		
		new Noob("","Noob123",0);
		
	}
	
	@Test (expected = UsuarioException.class)
	public void inserirNoobLoginInvalido() throws UsuarioException{
		
		new Noob("Noob","",0);
		
	}
	
	@Test (expected = UsuarioException.class)
	public void inserirNoobDinheiroInvalido() throws UsuarioException{
		
		new Noob("Noob","Noob123",-5);
		
	}
	
	@Test (expected = UsuarioException.class)
	public void inserirVeteranoNomeInv() throws UsuarioException{
		
		new Veterano("","Veterano123",0);
		
	}
	
	@Test (expected = UsuarioException.class)
	public void inserirVeteranoLoginInv() throws UsuarioException{
		
		new Veterano("Veterano","",0);
		
	}
	
	@Test (expected = UsuarioException.class)
	public void inserirVeteranoDinheiroInv() throws UsuarioException{
		
		new Veterano("Veterano","Veterano123",-1);
		
	}

}
