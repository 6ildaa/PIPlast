package main;

public class SecretStudent {
    private String name = "secret name";
    private String lastName = "secret last name";
    private int id = 123;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(""))
            return;
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }


}
