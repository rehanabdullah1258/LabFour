import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Ex9 extends JComponent {
    public void paintComponent(Graphics g) {
        Rectangle w=new Rectangle(60,60,70,160);
        Graphics2D n=(Graphics2D) g;
        n.setColor(Color.black);
        n.fill(w);
        Ellipse2D.Double reed=new Ellipse2D.Double(80,70,30,30);
        n.setColor(Color.red);
        n.fill(reed);
        Ellipse2D.Double yelloww=new Ellipse2D.Double(80,110,30,30);
        n.setColor(Color.yellow);
        n.fill(yelloww);
        Ellipse2D.Double greeen=new Ellipse2D.Double(80,150,30,30);
        n.setColor(Color.green);
        n.fill(greeen);
        Rectangle li=new Rectangle(90,200,10,160);
        n.setColor(Color.black);
        n.fill(li);



    }
}
