public class Buku01{
    
    String judul, pengarang;
    int halaman, stock, harga;
    void tampilanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stock);
        System.out.println("Harga: Rp " + harga);
    }
    void terjual(int jml) {
        if (stock > 0) {
            stock -= jml;
        } else {
            System.out.println("Stok habis. Tidak dapat melakukan penjualan.");
        }
    }
    
    void restock(int jml) {
        stock += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
        
}