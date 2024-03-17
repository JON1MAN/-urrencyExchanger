package Application;

import javax.swing.*;

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

        JComboBox fromComboBox = new JComboBox(Currencies.values());
        fromComboBox.setBounds(77, 370, 65, 20);
        fromComboBox.setSelectedIndex(0);

        JComboBox toComboBox = new JComboBox(currencyAbbreviations);
        toComboBox.setBounds(258, 370, 65, 20);
        toComboBox.setSelectedIndex(1);

        JTextField fromAmount = new JTextField();
        fromAmount.setBounds(60, 400, 100, 20);

        JTextField resultAmount = new JTextField();
        resultAmount.setBounds(241, 400, 100, 20);

        ImageIcon aprEqLogo = new ImageIcon("src/images/approximatelyEquals.jpg");
        JLabel aproxEq = new JLabel();
        aproxEq.setIcon(aprEqLogo);
        aproxEq.setBounds(191,400,20,20);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        frame.add(wolfOfWallStreet);
        frame.add(fromComboBox);
        frame.add(toComboBox);
        frame.add(fromAmount);
        frame.add(resultAmount);
        frame.add(aproxEq);

        frame.setVisible(true);


    }

}
