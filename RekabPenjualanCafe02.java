import java.util.Scanner;
public class RekabPenjualanCafe02 {
    static Scanner sc = new Scanner(System.in);

    static String[] menu;      
    static int[][] penjualan;   
    static void inputData() {
        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();
        menu = new String[jmlMenu];
        penjualan = new int[jmlMenu][jmlHari];
        System.out.println("\n-- Input Data Penjualan --");
        for (int i = 0; i < jmlMenu; i++) {

            sc.nextLine(); 
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
            for (int h = 0; h < jmlHari; h++) {
                System.out.print("  Penjualan " + menu[i] + " hari ke-" + (h+1) + ": ");
                penjualan[i][h] = sc.nextInt();
            }
        }
    }
    static void tampilData() {
        System.out.println("\n-- Tabel Penjualan --");
        System.out.printf("%-20s", "Menu");
        for (int h = 0; h < penjualan[0].length; h++) {
            System.out.printf("Hari %d ", h+1);
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int h = 0; h < penjualan[i].length; h++) {
                System.out.printf("%7d ", penjualan[i][h]);
            }
            System.out.println();
        }
    }
     static void tampilMenuTertinggi() {
        int maxTotal = -1;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < penjualan[i].length; h++) {
                total += penjualan[i][h];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        System.out.println("Menu: " + menuTertinggi);
        System.out.println("Total Penjualan: " + maxTotal);
    }
     static void tampilRataRata() {
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < penjualan[i].length; h++) {
                total += penjualan[i][h];
            }
            double rata = total / (double) penjualan[i].length;
            System.out.println(menu[i] + " : " + rata);
        }
    }
    public static void main(String[] args) {
        inputData();
        tampilData();
        tampilMenuTertinggi();
        tampilRataRata();
    }
}