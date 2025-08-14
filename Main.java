package builderPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId(12)
                .setUsername("jack")
                .setEmail("abc@123.com")
                .build();
        System.out.println(user);
    }
}
