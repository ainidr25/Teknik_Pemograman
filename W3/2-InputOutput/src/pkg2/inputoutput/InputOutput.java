package pkg2.inputoutput;
import java.util.Scanner;
/* @author Aini Diah Rahmawati */
class BahasaPemograman{
    String nama;
    int nomor;    
    void Output(String nama, int nomor){
        this.nama = nama;
        this.nomor = nomor;
        System.out.println(String.format("%s\t\t%03d", this.nama, this.nomor));
    }
}
public class InputOutput {
    public static void main(String[] args) {
       BahasaPemograman input1 = new BahasaPemograman();
       BahasaPemograman input2 = new BahasaPemograman();
       BahasaPemograman input3 = new BahasaPemograman();
       
       // membuat scanner 
       Scanner input = new Scanner(System.in);
       
       // inputan pertama
       input1.nama = input.next();
       input1.nomor = input.nextInt();
       
       // inputan kedua
       input2.nama = input.next();
       input2.nomor = input.nextInt();
       
       // inputan ketiga
       input3.nama = input.next();
       input3.nomor = input.nextInt(); 

       // menampilkan output
        System.out.println("====================");
        input1.Output(input1.nama, input1.nomor);
        input2.Output(input2.nama, input2.nomor);
        input3.Output(input3.nama, input3.nomor);
        System.out.println("====================");
    }  
}
