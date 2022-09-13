public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
    
    // buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin){
        this.nim = nim;
        this.nama =  nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    void printData() {
        System.out.println("NIM            : "+nim);
        System.out.println("Nama           : "+nama);
        System.out.println("alamat         : "+alamat);
        System.out.println("Jenis Kelamin  : "+jenisKelamin);
        
        
    }
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.printData();

    }
}