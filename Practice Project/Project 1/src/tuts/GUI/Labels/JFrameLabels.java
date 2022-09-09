package tuts.GUI.Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
// import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

import tuts.GUI.JFrameCreate.MyFrame;

public class JFrameLabels {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        JLabel label = new JLabel();
        label.setText("This is a java label.");
        Border border = BorderFactory.createLineBorder(Color.white, 2);
        // ImageIcon image = new ImageIcon("path/to/file");
        // label.setIcon(image)

        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER,RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER,BOTTOm of image icon
        label.setIconTextGap(25);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, frame.getWidth(), 250);

        // FONT CONFIG
        label.setForeground(new Color(0xFF00FF));
        label.setFont(new Font("Jetbrains Mono", Font.PLAIN, 20));

        // BG CONFIG
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);

        frame.add(label);
        frame.setLayout(null);
    }
}
