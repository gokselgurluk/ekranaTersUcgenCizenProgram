import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.print("Yıldız Satır Sayısını Giriniz :");
        int n = star.nextInt();

        for (int i =n; i>=1; i--) {

            for (int k = (2 * i - 1); k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
