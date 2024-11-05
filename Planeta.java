enum TipoPlaneta{
    GASEOSO,
    TERRESTRE,
    ENANO
}
public class Planeta {
    String nombre = null;
    int satelites = 0;
    double masaKG = 0.0;
    double volumen = 0.0;
    int diametroKM = 0;
    int distMediaSol = 0;
    TipoPlaneta tipo = TipoPlaneta.TERRESTRE;
    boolean esObservable = false;
    int periodoOrbital; //En años
    int periodoDeRotacion; //En días

    //Constructor
    public Planeta(String nombre, int satelites, double masaKG, double volumen, int diametroKM, int distMediaSol, TipoPlaneta tipo, boolean esObservable, int periodoOrbital, int periodoDeRotacion) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masaKG = masaKG;
        this.volumen = volumen;
        this.diametroKM = diametroKM;
        this.distMediaSol = distMediaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoDeRotacion = periodoDeRotacion;
    }



    //Getter
    public String getNombre() {
        return nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public double getMasaKG() {
        return masaKG;
    }

    public double getVolumen() {
        return volumen;
    }

    public int getDiametroKM() {
        return diametroKM;
    }

    public int getDistMediaSol() {
        return distMediaSol;
    }

    public boolean isEsObservable() {
        return esObservable;
    }

    public TipoPlaneta getTipo() {
        return tipo;
    }

    public int getPeriodoOrbital() {
        return periodoOrbital;
    }

    public int getPeriodoDeRotacion() {
        return periodoDeRotacion;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public void setMasaKG(double masaKG) {
        this.masaKG = masaKG;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setDiametroKM(int diametroKM) {
        this.diametroKM = diametroKM;
    }

    public void setDistMediaSol(int distMediaSol) {
        this.distMediaSol = distMediaSol;
    }

    public void setEsObservable(boolean esObservable) {
        this.esObservable = esObservable;
    }

    public void setTipo(TipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public void setPeriodoOrbital(int periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public void setPeriodoDeRotacion(int periodoDeRotacion) {
        this.periodoDeRotacion = periodoDeRotacion;
    }

    //Métodos
    void mostrarDatos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Satelites: " +satelites);
        System.out.println("Masa: " +masaKG);
        System.out.println("Volumen: " +volumen);
        System.out.println("Diámetro: " +diametroKM);
        System.out.println("Distancia con el sol: " +distMediaSol);
        System.out.println("Tipo de planeta: " +tipo);
        System.out.println("¿Es observable?: " +esObservable);
        System.out.println("Período orbital: " +periodoOrbital);
        System.out.println("Período de rotación: " +periodoDeRotacion);
    }

    //Metodo para calcular la densidad
    public double calcularDensidad(){
        if(volumen == 0) return 0;
        return masaKG / volumen;
    }

    //Metodo para saber si es un planeta exterior
    public boolean esPlanetaExterior(){
        //convertimos la distancia media al sol a UA
        double distanciaUA = (distMediaSol * 1_000_000) / 149597870.0;
        return distanciaUA > 2.1 && distanciaUA < 3.4;
    }


}
