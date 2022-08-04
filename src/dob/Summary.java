package dob;

public class Summary {
    public Summary(String student_fio, String sex, int id_group, String name, String fio){
        this.student_fio = student_fio;
        this.sex = sex;
        this.id_group = id_group;
        this.name = name;
        this.fio = fio;
    }

    private String student_fio;
    private String sex;
    private int id_group;
    private String name;
    private String fio;

    public String getStudent_fio() {
        return student_fio;
    }

    public String getSex() {
        return sex;
    }

    public int getIdGroup() {
        return id_group;
    }

    public String getName() {
        return name;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return "Student fio = " + this.student_fio +
                ", sex = " + this.sex +
                ", group number = " + this.id_group +
                ", group name = " + this.name +
                ", curator name = " + this.fio + "\n" ;
    }
}
