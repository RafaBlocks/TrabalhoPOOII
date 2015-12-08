/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tentativas;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author Rafael
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    Frame f = new Frame();
    Button lgBt = new Button("LOGIN");
    Label usLb = new Label("Usuario: "),
            senhaLb = new Label("Senha: ");
    Panel p1 = new Panel(),
            p2 = new Panel(),
            pb = new Panel();
    TextField usTf = new TextField(),
            senhaTf = new TextField();
    
    public Principal (){
        f.setSize(300,360);
        f.setLocation(600,200);
        f.setTitle("Login");
        f.setLayout(new GridLayout(3,1));
        p1.add(usLb);
        p1.add(usTf);
        f.add(p1);
        p2.add(senhaLb);
        p2.add(senhaTf);
        f.add(p1);
        f.add(p2);
        pb.add(lgBt);
        f.add(pb);
        f.setResizable(true);
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Principal janela = new Principal();
    }
}
