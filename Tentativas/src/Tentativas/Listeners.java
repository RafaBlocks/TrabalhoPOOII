package Tentativas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Listeners implements ActionListener{
    cadastro c;
    Conf d;
    boolean r;
    
    public Listeners(cadastro c, Conf d, boolean r){
        this.c = c;
        this.d = d;
        this.r = r;
    }
    
    public Listeners(Conf d, boolean r){
        this.d = d;
        this.r = r;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(r == true){
            this.c.setVisible(false);
            this.d.setVisible(false);
            JOptionPane.showMessageDialog(null,"\n" + c.tfNome.getText()+
                                            "\n"+c.cSex.getSelectedItem()+
                                            "\n"+c.lDisc.getSelectedItem()+
                                            "\n"+c.taComent.getText());
        }
        if(r == false){
            d.setVisible(r);
        }
    }
    
}
