/*  Nama File   : AngkaSial.java
    Deskripsi   : Program penggunaan exception buatan sendiri
    Pembuat     : Hasan Suryadharma / 24060123140208
    Tanggal     : 08 - Maret - 2025
*/
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial ");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            //as.cobaAngka(10);
            as.cobaAngka(13);
            //as.cobaAngka(12);
        }catch(AngkaSialException ase ){
            System.out.println(ase.getMessage());
            System.out.println("hati hati dalam memasukan angka !!");
        }
    }
}

//Pertanyaan 1 :Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//Jawaban : Tidak dieksekusi,alasanya adalah karena saat baris 12 dipanggil untuk di eksekusi,baris tersebut memenuhi kondisi if (angka == 13) , sehingga exception(AngkaSialException) dilempar dan eksekusi langsung berpindah ke blok catch. Dan selanjutnya Baris setelah throw new AngkaSialException(); tidak dieksekusi, termasuk pemanggilan cobaAngka(12)
//Pertanyaan 2 :Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jawaban : Ya akan dieksekusi, alasanya setelah exception ditangkap di blok catch, akan masuk pada perintah System.out.println("hati hati dalam memasukan angka !!") atau dengan kata lain tidak memenuhi kondisi if (angka == 13); maka dari itu  baris 21 tetap dieksekusi, karena berada dalam blok catch yang menangkap exception