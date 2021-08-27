package classes;



import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class TitleBar extends JPanel{

//Construtor do título
TitleBar(){
    this.setPreferredSize(new Dimension(500,100));
    //Escrita na tela, altera texto,tamanho,fonte e espaço
    JLabel titleText = new JLabel("Lista De Afazeres");
    titleText.setPreferredSize(new Dimension(300,100));
    titleText.setFont(new Font("Arial",Font.BOLD,30));
    titleText.setHorizontalAlignment(JLabel.CENTER);
    this.add(titleText);
    


    
    
}   
}
