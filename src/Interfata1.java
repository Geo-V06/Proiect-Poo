import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//5
public class Interfata1 extends JFrame {private ArrayList<Plata> listaPlati;
    private ArrayList<Transfer> listaTransferuri;
    private JTextArea txtRezultate;
    private JTextField txtValoare;

    public Interfata1(ArrayList<Transfer> listaTransferuri, ArrayList<Plata> listaPlati)  {
        this.listaTransferuri = listaTransferuri;
        this.listaPlati = listaPlati;

        setTitle("Interfață Gestionare Tranzacții - POO");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panelSus = new JPanel();
        panelSus.setLayout(new FlowLayout());

        panelSus.add(new JLabel("Valoare / Lungime ID:"));
        txtValoare = new JTextField(10);
        panelSus.add(txtValoare);

        JButton btnFrauda = new JButton("Verifică Fraude ID (<5)");
        JButton btnSuma = new JButton("Filtrează după Sumă Minimă");

        panelSus.add(btnFrauda);
        panelSus.add(btnSuma);

        add(panelSus, BorderLayout.NORTH);

        txtRezultate = new JTextArea();
        txtRezultate.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtRezultate);
        add(scrollPane, BorderLayout.CENTER);

        btnFrauda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRezultate.setText(""); // Curățăm ecranul
                txtRezultate.append("Se verifica idurile in caz de frauda\n");

                boolean gasit = false;
                for (Plata p : listaPlati) {
                    if (p.getIplata() != null && p.getIplata().length() < 5) {
                        txtRezultate.append("Suspicios Plata: " + p.toString() + "\n");
                        gasit = true;
                    }
                }
                for (Transfer t : listaTransferuri) {
                    if (t.getIdT() != null && t.getIdT().length() < 5) {
                        txtRezultate.append("Suspicios  Transfer: " + t.toString() + "\n");
                        gasit = true;
                    }
                }
                if (!gasit) {
                    txtRezultate.append("Nus probleme\n");
                }
            }
        });

        // Acțiunea pentru butonul de Sumă (Metoda 2)
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sumaMinima = Double.parseDouble(txtValoare.getText());
                    if (sumaMinima < 0) {
                        JOptionPane.showMessageDialog(null, "Get a job !", "Debt", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    txtRezultate.setText("");
                    txtRezultate.append("Rezultatul sumelor care au atins aceasta suma minima sau mai sus sunt: " + sumaMinima );

                    boolean gasit = false;
                    for (Plata p : listaPlati) {
                        if (p.getSuma1() >= sumaMinima) {
                            txtRezultate.append("Plată: " + p.toString() + "\n");
                            gasit = true;
                        }
                    }
                    for (Transfer t : listaTransferuri) {
                        if (t.getSuma2() >= sumaMinima) {
                            txtRezultate.append("Transfer: " + t.toString() + "\n");
                            gasit = true;
                        }
                    }
                    if (!gasit) {
                        txtRezultate.append("Nu-s sume....\n");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Numar gresit!", "No money", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
