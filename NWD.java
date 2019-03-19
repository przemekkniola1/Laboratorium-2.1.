public class Main {

    public static void main(String[] args) {
        Integer nwd = nwd(12, 18);
        System.out.println(nwd);
    }

    public static Integer nwd(Integer a, Integer b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}