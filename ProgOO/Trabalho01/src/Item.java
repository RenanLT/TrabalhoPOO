
public class Item extends Produto {
	
	private static int contador = 0;
	private int sequencial;
	public int getSequencial() {
		return sequencial;
	}

	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public int getQtdItem() {
		return qtdItem;
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}

	private int qtdItem;
	
	public Item(int codArmazem, String nomeArmazem, String endArmazem, String descArmazem, int codProduto,
			String nomeProduto, double valorProduto, String descProduto, String sitProduto, int qtdProduto,
			int sequencial, int qtdItem) {
		super(codArmazem, nomeArmazem, endArmazem, descArmazem, codProduto, nomeProduto, valorProduto, descProduto,
				sitProduto, qtdProduto);
		
		this.sequencial = ++contador;
		this.qtdItem = qtdItem;
	}
	
	public void CadastrarItem()
	{
		
	}
	
}
