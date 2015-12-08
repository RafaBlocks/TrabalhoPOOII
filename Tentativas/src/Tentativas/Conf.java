/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tentativas;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Conf extends JFrame{
    Button sBt = new Button("Sim"),
            nBt = new Button("Nao");
    Label cLb = new Label("Deseja cadastrar estas informacoes?");
    Panel p1 = new Panel(),
            p2 = new Panel();
    public Conf(){
        this.setSize(300,150);
        this.setVisible(true);
        this.setTitle("CONFIRMACAO");
        this.setLayout(new GridLayout(3, 1));
        p1.add(cLb);
        p2.add(sBt);
        p2.add(nBt);
        this.add(p1);
        this.add(p2);
    }
     public static void main(String[] args) {
         Conf c = new Conf();
     }
}
