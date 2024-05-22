public class Task10 {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person = " + person);
        Person.changePersonTrue(person);
        System.out.println("person = " + person);
    }
}
