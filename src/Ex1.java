import java.awt.*;

public class Ex1 {
    public static void main(String[] args) {
        int perimeter;

        Rectangle r=new Rectangle(1,2,3,4);
        System.out.println("perimeter="+(2*(r.getWidth()+r.getHeight())));
    }
}
