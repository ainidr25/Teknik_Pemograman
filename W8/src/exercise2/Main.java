package exercise2;
/**
 *
 * @author ainiii
 */
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape("black", false);
        System.out.println(s1);
        
        Circle c1 = new Circle();
        System.out.println(c1);
        
        Rectangle r1 = new Rectangle(20, 30);
        System.out.println(r1);
        
        Square s2 = new Square(10, "yellow", false);
        System.out.println(s2);
        s2.setSide(20);
        System.out.println(s2);
    }
}
