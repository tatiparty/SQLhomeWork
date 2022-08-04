package dob;

public class Student {
    public Student (String student_fio, String sex, int id_group){
        this.student_fio = student_fio;
        this.sex = sex;
        this.id_group = id_group;
    }

    private String student_fio;
    private String sex;
    private int id_group;

    public String getStudent_fio() {
        return student_fio;
    }

    public String getSex() {
        return sex;
    }

    public int getIdGroup() {
        return id_group;
    }

   /* @Override
            public String toString() {
        return "Student: {" +
                "fio='" + this.student_fio + '\'' +
                ", sex='" + this.sex + '\'' +
                ", id_group='" + this.id_group +
                '}' + "\n" ;
    }*/
}
