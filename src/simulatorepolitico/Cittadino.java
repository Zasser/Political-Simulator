package simulatorepolitico;

import java.util.ArrayList;

public class Cittadino {

	ArrayList<Persona> persone = new ArrayList<Persona>();

	public Cittadino() {
	}

	public ArrayList<Persona> getPersone() {
		return persone;
	}

	public void setPersone(ArrayList<Persona> persone) {
		this.persone = persone;
	}

	public String censimento() {
		double redditoMedio = 0;
		double etaMedia = 0;
		double natalitaMedia = 0;

		String censimento = null;
		for (int i = 0; i < persone.size(); i++) {
			redditoMedio = persone.get(i).getReddito() + redditoMedio;
			etaMedia = persone.get(i).getEta() + etaMedia;
			natalitaMedia = persone.get(i).getNfigli() + natalitaMedia;
		}
		double reddito = redditoMedio / persone.size();
		double eta = etaMedia / persone.size();
		double natalita = natalitaMedia / persone.size();

		censimento = "Reddito Medio" + reddito + "\n" + "Etá Media" + eta + "\n" + "Natalitá Media" + natalita;
		return censimento;
	}

	public String aventiDiritto() {
		int ris = 0;
		for (int i = 0; i < persone.size(); i++) {
			if (persone.get(i).getEta() >= 18) {
				ris++;
			}
		}

		return "Gli aventi diritto di voto sono:" + ris;
	}

	public boolean addPersona(Persona ppl) {
		boolean ris = false;
		for (int i = 0; i < persone.size(); i++) {
			if (persone.get(i).getId() == ppl.getId()) {
				ris = false;
			} else {
				persone.add(ppl);
				ris = true;
			}
		}
		return ris;
	}

	public boolean ctrlID(int id) {
		boolean ris = true;
		for (int i = 0; i < persone.size(); i++) {
			if (persone.get(i).getId() == id) {
				ris = true;
				break;
			} else {
				ris = false;
			}
		}
		return ris;
	}

}
