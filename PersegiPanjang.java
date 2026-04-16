/*
    Nama :Farel Jovander Afdillah
    Kelas :Tk1B
    Program:Persegi
 */

/**
 *
 * @author Kaizen_Farel
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    //consstructo kosong
    PersegiPanjang(){
        
    }
    
    //
    PersegiPanjang(int p,int l){
        panjang=p;
        lebar=l;
    }
    
    //
    int HitungLuas(){
        return(panjang*lebar);
    }
    
    int HitungKel(){
        return(2*(panjang+lebar));
    }
    
    void TampilanData(){
        System.out.print("Masukan Panjang Persegi = "+panjang);
        System.out.print("Masukan Lebar Persegi  ="+lebar);
        System.out.print("Luas Persegi Panjang = "+HitungLuas());
        System.out.print("Kelling Persegi Panjang"+HitungKel());
    }
}
