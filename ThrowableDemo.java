package Demo;
class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class ThrowableDemo {
    private static String userName = "ML1020";
    private static String password = "19991020";
    public static void main(String[] args) {
        try {
            login("ML1020", "19980918");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError, PasswordError {
        if (!ThrowableDemo.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }if (!ThrowableDemo.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}
