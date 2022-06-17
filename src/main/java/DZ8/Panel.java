package DZ8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    public Panel() {

        Font font = new Font("Arrial", Font.BOLD, 20);

        JButton myButton = new JButton("Sgenerirovat' nomera");
        myButton.setFont(font);
        add(myButton);

        TextField textField = new TextField("+7(999)0000000");
        textField.setFont(font);
        add(textField);


        myButton.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {
                                           textField.setText(generateTelephoneNumber());
                                           System.out.println(textField.getText());
                                       }
                                   }
        );


        setVisible(true);
    }

    public String generateTelephoneNumber() {
        Random random = new Random();
        String telephoneNumber = "";
        telephoneNumber += "+7";
        telephoneNumber += "(9";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += ")";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);

        return telephoneNumber;
    }
}
