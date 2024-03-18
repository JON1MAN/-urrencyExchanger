package Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Currencies{
    USD, //(United States Dollar"),
    EUR, //(Euro"),
    JPY, //(Japanese Yen"),
    GBP, //(British Pound Sterling"),
    AUD, //(Australian Dollar"),
    CAD, //("Canadian Dollar"),
    CHF, //("Swiss Franc"),
    CNY, //("Chinese Yuan"),
    SEK, //("Swedish Krona"),
    NZD, //("New Zealand Dollar"),
    KRW, //("South Korean Won"),
    HKD, //("Hong Kong Dollar"),
    NOK, //("Norwegian Krone"),
    MXN, //("Mexican Peso"),
    SGD, //("Singapore Dollar");
}
public class GUI extends JFrame {
    //array of Strings that consists of currencies
    private final String[] currencyAbbreviations = {
            "USD",
            "EUR",
            "JPY",
            "GBP",
            "AUD",
            "CAD",
            "CHF",
            "CNY",
            "SEK",
            "NZD",
            "KRW",
            "HKD",
            "NOK",
            "MXN",
            "SGD"
    };
    public GUI() {

        ImageIcon bankLogo = new ImageIcon("src/images/wolfOfWallStreet.jpg");
        JLabel wolfOfWallStreet = new JLabel();
        wolfOfWallStreet.setIcon(bankLogo);
        wolfOfWallStreet.setBounds(77,50,247,300);

        JComboBox fromComboBox = new JComboBox(currencyAbbreviations);
        fromComboBox.setBounds(77, 370, 65, 20);
        fromComboBox.setSelectedIndex(0);

        JComboBox toComboBox = new JComboBox(currencyAbbreviations);
        toComboBox.setBounds(258, 370, 65, 20);
        toComboBox.setSelectedIndex(1);

        JTextField fromAmountTextField = new JTextField();
        fromAmountTextField.setBounds(60, 400, 100, 20);

        JTextField resultAmountTextField = new JTextField();
        resultAmountTextField.setBounds(241, 400, 100, 20);

        ImageIcon aprEqLogo = new ImageIcon("src/images/approximatelyEquals.jpg");
        JLabel aproxEqLabel = new JLabel();
        aproxEqLabel.setIcon(aprEqLogo);
        aproxEqLabel.setBounds(191,400,20,20);

        JButton convertButton = new JButton();
        convertButton.setIcon(aprEqLogo);
        convertButton.setBounds(191,400,20,20);
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    resultAmountTextField.setText(Exchanger.getConvert(
                            currencyAbbreviations[fromComboBox.getSelectedIndex()],
                            currencyAbbreviations[toComboBox.getSelectedIndex()],
                            fromAmountTextField.getText() ));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        frame.add(wolfOfWallStreet);
        frame.add(fromComboBox);
        frame.add(toComboBox);
        frame.add(fromAmountTextField);
        frame.add(resultAmountTextField);
        frame.add(aproxEqLabel);
        frame.add(convertButton);

        frame.setVisible(true);


    }

}
