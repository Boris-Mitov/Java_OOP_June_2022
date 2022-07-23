package solidLab;

public class Main {
    public static void main(String[] args) {
        String password = "my-password";

        PasswordHasher passwordHasher = new PasswordHasher();

        String hash = passwordHasher.hash(password);
        String dehash = passwordHasher.dehash("bXktcGFzc3dvcmQ=");

        System.out.println(hash);
        System.out.println(dehash);
    }
}
