/*  Nama File   : Asersi2.java
    Deskripsi   : Program untuk demo asersi, yang akan menolak input
    Pembuat     : Hasan Suryadharma / 24060123140208
    Tanggal     : 08 - Maret - 2025
*/
//class lingkaran 
class Lingkaran{
    private double jariJari;
    public Lingkaran (double  jariJari){
        this.jariJari = jariJari;
    }public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
}

//pertanyaan : secara konsep, ada yang kurang tepa pada proggram Asersi 2 di atas 
//jawaban : assertanya lebih baik di buat di class lingkaran di atas karena lebih baik jika exceptionnya di lakukan sebelum membuat lingkaran