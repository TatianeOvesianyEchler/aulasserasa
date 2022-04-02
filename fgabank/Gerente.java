package fgabank;

import java.time.LocalDate;


public class Gerente extends Funcionario implements AcessoInterno {
	
	//mockado
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";
	
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataDeAdmmissao) {
		super(nome,cpf,ctps,salario, dataDeAdmmissao );
	
	}

	@Override
	public double getBonus() {
		return this.getSalario()*0.1;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if(this.usuario.equals(usuario)&&this.senha.equals(senha)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
