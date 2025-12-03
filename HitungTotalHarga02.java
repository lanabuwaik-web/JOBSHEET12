import java.util.Scanner;
public class HitungTotalHarga02 {
 public static boolean sama(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static int hitungTotalHarga(int pilihan, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihan - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0; 
        String lanjut = "Y";

        while (sama(lanjut, "Y")) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan banyak item yang diinginkan: ");
            int banyakItem = sc.nextInt();
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            System.out.println("Total harga menu ini: Rp. " + totalHarga);
            totalKeseluruhan += totalHarga; 
            System.out.print("Apakah ingin memesan menu lain? (Y/T): ");
            sc.nextLine();  
            lanjut = sc.nextLine();
        }
        System.out.println("Total keseluruhan pesanan anda: Rp. " + totalKeseluruhan);
    }
}


