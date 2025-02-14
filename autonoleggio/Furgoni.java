public class Furgoni extends Veicoli {
    private int Carico;

    public Furgoni(String targa, int numeroMatricola, String marca, String modello, int cilindrata, int annoAcquisto,
            int serbatoio, int giorni, int kmpercorsi, int litrimancanti, int carico) {
        super(targa, numeroMatricola, marca, modello, cilindrata, annoAcquisto, serbatoio, giorni, kmpercorsi,
                litrimancanti);
        this.Carico = carico;
        setSerbatoio(150);
    }

    public int getCarico() {
        return Carico;
    }

    public void setCarico(int carico) {
        this.Carico = carico;
    }

    public int costoNoleggio(){
        int costo=0;
        if(getKmPercorsi()>100){
            costo=(getGiorni()*70)+((getKmPercorsi()/30)*1)+((getSerbatoio()-getLitriMancanti())*2);
        }
        return costo;
    }

    @Override
    public String toString() {
        return super.toString()+"Furgoni [Carico=" + Carico + "]";
    }    
}
