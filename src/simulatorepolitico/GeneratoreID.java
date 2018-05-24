package simulatorepolitico;

import java.util.ArrayList;
import java.util.Random;

public class GeneratoreID {

    ArrayList<Persona> persone = new ArrayList<Persona>();

    //Determinazione elementi generali nomi,cognomi e Residenze
    private String nomi[] = new String[]{"Agostino", "Alberto", "Alessandro", "Alessio", "Alfio", "Alfonso", "Amedeo",
        "Angelo", "Antonio", "Aurelio", "Baldassarre", "Baldo", "Bastiano", "Bartolo", "Bartolomeo", "Benito",
        "Bernardo", "Biagio", "Boris", "Bruno", "Calogero", "Carlo", "Carmelo", "Casimiro", "Cesare", "Cirillo",
        "Ciro", "Claudio", "Corrado", "Cosimo", "Daniele", "Danilo", "Dante", "Dario", "Davide", "Diego", "Dino",
        "Dionisio", "Domenico", "Duccio", "Egidio", "Elio", "Eliseo", "Emanuele", "Emiliano", "Emilio", "Ennio",
        "Enrico", "Enzo", "Ezio", "Fabiano", "Fabio", "Fabrizio", "Fausto", "Fedele", "Felice", "Filippo", "Flavio",
        "Fortunato", "Francesco", "Gabriele", "Gaetano", "Gaspare", "Gennaro", "Gerlando", "Giacomo", "Giancarlo",
        "Giovanni", "Giulio", "Giuseppe", "Iacopo", "Ignazio", "Igor", "Isacco", "Isaia", "Iside", "Isidoro",
        "Italo", "Ivano", "Ivo", "Leandro", "Leo", "Lino", "Livio", "Lorenzo", "Loris", "Luca", "Luciano", "Lucio",
        "Luigi.", "Angela", "Ada", "Adelaide", "Anna", "Antonella", "Anita", "Alice", "Amelia", "Anna", "Agnese",
        "Alessandra", "Alessia", "Aurora", "Angelica", "Barbara", "Betty", "Beatrice", "Calogera", "Claudia",
        "Carlotta", "Carmen", "Carola", "Caterina", "Cinzia", "Clara", "Clarissa", "Clelia", "Concetta", "Corinna",
        "Cristina", "Daniela", "Dina", "Domenica", "Debora", "Denise", "Danila", "Dorotea", "Emanuela", "Emilia",
        "Evelyn", "Erica", "Elena", "Elisa", "Eva", "Fiorella", "Francesca", "Federica", "Fabiola", "Flavia",
        "Floriana", "Giovannna", "Gabriella", "Gerlanda", "Giulia", "Giuseppina", "Giorgia", "Gaia", "Gemma",
        "Greta", "Ida", "Iole", "Iolanda", "Irene", "Isabella", "Iside", "katia", "Ketty"};

    private String cognomi[] = new String[]{"Agostini", "Aiello", "Albanese", "Amato", "Antonelli", "Arena", "Baldi",
        "Barbieri", "Barone", "Basile", "Battaglia", "Bellini", "Benedetti", "Bernardi", "Bianchi", "Bianco",
        "Brambilla", "Bruni", "Bruno", "Calabrese", "Caputo", "Carbone", "Caruso", "Castelli", "Catalano",
        "Cattaneo", "Cavallo", "Ceccarelli", "Cirillo", "Colombo", "Conte", "Conti", "Coppola", "Costa",
        "Costantini", "De Angelis", "De Luca", "De Rosa", "De Santis", "De Simone", "Di Stefano", "Donati",
        "Esposito", "Fabbri", "Farina", "Ferrante", "Ferrara", "Ferrari", "Ferraro", "Ferrero", "Ferretti", "Ferri",
        "Ferro", "Fiore", "Fontana", "Franco", "Fumagalli", "Fusco", "Galli", "Gallo", "Gargiulo", "Garofalo",
        "Gatti", "Gentile", "Giordano", "Giorgi", "Giuliani", "Grassi", "Grasso", "Greco", "Grimaldi", "Guerra",
        "Guidi", "Leone", "Lombardi", "Lombardo", "Longo", "Lorusso", "Mancini", "Marchetti", "Marchi", "Mariani",
        "Marini", "Marino", "Marra", "Martinelli", "Martini", "Martino", "Mazza", "Mele", "Meloni", "Messina",
        "Milani", "Monaco", "Montanari", "Monti", "Morelli", "Moretti", "Moro", "Napolitano", "Neri", "Olivieri",
        "Orlando", "Pace", "Pagano", "Palmieri", "Palumbo", "Parisi", "Pastore", "Pellegrini", "Pellegrino", "Pepe",
        "Perrone", "Piazza", "Piccolo", "Pinna", "Piras", "Poli", "Pozzi", "Proietti", "Ricci", "Ricciardi",
        "Rinaldi", "Riva", "Rizzi", "Rizzo", "Romano", "Romeo", "Rossetti", "Rossi", "Ruggeri", "Ruggiero", "Russo",
        "Sala", "Sanna", "Santini", "Santoro", "Sartori", "Serra", "Silvestri", "Sorrentino", "Testa", "Valente",
        "Valentini", "Villa", "Villani", "Vitale", "Vitali", "Volpe", "Zanetti", "Zucchini", "Zucchelli"

    };
    private String residenze[] = new String[]{"Agrigento", "Alessandria", "Ancona", "Aosta", "Arezzo",
        "Ascoli Piceno", "Asti", "Avellino", "Bari", "Barletta-Andria-Trani", "Belluno", "Benevento", "Bergamo",
        "Biella", "Bologna", "Bolzano", "Brescia", "Brindisi", "Cagliari", "Caltanissetta", "Campobasso",
        "Carbonia-Iglesias", "Caserta", "Catania", "Catanzaro", "Chieti", "Como", "Cosenza", "Cremona", "Crotone",
        "Cuneo", "Enna", "Fermo", "Ferrara", "Firenze", "Foggia", "Forlì-Cesena", "Frosinone", "Genova", "Gorizia",
        "Grosseto", "Imperia", "Isernia", "La Spezia", "L'Aquila", "Latina", "Lecce", "Lecco", "Livorno", "Lodi",
        "Lucca", "Macerata", "Mantova", "Massa-Carrara", "Matera", "Messina", "Milano", "Modena",
        "Monza e della Brianza", "Napoli", "Novara", "Nuoro", "Olbia-Tempio", "Oristano", "Padova", "Palermo",
        "Parma", "Pavia", "Perugia", "Pesaro e Urbino", "Pescara", "Piacenza", "Pisa", "Pistoia", "Pordenone",
        "Potenza", "Prato", "Ragusa", "Ravenna", "Reggio Calabria", "Reggio Emilia", "Rieti", "Rimini", "Roma",
        "Rovigo", "Salerno", "Medio Campidano", "Sassari", "Savona", "Siena", "Siracusa", "Sondrio", "Taranto",
        "Teramo", "Terni", "Torino", "Ogliastra", "Trapani", "Trento", "Treviso", "Trieste", "Udine", "Varese",
        "Venezia", "Verbano-Cusio-Ossola", "Vercelli", "Verona", "Vibo Valentia", "Vicenza", "Viterbo"};

