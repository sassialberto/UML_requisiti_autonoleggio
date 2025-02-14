public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("1a2b3c", "Mercedes", 20, "X", 4);
        Auto a2 = new Auto("1a2b4c", "Fiat", 21, "X", 5);
        Auto a3 = new Auto("1a2b5c", "Mercedes", 22, "X", 4);
        Auto a4 = new Auto("1a2b6c", "Skoda", 23, "X", 4);
        Autonoleggio auto_noleggio = new Autonoleggio();
        System.out.println(auto_noleggio.toString());
        auto_noleggio.aggiungi_veicolo(a1);
        auto_noleggio.aggiungi_veicolo(a2);
        auto_noleggio.aggiungi_veicolo(a3);
        auto_noleggio.aggiungi_veicolo(a4);
        System.out.println("\n"+auto_noleggio.toString());
        auto_noleggio.rimuovi_veicolo("1a2b3c");
        auto_noleggio.rimuovi_veicolo(21);
        System.out.println("\n"+auto_noleggio.toString());
        auto_noleggio.rimuovi_veicolo("1111");
        System.out.println("\n"+auto_noleggio.informazioni_veicolo("1a2b5c"));
        System.out.println("\n"+auto_noleggio.informazioni_veicolo(23));
        auto_noleggio.aggiungi_veicolo(a1);
        auto_noleggio.aggiungi_veicolo(a2);
        int n=4;
        System.out.println("\nLe auto con " + n + " posti sono: " + auto_noleggio.ricerca_posti(n));
        String marca = "Mercedes";
        System.out.println("\nLe auto " + marca +" sono: " + auto_noleggio.veicoli_marca(marca));
        
    }
}
