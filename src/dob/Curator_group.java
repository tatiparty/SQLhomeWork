package dob;

public class Curator_group {
    public Curator_group(String name, int id_curator){
        this.name = name;
        this.id_curator = id_curator;
    }

    private String name;

    private int id_curator;

    public String getName() {
        return name;
    }

    public int getIdCurator() {
        return id_curator;
    }

    /*@Override
    public String toString() {
        return "Student: {" +
                "name='" + this.name + '\'' +
                "id_curator='" + this.id_curator + '\'' +
                '}' + "\n" ;
    }*/
}
