public class Transfer extends  Plata {
    private int timptransfer;
    private String conts;
    private String contd;
    private String idT;
    private double suma2;

    public int getTimptransfer() {
        return timptransfer;
    }

    public void setTimptransfer(int timptransfer) {
        this.timptransfer = timptransfer;
    }

    public String getConts() {
        return conts;
    }

    public void setConts(String conts) {
        this.conts = conts;
    }

    public String getContd() {
        return contd;
    }

    public void setContd(String contd) {
        this.contd = contd;
    }

    public String getIdT() {
        return idT;
    }

    public void setIdT(String idT) {
        this.idT = idT;
    }


    public double getSuma() {
        return suma2;
    }


    public void setSuma(double suma2) {
        this.suma2 = suma2;
    }

    public Transfer() {
        timptransfer = 0;
        conts = "Nu e el";
        contd = "Nici el";
        idT = "Nu are id";
        suma2 = 0;
    }


    public Transfer(String iplata, String mon, String numeu , int timptransfer, String conts, String contd, String idT, double suma2) {
        super(iplata, mon, numeu, suma2);
        this.timptransfer = timptransfer;
        this.conts = conts;
        this.contd = contd;
        this.idT = idT;
        this.suma2 = suma2;
    }

    public Transfer(Transfer c) {
        super(c);
        this.timptransfer = c.timptransfer;
        this.conts = c.conts;
        this.contd = c.contd;
        this.idT = c.idT;
        this.suma2 = c.suma2;
    }

    @Override
    public double Taxadeprotectie() {
        double comision = 0.10 * suma2;
        return suma2 - comision;
    }
    @Override
    public String toString(){
        return(   "Timpul de transfer:" + timptransfer + "Contul sursa:" + conts + "Contul destinatar:" + contd +"Idul Transferului" + idT + "Suma de bani a transferului:"+ suma2);
    }
}
