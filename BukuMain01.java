public class BukuMain01 {
    public static void main(String[] args){

        Buku01 bk1 = new Buku01();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;

        bk1.tampilanInformasi();  
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilanInformasi();

        Buku01 bk2 = new Buku01("Self Reward", "Maheera Ayesha",  160, 29, 59000);
        bk2.terjual(11);
        bk2. tampilanInformasi();
        Buku01 bukuPunyaBima = new Buku01("Cara cepat rungkad", "franklynbimaa", 100, 25, 10000);
        bukuPunyaBima. tampilanInformasi();
    }
}   