
/**
 *
 * @author ainiii
 */
public class Cat extends Animal {
@Override
public void sound(){
    System.out.println("Meow");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound();
    }
    
}
