package src.basics_03;

public class Lab023 {
    public static void main(String[] args) {
        // OR ||
        // t || t > t
        // t || f > t
        // f || t > t
        // f || f > f

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // AND &&
        // T && T > T
        // T && F > F
        // F && T > F
        // F && F > F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
