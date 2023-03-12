import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvOrani1= 0.18;
        double kdvOrani2 =0.08;
        int kdvUstLimit = 1000;
        int kdvAltLimit =0;
        double urunTutari;
        System.out.println("Lütfen Ürün Tutarını Giriniz.");

        urunTutari = input.nextDouble();

        boolean kontrol =kdvAltLimit<=urunTutari&&urunTutari<=kdvUstLimit;
        
        System.out.println("KDV siz Tutar "+urunTutari);
        System.out.print("KDV Oranı ");
        System.out.println(kontrol==true? kdvOrani2:kdvOrani1);
        System.out.print("KDV'li Tutar ");
        System.out.println(kontrol==true? urunTutari*(1+kdvOrani2):urunTutari*(1+kdvOrani1));
        System.out.print("KDV Tutarı ");
        System.out.println(kontrol==true? urunTutari*(kdvOrani2):urunTutari*(kdvOrani1));
    }
}