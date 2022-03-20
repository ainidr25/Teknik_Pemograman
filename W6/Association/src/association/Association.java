package association;
/**
 *
 * @author ainiii
 */
class Person{
    String name;
    long id;
    Person(String name, long id){
    this.name = name;
    this.id = id;
}
}
class KTP extends Person{
    String namePerson;
    KTP(String name, long id){
        super(name,id);
        this.namePerson = name;
    }
}
public class Association {
    public static void main(String[] args) {
        KTP obj = new KTP("Aini", 25080378);
        System.out.println(obj.namePerson + " is a person with a id number : " + obj.id);
    }  
}
