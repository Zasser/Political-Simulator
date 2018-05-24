package simulatorepolitico;

public class Persona {

	private String nome, residenza, cognome;
	private int id, eta, nfigli;
	private double reddito;
	private boolean candidato;

	public Persona(String nome, String cognome, int id, int eta, double reddito, int nfigli, String residenza) {
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.eta = eta;
		this.reddito = reddito;
		this.nfigli = nfigli;
		this.residenza = residenza;
	}

	public String getNome() {
		return nome;
	}

	public String getResidenza() {
		return residenza;
	}

	public String getCognome() {
		return cognome;
	}

	public int getId() {
		return id;
	}

	public int getEta() {
		return eta;
	}

	public double getReddito() {
		return reddito;
	}

	public int getNfigli() {
		return nfigli;
	}

	public boolean isCandidato() {
		return candidato;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public void setReddito(int reddito) {
		this.reddito = reddito;
	}

	public void setNfigli(int nfigli) {
		this.nfigli = nfigli;
	}

	public void setCandidato(boolean candidato) {
		this.candidato = candidato;
	}

}
