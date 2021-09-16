public class Result {

    // atributes
    private String subject;
    private int grade;

    // constructor
    public Result(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    // getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
