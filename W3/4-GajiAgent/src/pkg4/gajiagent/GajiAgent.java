package pkg4.gajiagent;
import java.util.Scanner;
/* @author Aini Diah Rahmawati */
public class GajiAgent {
    public static void main(String[] args) {
        //membuat scanner
        Scanner scan = new Scanner(System.in);
        
        // deklarasi variabel 
        int totaljual, totalPenjualan, gajiPokok = 500000, hargaitem = 50000, bonus, totalgaji;
        
        // input totalPenjualan
        totaljual = scan.nextInt();
        
        if(totaljual >= 40){
            totalPenjualan = hargaitem * totaljual;
            bonus = (int) (totalPenjualan * 0.25);
            totalgaji = gajiPokok + bonus; 
            System.out.println("" +totalgaji);
        } else if(totaljual >80){
            totalPenjualan = hargaitem * totaljual;
            bonus = (int) (totalPenjualan * 0.35);
            totalgaji = gajiPokok + bonus; 
            System.out.println("" +totalgaji);
        } else if(totaljual <15){
            totalPenjualan = hargaitem * totaljual;
            int denda = (int) (((15-totaljual)*hargaitem)*0.15);
            gajiPokok = (int) (gajiPokok - denda);
            totalgaji = gajiPokok;
            System.out.println("" +totalgaji);
        } else if(totaljual < 40 && totaljual >=15){
            totalPenjualan = hargaitem * totaljual;
            bonus = (int) (totalPenjualan * 0.1);
            totalgaji = (int) (gajiPokok + bonus); 
            System.out.println("" +totalgaji);
        } 
    }   
}
