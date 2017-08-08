import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class testCadastro {

	@Test
	public void testCastrodeUsuario() throws IOException {
		Usuario usuario = new Usuario("Maria da Silva ","(12) 3305-0980 ","236851879 ","Casada");
	
		String retorno = Cadastra.cadastraUsuario(usuario);
		
		assertEquals("Gravado com Sucesso", retorno);
	}
	
	@Test
	public void testLeituradeTXT() throws IOException {
		
		String usuarioRetorno = Cadastra.lerDocumento();
		
		assertEquals("Maria da Silva (12) 3305-0980 236851879 Casada", usuarioRetorno);		
	}

}
