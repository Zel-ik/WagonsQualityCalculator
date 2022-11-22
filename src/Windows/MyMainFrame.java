package Windows;

import Wagon.WagonManager;

import javax.swing.*;
import java.awt.*;

public class MyMainFrame extends JFrame {
    JButton wagonAdd;
    JButton calculation;
    WagonManager manager = new WagonManager();

    public WagonManager getManager() {
        return manager;
    }

    public MyMainFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Расчет средних значений вагонов");
        this.setSize(710,300);
        this.setLayout(null);
        this.setResizable(false);
        ImageIcon titleIcon = new ImageIcon("images/wagon.png");
        this.setIconImage(titleIcon.getImage());
        this.getContentPane().setBackground(Color.white);

        calculation = new JButton();
        calculation.setBounds(210,50,190,180);
        calculation.setText("обработка");
        calculation.setFont(new Font(null, Font.BOLD, 10));
        calculation.setIcon(new ImageIcon("images/counting.png"));
        calculation.setVerticalTextPosition(JButton.BOTTOM);
        calculation.setHorizontalTextPosition(JButton.CENTER);
        calculation.setVerticalAlignment(JButton.TOP);
        calculation.setBackground(Color.white);
        calculation.setBorder(BorderFactory.createLineBorder(Color.black,3));
        
        wagonAdd = new JButton();
        wagonAdd.setBounds(10,50,190,180);
        wagonAdd.setText("Добавить вагон");
        wagonAdd.setFont(new Font(null, Font.BOLD, 10));
        wagonAdd.setIcon(new ImageIcon("images/96100.png"));
        wagonAdd.setVerticalTextPosition(JButton.BOTTOM);
        wagonAdd.setHorizontalTextPosition(JButton.CENTER);
        wagonAdd.setVerticalAlignment(JButton.TOP);
        wagonAdd.setBackground(Color.white);
        wagonAdd.setBorder(BorderFactory.createLineBorder(Color.black,3));

        this.add(wagonAdd);
        this.add(calculation);


        wagonAdd.addActionListener(e ->{
            new AddWagonWindow();
            wagonAdd.setEnabled(false);
        });


        calculation.addActionListener(e ->{
            System.out.println(manager.getWagons());
        });

        this.setVisible(true);

    }
}
