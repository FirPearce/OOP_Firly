package Model;

public class Mahasiswa {
    private String NRP, Nama, Alamat, NoHP;
    
    public Mahasiswa(){
    }

    public Mahasiswa(String NRP, String Nama, String Alamat, String NoHP) {
        this.NRP = NRP;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NoHP = NoHP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public String getNRP() {
        return NRP;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNoHP() {
        return NoHP;
    }
}
