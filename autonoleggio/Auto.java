public class Auto{

    private String targa;
    private String marca;
    private int codice;
    private String modello;
    private int numero_posti;

    public Auto(String targa, String marca, int codice, String modello, int numero_posti) {
        this.targa = targa;
        this.marca = marca;
        this.codice = codice;
        this.modello = modello;
        this.numero_posti = numero_posti;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodice() {
        return codice;
    }

    public String getModello() {
        return modello;
    }

    public int getNumero_posti() {
        return numero_posti;
    }

    public String toString(){
        return "L'auto " + marca + " " + modello + " con targa " + targa +", codice " + codice + " e " + numero_posti + " posti";
    }
}