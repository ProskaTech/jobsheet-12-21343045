//Created by 21343045_Farraz Hadyan

package Latihan1;

public class RodaDua extends Kendaraan {
    double NaikHargaKe = 0.20;//0.2
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.err.println("Setelah di modifikasi, harga sepeda menjadi Rp. "+hargaDasar);
    }
}
