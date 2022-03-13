package pkg3.berhitung;
import java.util.Scanner;
/* @author Aini Diah Rahmawati */
public class Berhitung {
    public static void main(String[] args) {
        // deklarasi variabel
        int angka1, angka2;
        char operator;
        
        //membuat scanner
        Scanner scan = new Scanner(System.in);
        
        //menginputkan string
        angka1 = scan.nextInt();
        operator = scan.next().charAt(0);
        angka2 = scan.nextInt();
        
        // ALGORITMA
        if(angka1 >= 1 && angka1<=1000){
            if(angka2 >= 1 && angka1<=1000){
                if(operator == '+'){
                   int tambah = angka1 + angka2;
                    System.out.println(String.format("%d %c %d = %d", angka1, operator, angka2, tambah));
                } else if(operator == '-'){
                    int kurang = angka1 - angka2;
                    System.out.println(String.format("%d %c %d = %d", angka1, operator, angka2, kurang));
                } else if(operator == '*'){
                    int kali = angka1 * angka2;
                    System.out.println(String.format("%d %c %d = %d", angka1, operator, angka2, kali));
                } else if(operator == '/'){
                    int bagi = angka1 / angka2;
                    System.out.println(String.format("%d %c %d = %d", angka1, operator, angka2, bagi));
                } else if(operator == '%'){
                    int mod = angka1 % angka2;
                    System.out.println(String.format("%d %c %d = %d", angka1, operator, angka2, mod));
            }
        }
    }
  }
}
