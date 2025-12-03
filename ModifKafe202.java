import java.util.Scanner;
public class ModifKafe202 {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Kafe15!");
        menu();
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam     - Rp 15.000");
        System.out.println("2. Cappuccino     - Rp 20.000");
        System.out.println("3. Latte          - Rp 25.000");
        System.out.println("4. Teh Tarik      - Rp 12.000");
        System.out.println("5. Roti Bakar     - Rp 10.000");
        System.out.println("6. Mie Goreng     - Rp 18.000");
        System.out.print("Silakan pilih menu yang Anda inginkan (1-6): ");
        
        int pilihan = sc.nextInt();
        int harga = 0;
        String namaMenu = "";

        switch (pilihan) {
            case 1 -> { namaMenu = "Kopi Hitam"; harga = 15000; }
            case 2 -> { namaMenu = "Cappuccino"; harga = 20000; }
            case 3 -> { namaMenu = "Latte"; harga = 25000; }
            case 4 -> { namaMenu = "Teh Tarik"; harga = 12000; }
            case 5 -> { namaMenu = "Roti Bakar"; harga = 10000; }
            case 6 -> { namaMenu = "Mie Goreng"; harga = 18000; }
            default -> {
                System.out.println("Pilihan tidak valid!");
                return;
            }
        }

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int total = harga * jumlah;
        double diskon = 0;

        if (kodePromo == "DISKON50") {
            diskon = total * 0.50;
        } else if (kodePromo == "DISKON30") {
            diskon = total * 0.30;
        } else if (kodePromo.length() != 0) {
            System.out.println("Kode promo invalid!");
        }

        double totalBayar = total - diskon;

        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Menu   : " + namaMenu);
        System.out.println("Harga  : Rp " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : Rp " + total);
        System.out.println("Diskon : Rp " + diskon);
        System.out.println("Bayar  : Rp " + totalBayar);
    }
}
