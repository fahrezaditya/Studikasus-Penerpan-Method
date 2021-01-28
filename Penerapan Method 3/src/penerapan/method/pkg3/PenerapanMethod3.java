
package penerapan.method.pkg3;

import java.util.Scanner;

public class PenerapanMethod3 {

    public static void main(String[] args) {
        // TODO code application logic here
        pembuka();
    }
    
    static void pembuka(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("== BAYAR PARKIR ==");
        System.out.println("__________________");
        System.out.print("1. Mobil\n2. Motor\n=> ");
        int jenis = input.nextInt();
        if (jenis == 1){
            Parkir.mobil();
        }else{
            Parkir.motor();
        }
    }
}
