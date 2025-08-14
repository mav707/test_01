package builderPattern;

public class User {
    private final int userId;
    private final String username;
    private final String email;

    public User(UserBuilder builder){
        this.userId = builder.userId;
        this.username = builder.username;
        this.email = builder.email;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static class UserBuilder{
        private int userId;
        private String username;
        private String email;

        public UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }

    }

}
