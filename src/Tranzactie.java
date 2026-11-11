public  abstract class Tranzactie {

    private String iTranzactie;  //1
    private double suma;         //2


    public String getiTranzactie() {
        return iTranzactie;
    }

    public void setiTranzactie(String iTranzactie) {
        this.iTranzactie = iTranzactie;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
    public  boolean verificabani(){         //Metoda 1
       return suma>=0;
    }
    public double  Taxadeprotectie(){       //Metoda 2
        double comision = 0.05*suma;
        return suma - comision;

    }
    public String verificainternetul (boolean Online){    //Metodata 3
        if (Online)
            return "Plata se poate efectua!";
        else
            return "Imposibila!";
    }
}




/*listaDePlata.add(new Plata("007", "Indian", "Presedintele", 100));
        listaDePlata.add(new Plata("AM1", "USD", "EU", 50));
        listaDePlata.add(new Plata("BJ8", "China", "Tu", 10.50));
        listaDePlata.add(new Plata("Pari", "Euro", "Mama", 1000));
        listaDePlata.add(new Plata("Pol", "RON", "Tata", 1.9));
        listaDePlata.add(new Plata("Isu", "INDO", "Bunica", 100000));
        listaDePlata.add(new Plata("JP", "YEN", "Bunicu", 120.03));
        listaDePlata.add(new Plata("Iacob", "RON", "Sora", 5.01));
        listaDePlata.add(new Plata("Nis", "RON", "Fratele", 10.10));
        listaDePlata.add(new Plata("PL001", "RON", "Necunoscut", 150.50));

 */
