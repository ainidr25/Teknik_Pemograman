package restaurant;
/**
 * @author ainiii
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        
        System.out.println("\nStok Setelah Dipesan");
        menu.amountOfStock("Bala-Bala", 5);
//        menu.amountOfStock("Bala-Bala");
//        menu.amountOfStock("Gehu");
//        menu.amountOfStock("Tahu");
//        menu.amountOfStock("Gehu");
//        menu.amountOfStock("Molen");
        menu.tampilMenuMakanan();
    }
}
