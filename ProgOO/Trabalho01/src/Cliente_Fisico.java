
public class Cliente_Fisico extends Cliente {
	private String CPF;
	private String sexo;
	private String dtNascimento;
	
	public Cliente_Fisico(String nome, int matricula, String contato, String endereco, String situacao, String CPF, String sexo, String dtNascimento)
	{
		super(nome, matricula, contato, endereco, situacao);
		
		this.CPF = CPF;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
	}

	public String getCPF()
	{
		return CPF;
	}

	public void setCPF(String CPF)
	{
		this.CPF = CPF;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
	public String getDtNascimento()
	{
		return dtNascimento;
	}
	
	public void setDtNascimento(String dtNascimento)
	{
		this.dtNascimento = dtNascimento;
	}
	
}
