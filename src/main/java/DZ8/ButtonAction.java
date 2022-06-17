 package DZ8;

import com.sun.source.util.SourcePositions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class ButtonAction implements ActionListener {

    private JButton button;

    public ButtonAction(JButton button) {
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("nazhata");
    }
}
