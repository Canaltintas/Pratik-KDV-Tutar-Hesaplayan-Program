import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double tutar,kdv,kdvTutari,toplam;
        boolean miktar;


        kdv=18;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar Giriniz :");
        tutar = input.nextDouble();
        miktar = tutar >=1000;

        kdv = miktar ? 8:18;
        kdvTutari = (tutar*kdv)/100;
        toplam = tutar+kdvTutari;
        System.out.println("Kdv Oranı  :%" + kdv);
        System.out.println("Kdv Miktarı :" + kdvTutari);
        System.out.println("Toplam Tutar : " +toplam);


    }
}
