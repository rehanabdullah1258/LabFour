import javax.swing.*;
public class Print_Ex9 {
    public static void main(String[] args) {
        JFrame f=new JFrame("My frame");
        f.setSize(500,500);
        f.setVisible(true);
        Ex9 s=new Ex9();
        f.add(s);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
