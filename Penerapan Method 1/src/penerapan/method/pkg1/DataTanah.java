package penerapan.method.pkg1;

import java.util.Scanner;

public class DataTanah {
    String pembuka = "=== SELAMAT DATANG ===\n= DI PENDATAAN TANAH =";
    String nama, alamat;
    double luas;
    
    String awal(){
        return pembuka;
    }
    
    void isi(){
    
        Scanner input=new Scanner(System.in);
        
        System.out.println();
        System.out.print("Masukkan Nama Pemilik\n=> ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat\n=> ");
        alamat = input.nextLine();
        System.out.print("Masukkan Luas Tananh (satuan hektar)\n=> ");
        luas = input.nextDouble();
    }
    
    void tampilan(){
        
        System.out.println();
        System.out.println(nama+" pada "+alamat+"\nmemiliki tanah dengan luas "+luas+" hektar");
        System.out.println();
        System.out.println("Nama\t  : "+nama);
        System.out.println("Alamat\t  : "+alamat);
        System.out.println("Luas tnah : "+luas+" hektar");
    }
    
}
