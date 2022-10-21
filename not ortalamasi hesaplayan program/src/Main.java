import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu girin: ");
        matematik = input.nextInt();

        System.out.println("fizik notunuzu girin: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu girin: ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu girin: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu girin: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu girin: ");
        muzik = input.nextInt();

        double sonuc = (matematik + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println("Ortalamanız: " + sonuc);

        boolean kosul = sonuc>=60;
        String durum = kosul ? "Sınıfı geçti" : "Sınıfta kaldın";
        System.out.println(durum);

    }
}