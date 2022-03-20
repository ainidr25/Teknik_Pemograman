package aggregation;
import java.util.*;
// employee class
class Employee
{
String name;
int id ;
String officerName;// nama petugas/atasan
Employee(String name, int id, String officerName)
{ 
this.name = name;
this.id = id;
this.officerName = officerName;
}
}
class Officer
{
String name;
private List< Employee> employees;
Officer (String name, List<Employee> employees)
{
this.name = name;
this.employees = employees;
}
public List<Employee> getemployees()
{
return employees;
}
}

class Company
{
String cName;
private List<Officer> officers;
Company (String cName, List<Officer> officer)
{
this.cName = cName;
this.officers = officer;
}
//menghitung total pegawai
public int getTotalEmployeesInCompany()
{
int noOfEmployees = 0;
List<Employee> employees;
for(Officer officerName : officers)
{
employees = officerName.getemployees();
for(Employee e : employees)
{
noOfEmployees++;
}
}
return noOfEmployees;
}
}
// main method
public class Aggregation{
public static void main (String[] args)
{
Employee e1 = new Employee("Aini Diah ", 1, "Levi ");
Employee e2 = new Employee("M.Daffa ", 2, "Jasmine ");
Employee e3 = new Employee("Novia ", 3, "Levi ");
Employee e4 = new Employee("Syifa ", 4, "Edelweis ");

//list levi
List <Employee> Levi_employee = new ArrayList<Employee>();
Levi_employee.add (e1);
Levi_employee.add (e2);

//list jasmine
List <Employee> Jasmine_employee = new ArrayList<Employee>();
Jasmine_employee.add (e3);
Jasmine_employee.add (e4);
Officer o1= new Officer ("Levi", Levi_employee);
Officer o2 = new Officer ("Jasmine", Jasmine_employee);
List <Officer > officers = new ArrayList<Officer>();
officers.add(o2);
officers.add(o1);

Company company= new Company("ABC", officers);
System.out.println("Total employees in company: "+company.getTotalEmployeesInCompany());
}
}