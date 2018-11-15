
public class Produto extends Armazem {
	
	private int codProduto;
	private String nomeProduto;
	private double valorProduto;
	private String descProduto;
	private String sitProduto;
	private int qtdProduto;
	
	public Produto(int codArmazem, String nomeArmazem, String endArmazem, String descArmazem, int codProduto, String nomeProduto, 
			double valorProduto, String descProduto, String sitProduto, int qtdProduto)
	{
		super(codArmazem, nomeArmazem, endArmazem, descArmazem);
		
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.descProduto = descProduto;
		this.sitProduto = sitProduto;
		this.qtdProduto = qtdProduto;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public String getSitProduto() {
		return sitProduto;
	}

	public void setSitProduto(String sitProduto) {
		this.sitProduto = sitProduto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	
	public void VerificarDisp()
	{
		
	}
}
