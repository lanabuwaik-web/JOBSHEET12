import java.util.Scanner;
public class Nilaimahasiswa02A {
     public static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];
        isianArray(nilaiMahasiswa);
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilaiMahasiswa[i]);
}
}

}
