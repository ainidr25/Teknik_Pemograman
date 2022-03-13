package kasus1;
/**
 * @author ainiii
 */
public class Barang {
String kode_barang;
String nama_barang;
int stok;
public Barang(String kode, String nama, int stk) {
kode_barang = kode;
nama_barang = nama;
stok = stk;
}
    //setter
    public void setKode(String kode){
        this.kode_barang = kode;
    }
    public void setNama(String nama){
        this.nama_barang = nama;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    
    //getter
    public String getKode(){
        return this.kode_barang;
    }
    public String getNama(){
        return this.nama_barang;
    }
    public int getStok(){
        return this.stok;
    }
    
    //add stok
    void addStok(int stok){
        this.stok += stok;
    }
}
