package fgabank;

public class PessoaJuridica extends PessoaHeranca {

	private String cnpj;
	private String seguimento;
	private String responsavel;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String cnpj, String seguimento, String responsavel) {
		super();
		this.cnpj = cnpj;
		this.seguimento = seguimento;
		this.responsavel = responsavel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSeguimento() {
		return seguimento;
	}

	public void setSeguimento(String seguimento) {
		this.seguimento = seguimento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

}
