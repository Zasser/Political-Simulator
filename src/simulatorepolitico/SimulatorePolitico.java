package simulatorepolitico;

public class SimulatorePolitico {

    public static void main(String[] args) {
        GeneratoreID gen = new GeneratoreID();
        State state = new State();
        gen.createPersona();
        System.out.println(gen.aventiDiritto());
        System.out.println(gen.censimento());
        state.setPopolo(gen.popolo());
        System.out.println("Popolazione = "+ state.getPopolo());
    }
}
