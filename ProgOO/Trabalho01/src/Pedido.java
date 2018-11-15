
public class Pedido extends Cliente{
	
	private int pedidoCodigo;
	private String data;
	private double valor;
	private String pedSituacao;
	
  public Pedido(String nome, int matricula, String contato, String endereco, String situacao, int pedidoCodigo, String data, double valor, String pedSituacao)
	{
		super(nome,matricula,contato,endereco,situacao);
		
	    this.pedidoCodigo = pedidoCodigo;
	    this.data = data;
	    this.valor = valor;
	    this.pedSituacao = pedSituacao;
	}

  public int getpedidoCodigo() 
  {
	return pedidoCodigo;
  }

  public void setpedidoCodigo(int pedidoCodigo) 
  {
	this.pedidoCodigo = pedidoCodigo;
  }

  public String getData() 
  {
	return data;
  }

  public void setData(String data) 
  {
	this.data = data;
  }

  public double getValor() 
  {
	return valor;
  }

  public void setValor(double valor) 
  {
	this.valor = valor;
  }

  public String getPedSituacao() 
  {
	return pedSituacao;
  }

  public void setPedSituacao(String pedSituacao) 
  {
	this.pedSituacao = pedSituacao;
  }
	
  public void EnviarPedido()
  {
	  
  }
  
  public void CadastrarPedido()
  {
	  
  }

  public void ValidarPedido()
  {
	  
  }
}
