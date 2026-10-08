import java.util.Scanner;
public class StudiKasus125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int harga_cup = 18000;
        int jumlah_cup;
        int uang_bayar;
        int total_harga;
        int diskon;
        int total_bayar;
        int kembalian;
        int kurang;
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlah_cup = input.nextInt();
        total_harga = harga_cup * jumlah_cup;
        System.out.println("Total harga: " + total_harga);
        if (total_harga >= 100000) {
            diskon = total_harga * 20 / 100;
        } else {
            diskon = 0;
        }
        
        total_bayar = total_harga - diskon;
        System.out.print("Masukkan uang yang dibayar: ");
        uang_bayar = input.nextInt();
        if (uang_bayar >= total_bayar) {
            kembalian = uang_bayar - total_bayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = total_bayar - uang_bayar;
            System.out.println("Uang yang dibayar kurang: " + kurang);
      
        }
    }
}