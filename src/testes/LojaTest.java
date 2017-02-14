package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.Loja;
import exceptions.LojaException;
import exceptions.UsuarioException;
import usuarios.Noob;
import usuarios.Usuario;

public class LojaTest {
	
	private Loja loja = new Loja();

	@Before
	public void test() throws UsuarioException{
		
		Usuario usuario = new Noob("Noob", "noob",0);		
		loja.adicionarUsuario(usuario);
		
	}
	
	
	@Test
	public void testLoja() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdicionarDinheiro() throws LojaException {
		
		loja.adicionarDinheiro("noob", 100.0);
		Usuario usuario = loja.pesquisarUsuario("noob");
		
		assertEquals(100, usuario.getDinheiro(), 0.001);
	
	}
	
	@Test (expected = LojaException.class)
	public void testAdicionarDinheiroInvalido() throws LojaException {
		
		loja.adicionarDinheiro("noob", -100.0);
	}

	@Test
	public void testVenderJogos() {
		fail("Not yet implemented");
	}

	@Test
	public void testImprimirAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testPesquisarUsuario() {
		
		assertNotNull(loja.pesquisarUsuario("noob"));
		
	}

}
