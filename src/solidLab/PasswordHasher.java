package solidLab;

import java.util.Base64;

public class PasswordHasher {

    public String hash(String password) {

        return new String(Base64.getEncoder().encode(password.getBytes()));

    }

    public String dehash(String hashedPassword) {
        return new String(Base64.getDecoder().decode(hashedPassword.getBytes()));
    }
}
