import java.util.ArrayList;

public class Mainu {
    public static void main(String[] args) {
        ArrayList<Plata> listaDePlata = new ArrayList<>();
        listaDePlata.add(new Plata("PL001", "RON", "Ion Popescu", 150.50));
        listaDePlata.add(new Plata("PL002", "EUR", "Maria Ionescu", 45.00));
        listaDePlata.add(new Plata("PL003", "USD", "Andrei Vasilescu", 120.99));
        listaDePlata.add(new Plata("PL004", "RON", "Elena Georgescu", 300.00));
        listaDePlata.add(new Plata("PL005", "GBP", "Cristian Stan", 89.50));
        listaDePlata.add(new Plata("PL006", "RON", "Ana Dumitrescu", 75.20));
        listaDePlata.add(new Plata("PL007", "EUR", "Vlad Munteanu", 210.00));
        listaDePlata.add(new Plata("PL008", "RON", "Ioana Radu", 55.00));
        listaDePlata.add(new Plata("PL009", "USD", "Gabriel Marin", 340.25));
        listaDePlata.add(new Plata("PL010", "RON", "Raluca Petrescu", 18.99));

        ArrayList<Transfer> ListadeTransferuri = new ArrayList<>();

        ListadeTransferuri.add(new Transfer("PL001", "RON", "Ion Popescu", 2, "RO12INGB1234", "RO98BRD5678", "TR001", 500.00));
        ListadeTransferuri.add(new Transfer("PL002", "EUR", "Maria Ionescu", 24, "RO45BTRL1111", "DE89COBA2222", "TR002", 1200.50));
        ListadeTransferuri.add(new Transfer("PL003", "USD", "Andrei Vasilescu", 1, "RO77RZB3333", "US44BOFA4444", "TR003", 300.00));
        ListadeTransferuri.add(new Transfer("PL004", "RON", "Elena Georgescu", 5, "RO11BRD5555", "RO22INGB6666", "TR004", 150.00));
        ListadeTransferuri.add(new Transfer("PL005", "GBP", "Cristian Stan", 48, "RO99BCR7777", "GB12LLOY8888", "TR005", 850.00));
        ListadeTransferuri.add(new Transfer("PL006", "RON", "Ana Dumitrescu", 2, "RO33OTP9999", "RO44BTRL0000", "TR006", 95.00));
        ListadeTransferuri.add(new Transfer("PL007", "EUR", "Vlad Munteanu", 24, "RO55RAIF1231", "FR76BNPA3214", "TR007", 2300.00));
        ListadeTransferuri.add(new Transfer("PL008", "RON", "Ioana Radu", 1, "RO66CEC4321", "RO77BCR8765", "TR008", 450.00));
        ListadeTransferuri.add(new Transfer("PL009", "USD", "Gabriel Marin", 72, "RO88GARB1357", "US11JPMO2468", "TR009", 5400.00));
        ListadeTransferuri.add(new Transfer("PL010", "RON", "Raluca Petrescu", 3, "RO22VOTB2468", "RO33RZB1357", "TR010", 670.00));


        for (Plata plata : listaDePlata) {
            System.out.println(plata.toString() + " Comision" + plata.Taxadeprotectie());


        }
        for(Transfer transfer: ListadeTransferuri) {
            System.out.println(transfer.toString()+ "Comision :"+ transfer.Taxadeprotectie());

        }

    }
}