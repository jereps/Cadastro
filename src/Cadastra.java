import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Cadastra {

	public static String cadastraUsuario(Usuario usuario) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("usuario.txt"));
        String linha = usuario.toString();
        buffWrite.append(linha + "\n");
        buffWrite.close();
        return "Gravado com Sucesso";
	}

	public static String lerDocumento() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("usuario.txt"));
        String linha = "";
        
        linha = buffRead.readLine();
        
        buffRead.close();
		
		return linha;
	}

}
