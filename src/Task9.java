public class Task9 {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person = " + person);
        Person.changePerson(person);
        System.out.println("person = " + person);
    }
}
