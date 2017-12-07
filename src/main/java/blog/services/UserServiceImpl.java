package blog.services;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean authenticate(String username, String password) {
            String u = "user";
            String p = "pass";
        return Objects.equals(username, u) && Objects.equals(password, p);
    }
}
