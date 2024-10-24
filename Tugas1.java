import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka kolom: ");
        int k = sc.nextInt();
        System.out.print("Masukkan angka baris: ");
        int b = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= b; j++) {

                if (i == 1 || i == k || j == 1 || j == b) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}