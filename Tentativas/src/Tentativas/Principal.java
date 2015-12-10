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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Principal extends JFrame implements ActionListener{

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
    TextField usTf = new TextField(30),
            senhaTf = new TextField(30);
    
    public Principal (){
        this.setSize(300,360);
        this.setLocation(600,200);
        this.setTitle("Login");
        this.setLayout(new GridLayout(3,1));
        lgBt.addActionListener(this);
        p1.add(usLb);
        p1.add(usTf);
        this.add(p1);
        p2.add(senhaLb);
        p2.add(senhaTf);
        this.add(p1);
        this.add(p2);
        pb.add(lgBt);
        this.add(pb);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Principal p = new Principal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.usTf.getText().equals("") && this.senhaTf.getText().equals("")){
            this.setVisible(false);
            cadastro cad = new cadastro();
        }
        else
            JOptionPane.showMessageDialog(null, "LOGIN OU SENHA INCORRETO");
    }
}

