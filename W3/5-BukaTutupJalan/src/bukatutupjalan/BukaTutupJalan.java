package bukatutupjalan;
import java.util.Arrays;
import java.util.Scanner;
/* @author Aini Diah Rahmawati */
public class BukaTutupJalan {
    public static void main(String[] args) {
        // deklarasi variabel
        int[] plat = new int[4];
        String str;
        long platGabungan;
        
        // membuat scanner baru
        Scanner scan = new Scanner(System.in);
        
        // user menginput
        for(int i = 0; i < plat.length; i++){
            plat[i] = scan.nextInt();
        }
        // convert array to string
        str = Arrays.toString(plat).replaceAll("\\[|\\]|,|\\s", "");
        
        // convert string to long
        platGabungan = Long.parseLong(str);
        
        // mengecek kondisi
        if((platGabungan - 999999) % 5 == 0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
    }  
}
