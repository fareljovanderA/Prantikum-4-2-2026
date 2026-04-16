/*
    Nama :Farel Jovander Afdillah
    Kelas :Tk1B
    Program:Mahasiswa
 */

/**
 *
 * @author Kaizen_Farel
 */
public class Mahasiswa {
    String nama,nobp;
    double tugas,UTS,UAS;
    
    Mahasiswa(){
        
    }
    Mahasiswa(double tgs,double uts,double uas){
        tugas=tgs;
        UTS=uts;
        UAS=uas;
    }
    double NilaiAkhir(){
        return(0.25*tugas)+(0.35*UTS)+(0.4*UAS);
    }
    void TampilanData(){
     System.out.print("Nilai Akhit ="+NilaiAkhir());
    }
}
