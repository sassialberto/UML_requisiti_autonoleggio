public abstract class Veicoli {
    private String Targa;
    private int numeroMatricola;
    private String Marca;
    private String Modello;
    private int Cilindrata;
    private int AnnoAcquisto;
    private int Serbatoio;
    private int litriMancanti;
    private int Giorni;
    private int kmPercorsi;

    public Veicoli(String targa, int numeroMatricola, String marca, String modello, int cilindrata, 
                    int annoAcquisto,int serbatoio,int giorni,int kmpercorsi,int litrimancanti) {
        this.Targa = targa;
        this.numeroMatricola = numeroMatricola;
        this.Marca = marca;
        this.Modello = modello;
        this.Cilindrata = cilindrata;
        this.AnnoAcquisto = annoAcquisto;
        this.Serbatoio = serbatoio;
        this.Giorni=giorni;
        this.kmPercorsi=kmpercorsi;
        this.litriMancanti=litrimancanti;
    }

    public String getTarga() {
        return Targa;
    }

    public void setTarga(String targa) {
        this.Targa = targa;
    }

    public int getNumeroMatricola() {
        return numeroMatricola;
    }

    public void setNumeroMatricola(int numeroMatricola) {
        this.numeroMatricola = numeroMatricola;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        this.Modello = modello;
    }

    public int getCilindrata() {
        return Cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.Cilindrata = cilindrata;
    }

    public int getAnnoAcquisto() {
        return AnnoAcquisto;
    }

    public void setAnnoAcquisto(int annoAcquisto) {
        this.AnnoAcquisto = annoAcquisto;
    }

    public int getSerbatoio() {
        return Serbatoio;
    }

    public void setSerbatoio(int serbatoio) {
        this.Serbatoio = serbatoio;
    }

    public int getGiorni() {
        return Giorni;
    }

    public void setGiorni(int giorni) {
        Giorni = giorni;
    }

    public int getKmPercorsi() {
        return kmPercorsi;
    }

    public void setKmPercorsi(int kmPercorsi) {
        this.kmPercorsi = kmPercorsi;
    }

    public int getLitriMancanti() {
        return litriMancanti;
    }

    public void setLitriMancanti(int litriMancanti) {
        this.litriMancanti = litriMancanti;
    }
    
    @Override
    public String toString() {
        return "Veicoli [Targa=" + Targa + ", numeroMatricola=" + numeroMatricola + ", Marca=" + Marca + ", Modello="
                + Modello + ", Cilindrata=" + Cilindrata + ", AnnoAcquisto=" + AnnoAcquisto + ", Serbatoio=" + Serbatoio
                + ", Giorni=" + Giorni + ", kmPercorsi=" + kmPercorsi + "]";
    }
}
