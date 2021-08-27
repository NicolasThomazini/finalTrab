package classes;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseEvent;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;

public class FrontEnd extends JFrame {
    private TitleBar title;
    private Lista lista;
    private ButtonCustom btnCustom;

    private JButton addTask;
    private JButton clear;
    //Construtores 
    FrontEnd()
    {
        this.setSize(500,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        lista = new Lista();
        btnCustom = new ButtonCustom();
        this.add(title,BorderLayout.NORTH);
        this.add(btnCustom,BorderLayout.SOUTH);

        this.add(lista,BorderLayout.CENTER);

        addTask = btnCustom.getNewTask();
        clear = btnCustom.getClear();

        addListenners();
        
    }
    public void addListenners()
    {
        addTask.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                Tasks tasks = new Tasks();
                lista.add(tasks);
                lista.updateNumbers();

                tasks.getDone().addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mousePressed(MouseEvent e)
                    {
                        tasks.changeState();
                        revalidate();
                    }
                    
                });
                revalidate();
            }
         
        });
        clear.addMouseListener(new mousePressed(MouseEvent e)
        {
            
        }
    
    }
    
}
