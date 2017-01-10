
package bke2;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author krijn
 */
public class BKE2 extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new BKE2();
        frame.setSize( 420, 200);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "is gelijk?");
        frame.setContentPane( new BKEPaneel() );
        frame.setVisible( true );
    } 
}

class BKEPaneel extends JPanel {
    final JButton[] buttons = new JButton[9];
    //String[] names = {"one","two","three","four","five","six", "seven", "eight","nine"};
    String speler = "X";
    
    public BKEPaneel() {
        //schakel layout manager uit
        setLayout( null );

        for (int i=0;i<buttons.length;i++){
            buttons[i]=new JButton("_");
            buttons[i].addActionListener( new invoerVakHandler());

            //add(buttons[i]);
        }
                    
            for (int j=0; j<3;j++) {
                buttons[j].setBounds( (j+1)*60,80,50,50);
                add(buttons[j]);
            }
            
            for (int k=3; k<6;k++) {
                buttons[k].setBounds( (k-2)*60,140,50,50);
                add(buttons[k]);
            }
            
            for (int l=6; l<9; l++) {
                buttons[l].setBounds( (l-5)*60,200,50,50);
                add(buttons[l]);
            }
            
            
    }
    
    
    class invoerVakHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            JButton src =(JButton) e.getSource();
            for (int i=0; i<buttons.length; i++) {
                if (src==buttons[i]) {
                    if ((buttons[i].getText() != "X") && (buttons[i].getText() != "O")) {
                        buttons[i].setText(speler);
                        if (speler=="X") {
                            speler = "O";
                        }
                        else {
                            speler = "X";
                        }
                    }
                }
            }
        }
    }
}
