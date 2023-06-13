package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("2110010432", "Muhammad Zaini Abdurrahman", "Teknik Informatika");

        String detailMahasiswa = getDetailMahasiswa(mahasiswa);

        System.out.println(detailMahasiswa);
    }

    public static String getDetailMahasiswa(Mahasiswa mahasiswa) {
        String detail = "NPM: " + mahasiswa.getNpm()
                + "\nNama: " + mahasiswa.getNama()
                + "\nProgram Studi: " + mahasiswa.getProdi();
        return detail;
    }
}
