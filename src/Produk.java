public class Produk {
    private  String nama;
    private String merk;
    private long harga;
    private int berat;

    public Produk(String nama, String merk, long harga, int berat) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
        this.berat = berat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }


}
