package fgabank;

public interface AcessoInterno {

	//os metodos n?o tem comportamento (corpo), s? tem assinatura
	
	/**
	 * 
	 * @param String usuario == pode-se informar um usuario valido
	 * @param String senha == pode-se informar uma senha com at? 225 caracteres alfanumerico
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	
	public boolean autenticarSistema (String usuario, String senha);
	public boolean mudarSenha (String senhaAntiga, String senhaNova);
	public boolean mudarUsuario (String usuarioAntigo, String usuarioNovo);

	
	
}
