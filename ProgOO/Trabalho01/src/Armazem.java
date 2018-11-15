
public class Armazem {
	
	private int codArmazem;
	private String nomeArmazem;
	private String endArmazem;
	private String DescArmazem;
	
	public Armazem(int codArmazem, String nomeArmazem, String endArmazem, String descArmazem)
	{
	
		this.codArmazem = codArmazem;
		this.nomeArmazem = nomeArmazem;
		this.endArmazem = endArmazem;
		this.DescArmazem = descArmazem;
	
	}

	public int getCodArmazem() {
		return codArmazem;
	}

	public void setCodArmazem(int codArmazem) {
		this.codArmazem = codArmazem;
	}

	public String getNomeArmazem() {
		return nomeArmazem;
	}

	public void setNomeArmazem(String nomeArmazem) {
		this.nomeArmazem = nomeArmazem;
	}

	public String getEndArmazem() {
		return endArmazem;
	}

	public void setEndArmazem(String endArmazem) {
		this.endArmazem = endArmazem;
	}

	public String getDescArmazem() {
		return DescArmazem;
	}

	public void setDescArmazem(String descArmazem) {
		DescArmazem = descArmazem;
	}
	
	public void CadastrarArmazem()
	{
		
	}
	
}
