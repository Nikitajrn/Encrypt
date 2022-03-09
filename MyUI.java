import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyUI {

    ImageIcon img = new ImageIcon("data-encryption.png");
    static MyButton newKey = new MyButton("New Key");
    static MyButton getKey = new MyButton("Set Key");
    static MyButton encrypt = new MyButton("(E)ncrypt");
    static MyButton decrypt = new MyButton("(D)ecrypt");

    static MyFrame frame = new MyFrame();

    static MyLabel textLabel = new MyLabel();

    static JTextField keyField = new JTextField();
    static JTextField messageField = new JTextField();

    MyUI() {

        newKey.setBounds(205,485,140,50);
        getKey.setBounds(365,485,140,50);
        encrypt.setBounds(205,815,140,50);
        decrypt.setBounds(365,815,140,50);

        keyField.setBounds(100,425,500,50);
        keyField.setBorder(BorderFactory.createBevelBorder(1,Color.LIGHT_GRAY, Color.DARK_GRAY));
        messageField.setBounds(100,700,500,100);
        messageField.setBorder(BorderFactory.createBevelBorder(1,Color.LIGHT_GRAY, Color.DARK_GRAY));

        textLabel.setBounds(100,150,500,100);
        textLabel.setText("Le!`s 3nkr1pt s#meth1ng");
        textLabel.setBackground(Color.YELLOW);
        textLabel.setOpaque(true);
        textLabel.setFont(new Font("Helvetica",Font.ITALIC,25));

        frame.add(newKey);
        frame.add(getKey);
        frame.add(encrypt);
        frame.add(decrypt);
        frame.add(textLabel);
        frame.add(keyField);
        frame.add(messageField);
        frame.setIconImage(img.getImage());
        frame.setVisible(true);
    }
}
































