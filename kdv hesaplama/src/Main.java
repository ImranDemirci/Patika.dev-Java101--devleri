import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        boolean kosul = tutar>1000;
        double kdvOran = kosul ? 0.08 : 0.18;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDVsiz tutar :" + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDVli tutar : " + kdvliTutar);
    }
}