class Mahasiswa {
    String nama;
    int umur;
    String hobi;

    // Constructor
    Mahasiswa(String nama, int umur, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Hobi" + hobi);
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Adam Gumilang", 19, "Ngoding");
        mhs.tampilkanInfo();
    }
}
