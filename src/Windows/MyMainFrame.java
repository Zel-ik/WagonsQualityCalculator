package Windows;

import javax.swing.*;
import java.awt.*;

public class MyMainFrame extends JFrame {

    static JButton wagonAdd;
    AddWagonWindow wagonWindow =  new AddWagonWindow();;

    public MyMainFrame() {
        wagonWindow.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("–асчет средних значений вагонов");
        this.setSize(640, 250);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(500,300);
        ImageIcon titleIcon = new ImageIcon("images/wagon.png");
        this.setIconImage(titleIcon.getImage());
        this.getContentPane().setBackground(Color.white);

        JButton calculation = new JButton("обработка");
        calculation.setBounds(210, 20, 190, 180);
        calculation.setFont(new Font(null, Font.BOLD, 10));
        calculation.setIcon(new ImageIcon("images/counting.png"));
        calculation.setVerticalTextPosition(JButton.BOTTOM);
        calculation.setHorizontalTextPosition(JButton.CENTER);
        calculation.setVerticalAlignment(JButton.TOP);
        calculation.setBackground(Color.white);
        calculation.setBorder(BorderFactory.createLineBorder(Color.black, 3));

        wagonAdd = new JButton("ƒобавить вагон");
        wagonAdd.setBounds(10, 20, 190, 180);
        wagonAdd.setFont(new Font(null, Font.BOLD, 10));
        wagonAdd.setIcon(new ImageIcon("images/96100.png"));
        wagonAdd.setVerticalTextPosition(JButton.BOTTOM);
        wagonAdd.setHorizontalTextPosition(JButton.CENTER);
        wagonAdd.setVerticalAlignment(JButton.TOP);
        wagonAdd.setBackground(Color.white);
        wagonAdd.setBorder(BorderFactory.createLineBorder(Color.black, 3));

        JButton clearing = new JButton("обработка");
        clearing.setBounds(410, 20, 190, 180);
        clearing.setFont(new Font(null, Font.BOLD, 10));
        clearing.setIcon(new ImageIcon("images/clearing.png"));
        clearing.setVerticalTextPosition(JButton.BOTTOM);
        clearing.setHorizontalTextPosition(JButton.CENTER);
        clearing.setVerticalAlignment(JButton.TOP);
        clearing.setBackground(Color.white);
        clearing.setBorder(BorderFactory.createLineBorder(Color.black, 3));

        this.add(wagonAdd);
        this.add(calculation);
        this.add(clearing);


        this.setVisible(true);

        wagonAdd.addActionListener(e ->{
            wagonAdd.setEnabled(false);
           wagonWindow.setVisible(true);
        });

        calculation.addActionListener(e ->{
            wagonWindow.wagonAver.nettoFuller();
            wagonWindow.wagonAver.operations();

            JOptionPane.showMessageDialog(null, "ќбщее Ќетто: " +  wagonWindow.wagonAver.getFullNetto() + "\n"
                    + "средн€€ влажность: " +  wagonWindow.wagonAver.getMeanHumidity() + "\n"
                    + "средн€€ натура: " +  wagonWindow.wagonAver.getMeanNature() + "\n"
                    + "средн€€ клейковина: " +  wagonWindow.wagonAver.getMeanGluten() + "\n"
                    + "средн€€ сорна€ примесь: " +  wagonWindow.wagonAver.getMeanWeedAdmixture() + "\n"
                    + "средн€€ зернова€ примесь: " +  wagonWindow.wagonAver.getMeanGrainAdmixture(), " —редние данные ", JOptionPane.INFORMATION_MESSAGE);
        });



        clearing.addActionListener(e ->{
            wagonWindow.wagonAver.clearAllStuff();
        });

    }


}
