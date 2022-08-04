package dob;

public class GroupWithCurator {
    public GroupWithCurator(String name, String fio){
        this.name = name;
        this.fio = fio;
    }

    private String name;

    private String fio;

    public String getName() {
        return name;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return "Group name = " + this.name +
                ", curator fio = " + this.fio + "\n" ;
    }
}
