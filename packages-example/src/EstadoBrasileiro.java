// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 21),
	PIAUI ("PI", "Piauí", 89),
	MARANHAO ("MA","Maranhão", 98),
	CEARA ("CE", "Ceará", 88);
	
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
