package UnknowWhotThis;

//
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    int SizeX = 300;
    int SizeY = 300;
    int Width = 400;
    int Height = 400;

    public void win() {
        JFrame a = new JFrame("Click this");
        a.setBounds(SizeX, SizeY, Width, Height);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton but = new JButton("Click here");
        buttonsPanel.add(but);

        ActionListener Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Action smile = new Action();
                smile.click();
            }
        };

        but.addActionListener(Listener);

        a.getContentPane().add(buttonsPanel);
        a.setVisible(true);
    }
}

