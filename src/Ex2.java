public class Ex2 {
    public static void main(String[] args) {

        String x="Mississippi";
        String y;
        String z;
       y=x.replaceAll("i","ii");
        System.out.println(y);
        System.out.println(y.length());
        z=y.replaceAll("ss","s");
        System.out.println(z);
        System.out.println(z.length());
    }
}
