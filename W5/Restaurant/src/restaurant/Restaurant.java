package restaurant;
/**
 * @author ainiii
 */
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    // getter
    public String[] getNamaMakanan() {
        return nama_makanan;
    }
    
    public String getNamaMakanan(int id){
        return nama_makanan[id];
    }

    public double[] getHarga_makanan() {
        return harga_makanan;
    }
    
    public double getHarga_makanan(int id){
        return harga_makanan[id];
    }

    public int[] getStok() {
        return stok;
    }
    
    public int getStok(int id){
        return stok[id];
    }

    public static byte getId() {
        return id;
    }

    // setter
    public void setNama_makanan(String[] nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public void setHarga_makanan(double[] harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public void setStok(int[] stok) {
        this.stok = stok;
    }

    public static void setId(byte id) {
        Restaurant.id = id;
    }
    public void setStok(int stok, int id) {
        this.stok[id] = stok;
    }
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    // method
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    //public void order(String nama){
    //this.nama_makanan[id] = nama;
    //}
    
    public void amountOfStock(String nama_makanan, int banyak){
        // buat algo searching
        for(int i=0; i<=id; i++){
            if(nama_makanan == getNamaMakanan(i)){
                if(!isOutOfStock(i)){
                    setStok(getStok(i)-banyak, i);
                }
            }
        }   
//if(!isOutOfStock(id)){
//this.stok[id]--;
//}     
    }  
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(getNamaMakanan(i) + " ["+getStok(i)+ "] " + "\tRp."+getHarga_makanan(i));
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}

   


