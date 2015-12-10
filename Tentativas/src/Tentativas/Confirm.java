/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tentativas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Rafael
 */
public class Confirm implements ActionListener {
    Conf e;
    cadastro c;

    Confirm(cadastro a) {
        this.c = a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.e = new Conf(c);
    }
}
