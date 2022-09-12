import java.util.Scanner;

public class DataMahasiswa {
    
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner (System.in);
        
        System.out.println("=====DATA MAHASISWA=====");
        System.out.println(" ");
        
        //user memasukan input
        System.out.print("NIM           : ");
        int nim = inputUser.nextInt();

        System.out.print("Nama          : ");
        String nama = inputUser.next();

        System.out.print("Jenis Kelamin : ");
        String gender = inputUser.next();
        
        System.out.print("Alamat        : ");
        String alamat = inputUser.next();
        
        //menampilkan semua inputan user
        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.println("NIM Anda "+nim);
        System.out.println("Nama Anda adalah "+nama);
        System.out.println("Jenis kelamin Anda "+gender);
        System.out.println("Alamat Anda berada di "+alamat);
    }
}
    
