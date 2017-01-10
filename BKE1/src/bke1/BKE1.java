/*
 * Dit programma werkt niet zoals bedoeld. Je moet het volgende doen:
 * a) Uitzoeken waarom het niet werkt. Als je dit weet dan 
 * begrijp je voor een deel de theorie van objecten
 * 
 * b) De code aanpassen zodat het wel werkt zoals bedoeld.
 */
package bke1;

import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author hoogendorp
 */
public class BKE1 extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new BKE1();
        frame.setSize( 420, 200);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "is gelijk?");
        frame.setContentPane( new BKEPaneel() );
        frame.setVisible( true );
    } 
}

class BKEPaneel extends JPanel {
    private JTextField invoerVak, uitvoerVak;
    private JButton knopBKE;
    
    public BKEPaneel() {
        invoerVak = new JTextField( 10 );
        uitvoerVak = new JTextField( 10);
        
        knopBKE = new JButton( "controleer");
        knopBKE.addActionListener( new invoerVakHandler());
        
        add( invoerVak);
        add( uitvoerVak);
        add( knopBKE );
    }

// Deze klasse vergelijkt de input in invoerVak en uitvoerVak
// Het is de bedoeling dat bij gelijke invoer "gewonnen" wordt
class invoerVakHandler implements ActionListener {
    public void actionPerformed( ActionEvent e) {
        String vakA = invoerVak.getText();
        String vakB = uitvoerVak.getText();
        if(vakA == vakB) {
            invoerVak.setText("gewonnen");
        }
        else {invoerVak.setText("verloren");}
        
        uitvoerVak.setText( "tst");
     }
   }
}
