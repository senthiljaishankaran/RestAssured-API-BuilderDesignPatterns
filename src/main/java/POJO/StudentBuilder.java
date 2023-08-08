package POJO;

public class StudentBuilder {
    private int id;
    private String name;
    private String mail;
    private StudentBuilder(){
        // No args constructor shielded with private modifier
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
    //Methods to add Clarity to the code
    public StudentBuilder and(){
        return this;
    }
    public StudentBuilder with(){
        return this;
    }
    public StudentBuilder build(){
        return this;
    }
    public Student perform(){
        return new Student(this.id,this.name,this.mail);
    }
}
