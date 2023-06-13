package universitas;


public class Mahasiswa {
    private String npm;
    private String nama;
    private String prodi;

    // Constructor
    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter methods
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }
       
}
