package tuts.GUI.JFrameCreate;

import java.awt.Color;
// import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    public MyFrame() {

        /* Configure windows */
        this.setTitle("myJFrame"); // title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default closing
        this.setVisible(true); // visibility
        this.setSize(500, 500); // size
        this.setResizable(false); // prevent resizing

        /* Window background and display */
        this.getContentPane().setBackground(new Color(255, 255, 255));

        /* Change logo of the app */
        // ImageIcon icon = new ImageIcon("path/to/file");
        // this.setIconImage(icon.getImage());
    }
}
