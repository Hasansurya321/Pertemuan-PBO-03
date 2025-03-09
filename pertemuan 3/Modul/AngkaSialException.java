/*  Nama File   : AngkaSial.java
    Deskripsi   : Ekspsespasi buatan sendiri, menolak masukan angka 13
    Pembuat     : Hasan Suryadharma / 24060123140208
    Tanggal     : 08 - Maret - 2025
*/
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial !!!");
    }
}
