package simulatorepolitico;


public class State {

    private int cittadini;
    private double casseDelloStato;

    GeneratoreID id = new GeneratoreID();
    int popolo;

    public int getCittadini() {
        return cittadini;
    }

    public double getCasseDelloStato() {
        return casseDelloStato;
    }

    public GeneratoreID getID() {
        return id;
    }

    public int getPopolo() {
        return popolo;
    }

    public void setPopolo(int popolo) {
        this.popolo = popolo;
    }



    public void setCasseDelloStato(double casseDelloStato) {
        this.casseDelloStato = casseDelloStato;
    }

    public void setID(GeneratoreID id) {
        this.id = id;
    }

    
    

}
