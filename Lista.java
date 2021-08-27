package classes;
import javax.swing.JPanel;

import java.awt.Component;

import java.awt.GridLayout;

public class Lista extends JPanel {
     Lista()
    {
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(5);

        this.setLayout(layout);
               
    }
    public void updateNumbers()
    {
        Component[] listItens = this.getComponents();
        for(int i = 0;i< listItens.length;i++)
        {
            if(listItens[i] instanceof Tasks)
            {
              ((Tasks)listItens[i]).changeIndex(i+1);
            }
        }
        
    }
    
}
