package starter.SauceDemoV4;

public enum User {
    STANDARD_USER("standard_user", "secret_sauce", "a standard user", "123"),
    LOCKED_OUT_USER("locked_out_user", "secret_sauce", "a locked out user", "456"),
    PROBLEM_USER("problem_user", "secret_sauce", "a problem user", "789"),
    PERFORMANCE_GLITCH_USER("performance_glitch_user", "secret_sauce", "a performance glitch user", "000");

    private final String username;
    private final String password;
    private final String description;
    private final String postalCode;

    User(String username, String password, String description, String postalCode) {
        this.username = username;
        this.password = password;
        this.description = description;
        this.postalCode = postalCode;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
