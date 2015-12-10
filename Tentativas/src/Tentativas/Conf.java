/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tentativas;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Conf extends JFrame implements ActionListener{
    Button sBt = new Button("Sim"),
            nBt = new Button("Nao");
    Label cLb = new Label("Deseja cadastrar estas informacoes?");
    Panel p1 = new Panel(),
            p2 = new Panel();
    cadastro c1;
    public static cadastro c2;

    public Conf(cadastro d){
        this.c1 = d;
        Conf.c2 = this.c1;
        this.setSize(300,150);
        this.setVisible(true);
        this.setTitle("CONFIRMACAO");
        this.setLayout(new GridLayout(3, 1));
        p2.add(sBt);
        Listeners l1 = new Listeners(d,this,true);
        sBt.addActionListener(l1);
        p2.add(nBt);
        Listeners l2 = new Listeners(this,false);
        nBt.addActionListener(l2);
        this.add(p1);
        this.add(p2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     public static void main(String[] args) {
         Conf c = new Conf(c2);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        Conf c = new Conf(c1);
    }

   
     
}
