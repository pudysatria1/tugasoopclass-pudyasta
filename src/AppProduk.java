public class AppProduk
{
    public static void main( String[] args )
    {

        Produk[] produks = {
                new Produk("Beng beng", "Indofood",1000, 2),
                new Produk("Kenangan Mantan", "Kopi Kenangan",20000, 50),
                new Produk("Biskuit", "Monde",55000, 20),
                new Produk("Kurma", "Indofood",105000, 500)
        };
        long total = 0;
        for (Produk produk:produks) {
            System.out.println(produk.getNama());
            total+=produk.getHarga();
        }
        System.out.println("Total harga : "+total);
    }
}
