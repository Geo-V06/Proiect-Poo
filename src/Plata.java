public class Plata extends Tranzactie{

    private String iplata;
    private String mon;
    private String numeu;
    private double suma1;

    public String getNumeu() {
        return numeu;
    }

    public void setNumeu(String numeu) {
        this.numeu = numeu;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getIplata() {
        return iplata;
    }

    public void setIplata(String iplata) {
        this.iplata = iplata;
    }
    public Plata(){
        iplata = "Nonexistent";
        mon = "Care moneda?";
        numeu = "MIA";
        suma1 = 0;
    }

    public Plata(String iplata, String mon, String numeu, double suma1) {
        this.iplata = iplata;
        this.mon = mon;
        this.numeu = numeu;
        this.suma1 = suma1;
    }
    public Plata(Plata a){
        iplata = a.iplata;
        mon = a.mon;
        numeu = a.numeu;
        suma1 = a.suma1;

    }

    @ Override
    public double Taxadeprotectie() {
    double comision =0.20*suma1;
    return (   suma1-comision );
    }

     public String  toString(){
        return ( "IdulPLati:"+iplata + "Currency:" + mon + " Nume utilizator:"+ numeu + " Bani lui/ei sunt:" + suma1);
    }
}
