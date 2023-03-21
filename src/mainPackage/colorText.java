package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class colorText extends JLabel implements ActionListener{
    
    String important;

    public colorText(String important){
        this.important = important;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        g2d.setFont(new Font("Times New Roman", Font.BOLD, 90));
        g2d.setColor(Color.YELLOW);

        g2d.drawString(this.important, 0, 0);
        g2d.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
