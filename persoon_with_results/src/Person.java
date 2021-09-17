import java.util.ArrayList;
import java.util.List;

public class Person {

    // attributen
    private String name;
    private String residence;
    private List<Result> results = new ArrayList<>();
    private List<Auto> autos = new ArrayList<>();

    // constructor
    public Person(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    // extra methods

    public void tell() {
        System.out.println("Ik ben " + name + " en ik woon in " + residense);
        System.out.println("Dit zijn mijn cijfers:");
        for (Result result: results) {
            System.out.println(result.getSubject() + ": " + result.getGrade());
        }
    }

    public void move(String newResidence) {
        residense = newResidence;
    }

    public void addResult(Result result) {
        results.add(result);
    }

    public void addAuto(Auto auto) {
        autos.add(auto);
    }

}
