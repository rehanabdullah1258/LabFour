
import javax.swing.*;
import java.awt.*;
public class Ex8 extends JComponent{
    public void paintComponent(Graphics g)
    {
        Rectangle w=new Rectangle(100,100,100,100);
        Graphics2D n=(Graphics2D) g;
        n.setColor(Color.blue);
        n.fill(w);
        n.setColor(Color.getColor("rehan",Color.red));
        n.drawString("rehan",150,150);
    }
}
