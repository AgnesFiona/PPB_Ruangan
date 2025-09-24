fun main(args Array<String>) { // Mendefinisikan satu objek Ruang secara langsung
    val ruangKelas = Ruang(
        namaRuang = "Ruang Kelas 101",
        panjang = 800,
        lebar = 600,
        tinggi = 300,
        viewer = 1,
        ac = 2
    )

    // Menambahkan Meja dan Kursi ke dalam objek Ruang
    val mejaSiswa = Meja(panjang = 100, lebar = 50, tinggi = 75, kapasitas = 2)
    val kursiSiswa = Kursi(panjang = 40, lebar = 40, tinggi = 90, tipe = "siswa")

    repeat(20) {ruangKelas.tambahMeja(mejaSiswa)}
    repeat(40) {ruangKelas.tambahKursi(kursiSiswa)}

    // Menampilkan daftar Meja dan Kursi
    ruangKelas.tampilkanDetailRuang()
    ruangKelas.tampilkanDaftarMeja()
    println()
    ruangKelas.tampilkanDaftarKursi()
}