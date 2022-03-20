package dependence1;
/**
 *
 * @author ainiii
 */
class mesin{
    public int status;
    public void Start(Mobil m){
        m.mesinHidup();
    }
    public void Nyala(){
        System.out.println("Mesin mobil menyala");
    }
    public void End(Mobil m){
        m.mesinMati();
    }
}
