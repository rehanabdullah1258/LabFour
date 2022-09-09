import java.awt.*;

public class Ex4 {
    public static void main(String[] args) {

        Rectangle box=new Rectangle(0,0,20,30);
        box.add(5,10);
        System.out.println(box.getX());
        System.out.println(box.getY());
        System.out.println(box.getWidth());
        System.out.println(box.getHeight());
    }
}
