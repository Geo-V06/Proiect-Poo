import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
            System.out.println(plata.toString() + " Suma de bani dupa comision : " + plata.Taxadeprotectie() + "\n" +  plata.verificabani());


        }
        for (Transfer transfer : ListadeTransferuri) {
            System.out.println(transfer.toString() + " Suma de bani  dupa comision : " + transfer.Taxadeprotectie() +   "\n" +transfer.verificabani());

        } //Apelam cele 2 metode pentru liste (4)
        VerificareId(listaDePlata,ListadeTransferuri);
        AtentieSuma(listaDePlata,ListadeTransferuri);
    //Apelam interfata..(5)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfata1(ListadeTransferuri, listaDePlata).setVisible(true);
            }
        });



    }












//4
    public static void VerificareId(ArrayList<Plata> p, ArrayList<Transfer> t) {
        System.out.println("Se verifica idurile in caz de frauda");
        boolean suspicune = false;
        for (Plata P : p) {
            if (P.getIplata() != null && P.getIplata().length() < 5) {
                System.out.println("Suspicios om...." + P.toString());
                suspicune = true;
            }
        }
        for (Transfer T : t) {
            if (T.getIdT() != null && T.getIdT().length() < 5) {
                System.out.println("Suspicios Transfer..... " + T.toString());
                suspicune = true;
            }
        }
        if (!suspicune) {
            System.out.println("Toate idurile sunt valide si corecte. NUS probleme");
        }
    }
    public static void AtentieSuma(ArrayList<Plata> p1, ArrayList<Transfer> t1){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Zimi suma pe care vrei sa o cauti");
        double sumaCautata  = scanner.nextDouble();
        if(sumaCautata < 0){
            System.out.println("Get a job ! " + sumaCautata);
            return;
        }
        System.out.println("Plate  cu suma :"+ sumaCautata + "sunt:");
        boolean  cautaP = false;
        for ( Plata P1:p1){
            if (P1.getSuma1() >= sumaCautata ){
                System.out.println(P1.toString());
                cautaP = true;
            }
        }
        if(!cautaP) {
            System.out.println("Nu ai plati  pentru aceasta suma !");
        }

        System.out.println("Transferuri cu suma : " + sumaCautata + "sunt");
        boolean cautaT = false;
        for (Transfer T1:t1){
            if (T1.getSuma2() >= sumaCautata){
                System.out.println(T1.toString());
                cautaT = true;


            }
        }
        if(!cautaT){
            System.out.println("Nu ai transferuri pentru aceasta suma !");
        }
    }
}