/*  Nama File   : Asersi1.java
    Deskripsi   : Program untuk menunjukan asersi
    Pembuat     : Hasan Suryadharma / 24060123140208
    Tanggal     : 08 - Maret - 2025
*/
public class Asersi1 {
    public static void main(String[] args) {
        int x= 0;
        if (x>0){
            System.out.println("bilangan posisitf");
        }else{
            assert (x<0):"ada kesalahan kode";
            System.out.println("bilangan negatif");
        }
    }
}
