
import java.util.Scanner;

/*
    Nama :Farel Jovander Afdillah
    Kelas :Tk1B
    Program:Persegi
 */

/**
 *
 * @author Kaizen_Farel
 */
public class PersegiPanjangaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //object ppl menggunakan constructor
        PersegiPanjang ppl = new PersegiPanjang();
        ppl.panjang=10;
        ppl.lebar=7;
        
        System.out.println("Akses method dalammain class");
        System.out.println("Luas persegi panjang = "+ppl.HitungLuas());
        System.out.println("Keliling = "+ppl.HitungKel());
        
        System.out.println();
        ppl.TampilanData();
        
        //obejcet pp2 menggunakan constructor 2
        PersegiPanjang pp2 = new PersegiPanjang(19,10);
        System.out.println("\nAkses method dalammain class");
        System.out.println("\nLuas persegi panjang = "+ppl.HitungLuas());
        System.out.println("\nKeliling = "+ppl.HitungKel());
        System.out.println();
        pp2.TampilanData();
        
        //object pp3 menggunakan constructor 2 dengan input
        System.out.println("\nobjek 3 menggunakan constructor");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang  =");
        int pjg = input.nextInt();
        System.out.print("Masukan lebar  =");
        int lbr = input.nextInt();
        PersegiPanjang pp3 = new PersegiPanjang(pjg,lbr);
        pp3.TampilanData();
    }
    
}
