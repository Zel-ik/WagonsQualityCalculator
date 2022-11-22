package Windows;

import Wagon.Wagon;
import Wagon.WagonAverageQualitiesCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class AddWagonWindow extends JFrame {
    List<Wagon> wagonsList = new ArrayList<>();
    WagonAverageQualitiesCalculator wagonAver = new WagonAverageQualitiesCalculator();

    JTextField netto;
    JTextField humidity;
    JTextField nature;
    JTextField gluten;
    JTextField weedAdmixture;
    JTextField grainAdmixture;

    public AddWagonWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("¬вод данных одного вагона");
        this.setSize(400, 400);
        this.setLayout(new GridLayout(7, 2, 5, 5));
        this.setResizable(false);
        this.setLocation(450,350);
        ImageIcon titleIcon = new ImageIcon("images/wagon.png");
        this.setIconImage(titleIcon.getImage());
        this.getContentPane().setBackground(Color.white);

        netto = new JTextField("0");
        netto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        netto.setHorizontalAlignment(SwingConstants.RIGHT);

        humidity = new JTextField("0.0");
        humidity.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        humidity.setHorizontalAlignment(SwingConstants.RIGHT);

        nature = new JTextField("0.0");
        nature.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        nature.setHorizontalAlignment(SwingConstants.RIGHT);

        gluten = new JTextField("0.0");
        gluten.setHorizontalAlignment(SwingConstants.RIGHT);
        gluten.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        weedAdmixture = new JTextField("0.0");
        weedAdmixture.setHorizontalAlignment(SwingConstants.RIGHT);
        weedAdmixture.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        grainAdmixture = new JTextField("0.0");
        grainAdmixture.setHorizontalAlignment(SwingConstants.RIGHT);
        grainAdmixture.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        JLabel nettoLabel = new JLabel("¬ведите нетто вагона");
        nettoLabel.setFont(new Font(null, Font.PLAIN, 15));
        nettoLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.add(nettoLabel);
        this.add(netto);

        JLabel humidityLabel = new JLabel("¬ведите влажность");
        humidityLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        humidityLabel.setFont(new Font(null, Font.PLAIN, 15));
        this.add(humidityLabel);
        this.add(humidity);

        JLabel natureLabel = new JLabel("¬ведите натуру");
        natureLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        natureLabel.setFont(new Font(null, Font.PLAIN, 15));
        this.add(natureLabel);
        this.add(nature);

        JLabel glutenLabel = new JLabel("¬ведите клейковину");
        glutenLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        glutenLabel.setFont(new Font(null, Font.PLAIN, 15));
        this.add(glutenLabel);
        this.add(gluten);

        JLabel weedAdmixtureLabel = new JLabel("¬ведите сорную примесь");
        weedAdmixtureLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        weedAdmixtureLabel.setFont(new Font(null, Font.PLAIN, 15));
        this.add(weedAdmixtureLabel);
        this.add(weedAdmixture);

        JLabel grainAdmixtureLabel = new JLabel("¬ведите сорную примесь");
        grainAdmixtureLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        grainAdmixtureLabel.setFont(new Font(null, Font.PLAIN, 15));
        this.add(grainAdmixtureLabel);
        this.add(grainAdmixture);

        JButton adding = new JButton("ƒобавить данные");
        this.add(adding);

        JButton cancel = new JButton("отмена");
        this.add(cancel);

        adding.addActionListener(e ->{
            int wagonsNum = wagonsList.size();
            try {
                wagonsList.add(new Wagon(
                        Integer.parseInt(netto.getText()),
                        Double.parseDouble(humidity.getText()),
                        Double.parseDouble(nature.getText()),
                        Double.parseDouble(gluten.getText()),
                        Double.parseDouble(weedAdmixture.getText()),
                        Double.parseDouble(grainAdmixture.getText())
                ));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "¬ведена не цифра");
            }
            if(wagonsList.size() != wagonsNum) {
                JOptionPane.showMessageDialog(null, "¬агон был добавлен");
            }
            wagonAver.setWagons(wagonsList);
            MyMainFrame.wagonAdd.setEnabled(true);
            this.dispose();
        });

        cancel.addActionListener(e ->{
            this.dispose();
        });

        this.setVisible(true);


    }
}
