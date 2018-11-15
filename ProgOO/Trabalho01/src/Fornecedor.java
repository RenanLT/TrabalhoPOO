
public class Fornecedor {
	
	private String CNPJForn;
	private String razaoSocialForn;
	private String nomeFornecedor;
	private String contatoForn;
	private String enderecoForn;
	private String descFornecedor;
	
	public Fornecedor(String CNPJForn, String razaoSocialForn, String nomeFornecedor, String contatoForn,
			String enderecoForn, String descFornecedor) 
	{
	
		this.CNPJForn = CNPJForn;
		this.razaoSocialForn = razaoSocialForn;
		this.nomeFornecedor = nomeFornecedor;
		this.contatoForn = contatoForn;
		this.enderecoForn = enderecoForn;
		this.descFornecedor = descFornecedor;
	}

	public String getCNPJForn() {
		return CNPJForn;
	}

	public void setCNPJForn(String cNPJForn) {
		CNPJForn = cNPJForn;
	}

	public String getRazaoSocialForn() {
		return razaoSocialForn;
	}

	public void setRazaoSocialForn(String razaoSocialForn) {
		this.razaoSocialForn = razaoSocialForn;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getContatoForn() {
		return contatoForn;
	}

	public void setContatoForn(String contatoForn) {
		this.contatoForn = contatoForn;
	}

	public String getEnderecoForn() {
		return enderecoForn;
	}

	public void setEnderecoForn(String enderecoForn) {
		this.enderecoForn = enderecoForn;
	}

	public String getDescFornecedor() {
		return descFornecedor;
	}

	public void setDescFornecedor(String descFornecedor) {
		this.descFornecedor = descFornecedor;
	}
	
	
}
