import java.awt.*;
import javax.swing.*;

public class Print_Ex10 {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(400,400);
        JLabel label=new JLabel("Hello,Rehan!");
        label.setOpaque(true);
        Color negativ=new Color(56, 253, 0);
        label.setBackground(negativ);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