    public GeneratoreID() {
    }

    public String[] getNomi() {
        return nomi;
    }

    public String[] getCognomi() {
        return cognomi;
    }

    //Creazione della persona 
    public void createPersona() {
        Random rand = new Random();
        int min1 = 1;
        int max1 = nomi.length;

        int max2 = cognomi.length;

        int min2 = 1;
        int max3 = 100;
        int max4 = residenze.length;

        int seme1 = ((max1 - min1) + 1);
        int seme2 = ((max2 - min1) + 1);
        int seme3 = ((max3 - min2) + 1);
        int seme4 = ((max4 - min1) + 1);
        
        int min = 1;
        int max = 10000;
        int seme = ((max - min) + 1);
        String nome;
        String cognome;
        String residenza;
        int eta;
        int id;
        for (int i = 0; i < 30001; i++) {
            int randEta = rand.nextInt(seme3) + min2;
            int randNomi = rand.nextInt(seme1);
            int randCognomi = rand.nextInt(seme2);
            int randResidenza = rand.nextInt(seme4);
            nome = nomi[randNomi];
            cognome = cognomi[randCognomi];
            eta = randEta;
            id = rand.nextInt(100000);
            boolean ris = false;
            while (ris != true) {
                ris = ctrlID(id);
                if (ris != true) {
                    id = rand.nextInt(10000);
                }
            }
            int reddito = rand.nextInt(seme) + min;
            int nFigli = rand.nextInt(5);
            residenza = residenze[randResidenza];
            Persona persona = new Persona(nome, cognome, id, eta, reddito, nFigli, residenza);
            persone.add(persona);
            int percentuale = ((i * 30001 )/10000000); 
            System.out.println("Processo iniziale ="+percentuale);
        }
        System.out.println("Processo iniziale =100" + "\n" + "\n" + "\n"+ "\n" + "\n" + "\n"  );

    }
 // Primi calcoli Statistici
    public String aventiDiritto() {
        int ris = 0;
        for (int i = 0; i < persone.size(); i++) {
            if (persone.get(i).getEta() >= 18) {
                ris++;
            }
        }

        return "Gli aventi diritto di voto sono:" + ris;
    }
//Calcoli statistici completi per avere un quadro generale
    public String censimento() {
        double redditoMedio = 0;
        double etaMedia = 0;
        double natalitaMedia = 0;
        double dump = 0;

        String censimento;
        for (int i = 0; i < persone.size(); i++) {
            redditoMedio = persone.get(i).getReddito() + redditoMedio;
            etaMedia = persone.get(i).getEta() + etaMedia;
            natalitaMedia = persone.get(i).getNfigli() + natalitaMedia;
            dump = dump + persone.get(i).getReddito();
        }
        int reddito = (int) redditoMedio / persone.size();
        int eta =(int) etaMedia / persone.size();
        int natalita =(int) natalitaMedia / persone.size();
        int casseDelloStato =(int) ((dump * 44) / 100);
        //Passo il valore alla classe Stato
        State state = new State();
        state.setCasseDelloStato(casseDelloStato);

        censimento = "Reddito Medio: " + reddito + "\n" + "Eta Media: " + eta + "\n" + "Numero medio figli: "
                + natalita + "\n" +"Soldi Dello Stato = " + casseDelloStato;
                return censimento;
    }
    //ricerca di un id
    public boolean ctrlID(int id) {
        boolean ris = true;
        for (int i = 0; i < persone.size(); i++) {
            if (persone.get(i).getId() == id) {
                ris = false;
                break;
            }

        }
        return ris;
    }
    //Popolazione
    public int popolo()
    {
        int i = persone.size();
        return i;
    }

}


