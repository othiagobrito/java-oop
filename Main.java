import app.dtos.UserDto;

public class Main {
    public static void main(String[] args) {
        UserDto user = new UserDto(
            "Thiago Brito",
            "1998-01-06"
        );

        System.out.println(user.getName());
    }
}
