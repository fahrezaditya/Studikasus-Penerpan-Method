
package penerapan.method.pkg3;

import java.util.Scanner;

public class Parkir {
    
    static void mobil(){
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("==================");
        System.out.println("Sewa parkir Rp 10000\nPPD 30%\nTotal Rp 13000");
        System.out.print("Bayar : ");
        int bayar =input.nextInt();
        if(bayar == 13000){
            System.out.println("Uang pas, Terimakasih");
        }else if(bayar >= 13000){
            long kembalian = bayar-13000;
            System.out.println("Uang kembalian Rp "+kembalian+",\nTerimakasih");
        }else{
            long kurang = 10400-bayar;
            System.out.println("Uang kurang Rp "+kurang+",\nTerimakasih");
        }
    }
    
    static void motor(){
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("==================");
        System.out.println("Sewa parkir Rp 5000,00\nPPD 20%\nTotal Rp 6000");
        System.out.print("Bayar : ");
        int bayar =input.nextInt();
        if(bayar == 6000){
            System.out.println("Uang pas, Terimakasih");
        }else if(bayar >= 6000){
            long kembalian = bayar-6000;
            System.out.println("Uang kembalian Rp "+kembalian+",\nTerimakasih");
        }else{
            long kurang = 10400-bayar;
            System.out.println("Uang kurang Rp "+kurang+",\nTerimakasih");
        }
    }
    
}
