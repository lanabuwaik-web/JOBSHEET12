import java.util.Scanner;
public class PengunjungCafe02 {
    
        static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar Pengunjung :");
        for(int i = 0; i < namaPengunjung.length; i++){
            System.out.println("- " + namaPengunjung[i]);
        }
        daftarPengunjung("ali","budi","citra");
        daftarPengunjung("andi");
        daftarPengunjung("doni","eti","fahmi","galih");
    
    }
    
}
