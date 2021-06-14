import java.util.Scanner;
import java.lang.Math;

public class Greengrocer {
    public static void main(String[] args) {
        float armut, elma, domates, muz, patlican;
        Scanner s = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut = s.nextFloat();

        System.out.print("Elma Kaç Kilo ? : ");
        elma = s.nextFloat();

        System.out.print("Domates Kaç Kilo ? : ");
        domates = s.nextFloat();

        System.out.print("Muz Kaç Kilo ? : ");
        muz = s.nextFloat();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = s.nextFloat();

        System.out.print("Toplam Tutar : " + (Math.round((armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.0) * 100.0) / 100.0));

    }
}
