package classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonCustom extends JPanel {

    private JButton addTask;
    private JButton clear;
    Border empetyBorder = BorderFactory.createEmptyBorder();
    // Construtor dos botões

    ButtonCustom() {
        // Tamanho e fonte
        this.setPreferredSize(new Dimension(500, 60));

        addTask = new JButton(" Adicione uma Tarefa");
        addTask.setBorder(empetyBorder);
        addTask.setFont(new Font("Arial", Font.BOLD, 30));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(30));
        clear = new JButton(" Limpar todas as Tarefas");
        clear.setBorder(empetyBorder);
        clear.setFont(new Font("Arial", Font.BOLD, 30));
        this.add(clear);
    }

    public JButton getNewTask() {
        return addTask;
    }

    public JButton getClear() {
        return clear;
    }

}
