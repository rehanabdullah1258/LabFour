import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        Random generator = new Random();
        int x = 1 + generator.nextInt(6);
        System.out.println(x);
    }
}
