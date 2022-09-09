public class Ex3 {
    public static void main(String[] args) {
        String x="Mississippi";
        String y,z;
        y=x.replaceAll("i","!");
        z=y.replace('s','$');
        System.out.println("actual:"+z);
        System.out.println("expected result: M!$$!$$!pp!");
    }
}
