class BukuMain07 {
    
    public static void main(String[] args) {
        Buku07 bk1 = new Buku07("Pemrograman Java", "Dewi Sulistiyowati", 225, 13, 100000);
        
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku07 bk2 = new Buku07("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

      
        Buku07 Bukudewi = new Buku07("Mencintai", "Dewi Sulistiyowati", 90, 50, 15000);
        Bukudewi.tampilInformasi();
        int terjual = 15;
        int hargaTotal = Bukudewi.hitungHargaTotal();
        int diskon = Bukudewi.hitungDiskon(hargaTotal);
        Bukudewi.hitungHargaBayar(hargaTotal, diskon);
    }
}