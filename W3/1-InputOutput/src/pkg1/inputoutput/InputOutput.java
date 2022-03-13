package pkg1.inputoutput;
import java.util.Scanner;
/**
 *
 * @author Aini Diah Rahmawati
 */
public class InputOutput {
    public static void main(String[] args) {
        //deklarasi variabel
        String a;
        
        //membuat scanner
        Scanner scan = new Scanner(System.in);
        
        //menginputkan string
        a = scan.nextLine();
        
        //memisahkan string berdasarkan token
        String[] kata = a.split("[ !,?,_'0]");
        
        //menampilkan jumlah token dalam string
        System.out.println(kata.length);
        
        //menampilkan string yang telah dipisahkan token
        for(String text:kata){
            System.out.println(text);
        }   
    }   
}
