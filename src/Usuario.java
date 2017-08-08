
public class Usuario {
	
	String nome;
	String telefone;
	String RG;
	String sexo;

	public Usuario(String nome, String telefone, String RG, String sexo) {
		this.nome = nome;
		this.telefone = telefone;
		this.RG = RG;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return  nome + telefone + RG + sexo;
	}
	
}
