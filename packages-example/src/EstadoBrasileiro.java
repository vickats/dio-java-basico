// Criando o enum EstadoBrasileiro para ser usado em toda a aplica��o.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","S�o Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 21),
	PIAUI ("PI", "Piau�", 89),
	MARANHAO ("MA","Maranh�o", 98),
	CEARA ("CE", "Cear�", 88);
	
	private String nome;
	private String sigla;
	private int ddd;
	private EstadoBrasileiro(String sigla, String nome, int ddd) {
		this.sigla = sigla;
		this.nome = nome;
		this.ddd = ddd;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getDDD() {
		return ddd;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
