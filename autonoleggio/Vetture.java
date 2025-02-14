public class Vetture extends Veicoli {
    private int Nposti;

    public Vetture(String targa, int numeroMatricola, String marca, String modello, int cilindrata, int annoAcquisto,
            int serbatoio, int giorni, int kmpercorsi, int litrimancanti, int nposti) {
        super(targa, numeroMatricola, marca, modello, cilindrata, annoAcquisto, serbatoio, giorni, kmpercorsi,
                litrimancanti);
        Nposti = nposti;
        setSerbatoio(100);
    }
    public int getNposti() {
        return Nposti;
    }

    public void setNposti(int nposti) {
        this.Nposti = nposti;
    }

    public int costoNoleggio(){
        return (getGiorni()*50)+((getKmPercorsi()/25)*1)+((getSerbatoio()-getLitriMancanti())*2);
    }

    @Override
    public String toString() {
        return super.toString()+"Vetture [Nposti=" + Nposti + "]";
    }
}
