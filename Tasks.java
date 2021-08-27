package classes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tasks extends JPanel {
    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean checked;
    //Construtor
    Tasks()
    {
        this.setPreferredSize(new Dimension(50,30));
        this.setBackground(Color.BLACK);

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(50,50));
        index.setHorizontalAlignment(JLabel.CENTER);

        this.add(index,BorderLayout.EAST);


        taskName = new JTextField("Digite sua tarefa aqui");
        taskName.setBorder((BorderFactory.createEmptyBorder()));
        taskName.setBackground(Color.BLUE);

        this.add(taskName,BorderLayout.CENTER);

        done = new JButton("Feito");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder((BorderFactory.createEmptyBorder()));

        this.add(done,BorderLayout.EAST);
    }
    public JButton getDone()
    {
        return done;
    }
    public void changeIndex(int num)
    {
        this.index.setText(num+"");
        this.revalidate();
    }
    public void changeState()
    {
        this.setBackground(Color.GREEN);
        taskName.setBackground(Color.GREEN);
        checked = true;
    }
    
}
