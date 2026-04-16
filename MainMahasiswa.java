/*
    Nama :Farel Jovander Afdillah
    Kelas :Tk1B
    Program:Mahasiswa
 */

/**
 *
 * @author Kaizen_Farel
 */
import java.util.Scanner;
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa pp1 = new Mahasiswa();
        pp1.nama = "Farel Jovander Afdillah";
        pp1.nobp = "2501083017";
        System.out.println("Nama ="+pp1.nama);
        System.out.println("NoBP ="+pp1.nobp);
        
        Scanner input = new Scanner(System.in);
        double tugas, UAS, UTS;
        System.out.print("Masukan Nilai Tugas =");
        tugas = input.nextInt();
        System.out.print("Masukan Nilai UTS =");
        UTS = input.nextInt();
        System.out.print("Masukan Nilai UAS =");
        UAS = input.nextInt();
        Mahasiswa pp2 = new Mahasiswa(tugas,UAS,UTS);
        pp2.TampilanData();
    }
    
}
