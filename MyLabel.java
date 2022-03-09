import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {

    MyLabel() {

        this.setText(" ");
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBorder(BorderFactory.createEtchedBorder(Color.LIGHT_GRAY,Color.DARK_GRAY));

    }

}
