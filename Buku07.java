class Buku07 {
    String judul, pengarang; 

    public Buku07(String jud, String pg, int hal, int stok, int har){ 
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok:" + stok);
        System.out.println("Harga:" + harga);
    }

    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku telah terjual.");
        } else {
            System.out.println("Stok habis. Tidak dapat melakukan penjualan.");
        }
    }    

    void restock( int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal(){
        int hargaTotal = harga * stok;
        System.out.println("Harga Total : " + hargaTotal);
        return hargaTotal;
    }

    int hitungDiskon(int hargaTotal){
        int diskon = 0;
        if(hargaTotal > 150000){
            diskon = 12;
            System.out.println("Anda mendapatkan diskon sebesar "+ diskon + "%");
        } else if(hargaTotal >= 75000 ){
            diskon = 5;
            System.out.println("Anda mendapatkan diskon sebesar "+ diskon + "%");
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
        }
        return diskon;
    }

    void hitungHargaBayar(int hargaTotal, int diskon){
        int hitungBayar = 0, potongan = 0;
        if(diskon > 0){
            potongan = hargaTotal * diskon / 100;
            hitungBayar = hargaTotal - potongan;
        } else {
            hitungBayar = hargaTotal;
        }
        System.out.println("Total yang harus Anda bayar: " + hitungBayar);
    }
}