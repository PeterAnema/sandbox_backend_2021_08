public class Main {

    public static void main(String[] args) {

        Person p = new Person("Rober", "Amsterdam");

        p.addResult(new Result("Programmeren", 9));
        p.addResult(new Result("Programmeren", 9));
        p.addResult(new Result("Database", 8));
        p.addResult(new Result("Spring Boot", 10));

        p.tell();

    }

}
