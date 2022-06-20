import java.util.Scanner;
// Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int k, total =0, ks, sonuc=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Deger Giriniz :");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total = total + i;
                ks = k / 12;
                sonuc = total / ks;
            }
        }
        System.out.println("Sonuc :" + sonuc);
    }
}