
public class Pagamento extends Pedido {
	
	private String descPagamento;

	public Pagamento(String nome, int matricula, String contato, String endereco, String situacao, int pedidoCodigo, String data, double valor, String pedSituacao, String descPagamento) 
	{
		super(nome, matricula, contato, endereco, situacao, pedidoCodigo, data, valor, pedSituacao);
		
		this.descPagamento = descPagamento;
	}

	public String getDescPagamento() 
	{
		return descPagamento;
	}

	public void setDescPagamento(String descPagamento) 
	{
		this.descPagamento = descPagamento;
	}
	
	public void EmitirBoleto()
	{
		
	}
		
	public void EmitirRecibo()
	{
		
	}
}
