package app.dtos;

public class UserDto {
    private String name;
    private String birthdate;

    public UserDto(String name, String birthdate) {
        this.setName(name);
        this.setBirthdate(birthdate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthdate() {
        return this.birthdate;
    }
}
