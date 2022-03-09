import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyButton extends JButton implements ActionListener {

    MyButton(String text) {

        this.setText(text);
        this.setFont(new Font("Helvetica",Font.ITALIC,15));
        this.addActionListener(this);
        this.setBackground(new Color(0xF310C6));
        this.setBorderPainted(false);
        this.setOpaque(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource().equals(MyUI.newKey)) {
            EncryptionProgram.newKey();
        }
        else if (e.getSource()==MyUI.getKey) {
            EncryptionProgram.setKey();
        }
        else if (e.getSource()==MyUI.encrypt) {
            EncryptionProgram.encrypt();
        }
        else if (e.getSource()==MyUI.decrypt) {
            EncryptionProgram.decrypt();
        }
    }
}
