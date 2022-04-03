package exercise3;
/**
 *
 * @author ainiii
 */
public class EmployeeTest{ 
    public static void main (String[] args){ 
        int i;
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        System.out.println("Sebelum dilakukan sorting : ");
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
        System.out.println("\nSetelah dilakukan sorting : ");
        Sortable.shell_sort(staff);
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
    }
}
