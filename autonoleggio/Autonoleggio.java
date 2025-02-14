import java.util.ArrayList;
public class Autonoleggio {
    
    private ArrayList<Auto> lista_macchine = new ArrayList<Auto>(1000);
    private int numero_veicoli = 0;

    public void aggiungi_veicolo(Auto a1){
        lista_macchine.add(a1);
        numero_veicoli++;
    }

    public void rimuovi_veicolo(int codice){
        boolean nessuna_corrispondenza = true;
        for (Auto auto : lista_macchine) {
            if(auto.getCodice()==codice){
                lista_macchine.remove(auto);
                nessuna_corrispondenza = false;
                numero_veicoli--;
                break;
            }
        }
        if(nessuna_corrispondenza){
            System.out.println("Nessun veicolo trovato");
        }
    }

    public void rimuovi_veicolo(String targa){
        boolean nessuna_corrispondenza = true;
        for (Auto auto : lista_macchine) {
            if(auto.getTarga().equals(targa)){
                lista_macchine.remove(auto);
                nessuna_corrispondenza = false;
                numero_veicoli--;
                break;
            }
        }
        if(nessuna_corrispondenza){
            System.out.println("Nessun veicolo trovato");
        }
    }

    public String informazioni_veicolo(int codice){
        String informazioni = "Nessun veicolo trovato";
        for (Auto auto : lista_macchine) {
            if(auto.getCodice()==codice){
                informazioni = auto.toString();
            }
        }
        return informazioni;
    }

    public String informazioni_veicolo(String targa){
        String informazioni = "Nessun veicolo trovato";
        for (Auto auto : lista_macchine) {
            if(auto.getTarga()==targa){
                informazioni = auto.toString();
            }
        }
        return informazioni;
    }

    public int ricerca_posti(int n_posti){
        int n_macchine = 0;
        for (Auto auto : lista_macchine) {
            if(auto.getNumero_posti()==n_posti){
                n_macchine++;
            }
        }
        return n_macchine;
    }

    public int veicoli_marca(String marca){
        int c = 0;
        for (Auto auto : lista_macchine) {
            if(auto.getMarca().equals(marca)){
                c++;
            }
        }
        return c;
    }

    public String toString(){
        String frase = "";
        for (Auto auto : lista_macchine) {
            frase += auto.toString()+"\n";
        }
        frase += "numero totale veicoli: " + numero_veicoli;
        return frase;
    }



    

}
