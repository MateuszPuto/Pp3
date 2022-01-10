
public class Person
{
    private String name;
    private String surname;
    
    public static void main(){
        Person p = new Person("anna", "may");
        System.out.println(p);
    }
    
    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    
    public String toString(){
        return this.name.toUpperCase().substring(0, 1) + this.surname.toUpperCase().substring(0, 1);
    }
}
