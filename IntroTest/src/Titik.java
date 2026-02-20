
/* NIM/Nama 	: 24060123130093/Arib Taufiqurrohman*/
/* Tanggal 		: 18 Februari 2025*/



public class Titik {
    /* atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public Titik(){
        this(0,0);
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public void printCounterTitik(){
        System.out.println(getCounterTitik());
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public double getKuadran(){
        if (absis >= 0 && ordinat >= 0 ) {
            return 1;
        } else if (absis < 0 && ordinat >= 0){
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else{
            return 4;
        }
        
    }

    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getJarak(Titik T){
        return Math.sqrt((this.absis - T.absis)*(this.absis - T.absis) + (this.ordinat - T.ordinat)*(this.ordinat-T.ordinat));
    }

    public void refleksiX(){
        ordinat*= -1;
    }

    public void refleksiY(){
        absis*= -1;
    }

    public Titik getRefleksiX(){
        Titik T = new Titik(absis, ordinat*-1);
        return T;
    }

    public Titik getRefleksiY(){
        Titik T = new Titik(absis*-1, ordinat);
        return T;
    }


}
