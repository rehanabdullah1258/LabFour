import javax.swing.*;
import java.awt.*;
public class Ex7 extends JComponent {
    public void paintComponent(Graphics g)
    {
        Rectangle w=new Rectangle(50,50,100,100);
       Graphics2D n=(Graphics2D) g;
        n.setColor(Color.pink);
        n.fill(w);
        Rectangle v=new Rectangle(160,50,100,100);
        Graphics2D m=(Graphics2D) g;
        Color negativ=new Color(226, 0, 253);
        m.setColor(negativ);
        m.fill(v);







    }
}
