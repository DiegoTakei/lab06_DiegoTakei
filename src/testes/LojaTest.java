package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.FactoryDeUsuario;
import br.edu.ufcg.LojaController;
import exceptions.LojaException;
import exceptions.UsuarioException;
import usuarios.TipoUsuarioEnum;
import usuarios.Usuario;

public class LojaTest {
	
	private LojaController loja = new LojaController();

	@Before
	public void test() throws UsuarioException{
		
		FactoryDeUsuario user = new FactoryDeUsuario();
		
		Usuario usuario = user.criaUsuario("noob", "noob1", TipoUsuarioEnum.NOOB);
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
