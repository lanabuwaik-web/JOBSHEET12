import java.util.Scanner;
public class RekapPenjualanCafe02 {

    static Scanner sc = new Scanner(System.in);
    static String[] menu = {
        "Kopi", 
        "Teh", 
        "Es Kelapa Muda", 
        "Roti Bakar", 
        "Gorengan"
    };
    static int[][] data = new int[5][7];
    static void inputData() {
        System.out.println("=== Input Data Penjualan 7 Hari ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int h = 0; h < 7; h++) {
                System.out.print("  Hari ke-" + (h + 1) + ": ");
                data[i][h] = sc.nextInt();
            }
        }
    }
    static void tampilkanTabel() {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t"); 

            for (int h = 0; h < 7; h++) {
                System.out.print(data[i][h] + "\t");
            }
            System.out.println();
        }
    }
    static void menuTertinggi() {
        int maxTotal = 0;
        int indexMax = 0;
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < 7; h++) {
                total += data[i][h];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu : " + menu[indexMax]);
        System.out.println("Total: " + maxTotal);
    }
    static void rataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < 7; h++) {
                total += data[i][h];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + " : " + rata);
        }
    }
    public static void main(String[] args) {
        inputData();
        tampilkanTabel();
        menuTertinggi();
        rataRata();
    }
}