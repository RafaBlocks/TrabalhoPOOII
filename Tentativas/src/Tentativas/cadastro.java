package Tentativas;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionListener;

/**
 *
 * @author Rafael
 */
public class cadastro extends JFrame implements ActionListener{
    public TextField tfNome;
    public List lDisc;
    public Choice cSex;
    public TextArea taComent;
   
    public cadastro(){
        Label nmLb = new Label("Nome: "),
                sxLb = new Label("Sexo: "),
                discLb = new Label("Diciplinas: "),
                cmLb = new Label("Deixe um Comentario: ");
        TextField nmTf = new TextField(40);
        TextArea cmTa = new TextArea(100, 50);
        Button cdBt = new Button("CADASTRAR");
        Choice sexC = new Choice();
        sexC.addItem("Masculino");
        sexC.addItem("Feminino");
        List disLs = new List(5, true);
        disLs.add("Algol I");
        disLs.add("Algol II");
        disLs.add("ED I");
        disLs.add("Eng. Soft.");
        disLs.add("Libras");
        nmLb.setBounds(2, 8, 40, 20);
        nmTf.setBounds(42, 8, 220, 20);
        sxLb.setBounds(268, 8, 40, 20);
        sexC.setBounds(308, 8, 80, 20);
        discLb.setBounds(2, 42, 60, 20);
        disLs.setBounds(66, 42, 120, 84);
        cmLb.setBounds(200, 42, 125, 20);
        cmTa.setBounds(330, 42, 300, 80);
        cdBt.setBounds(260, 190, 90, 20);
        Conf c1 = new Conf(this);
        cdBt.addActionListener(c1);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(650, 350);
        this.add(nmLb);
        this.add(nmTf);
        this.tfNome = nmTf;
        this.add(sxLb);
        this.add(sexC);
        this.cSex = sexC;
        this.add(discLb);
        this.add(disLs);
        this.lDisc = disLs;
        this.add(cmLb);
        this.add(cmTa);
        this.taComent = cmTa;
        this.add(cdBt);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String Args[]){
        cadastro t = new cadastro();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Conf c = new Conf(this);
    }
    
}
