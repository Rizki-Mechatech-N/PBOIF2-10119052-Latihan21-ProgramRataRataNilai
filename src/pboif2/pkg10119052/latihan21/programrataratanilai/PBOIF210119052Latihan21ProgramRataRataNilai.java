package pboif2.pkg10119052.latihan21.programrataratanilai;


/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Program rata-rata nilai mahasiswa menggunakan perulangan while
 * 
 */
import java.util.Scanner;
public class PBOIF210119052Latihan21ProgramRataRataNilai {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Masukkan Banyaknya Mahasiswa: ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah "+rata);
        System.out.println("Developed By : Rizki Dwi Nugraha");
    }
    
}
