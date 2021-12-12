package accessmodifier.student;

public class Student {
    private String name = "john";
    private String classes = "CO2";

    public  Student() {
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}


