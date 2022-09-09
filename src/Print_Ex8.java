import javax.swing.*;
public class Print_Ex8 {
    public static void main(String[] args) {
        JFrame f=new JFrame("my frame");
        f.setSize(500,500);
        f.setVisible(true);
        Ex8 s=new Ex8();
        f.add(s);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
