import java.util.ArrayList

data class Meja(
    val panjang: Int,
    val lebar: Int,
    val tinggi: Int,
    val kapasitas: Int
)

data class Kursi(
    val panjang: Int,
    val lebar: Int,
    val tinggi: Int,
    val tipe: String
)

class Ruang(
    val namaRuang: String,
    val panjang: Int,
    val lebar: Int,
    val tinggi: Int,
    val viewer: Int,
    val ac: Int
) {
    val daftarMeja: ArrayList<Meja> = ArrayList()
    val daftarKursi: ArrayList<Kursi> = ArrayList()

    fun tambahMeja(meja: Meja) {
        daftarMeja.add(meja)
    }

    fun tambahKursi(kursi: Kursi) {
        daftarKursi.add(kursi)
    }

    fun tampilkanDetailRuang() {
        println("=== Detail Ruang: $namaRuang ===")
        println("Ukuran (P x L x T): ${panjang} x ${lebar} x ${tinggi} cm")
        println("Jumlah Viewer: $viewer")
        println("Jumlah AC: $ac")
        println("-------------------------------------")
    }

    fun tampilkanDaftarMeja() {
        println("Daftar Meja (${daftarMeja.size} unit):")
        if (daftarMeja.isEmpty()) {
            println("  - Tidak ada meja.")
        } else {
            daftarMeja.forEachIndexed { index, meja ->
                println("  ${index + 1}. Meja - Kapasitas: ${meja.kapasitas} orang")
            }
        }
    }

    fun tampilkanDaftarKursi() {
        println("Daftar Kursi (${daftarKursi.size} unit):")
        if (daftarKursi.isEmpty()) {
            println("  - Tidak ada kursi.")
        } else {
            daftarKursi.forEachIndexed { index, kursi ->
                println("  ${index + 1}. Kursi - Tipe: ${kursi.tipe}")
            }
        }
        println("=====================================\n")
    }
}