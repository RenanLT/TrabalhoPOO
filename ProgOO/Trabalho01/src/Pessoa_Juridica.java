
public class Pessoa_Juridica extends Cliente {

	private String CNPJ;
	private String razaoSocial;
	
	public Pessoa_Juridica(String nome, int matricula, String contato, String endereco, String situacao, String CNPJ, String razaoSocial) 
	{
		super(nome, matricula, contato, endereco, situacao);
		
		this.CNPJ = CNPJ;
		this.razaoSocial = razaoSocial;
	}
	
	public String getCNPJ()
	{
		return CNPJ;
	}
	
	public void setCNPJ(String CNPJ)
	{
		this.CNPJ = CNPJ;
	}

	public String getRazaoSocial()
	{
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
	}
	
}
