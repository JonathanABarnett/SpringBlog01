package blog.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @Size(min=2, max=30, message = "User name should be more than 2 and less than 30 characters.")
    private String username;

    @NotNull(message = "Please enter something")
    @Size(min=1, max=50, message = "You must enter a password.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
