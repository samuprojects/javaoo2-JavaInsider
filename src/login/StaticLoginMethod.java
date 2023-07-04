package login;

@SuppressWarnings("ALL")
public class StaticLoginMethod implements LoginMethod {
    // codificação usada apenas para fins didáticos pois não se usa para o conceito de controle de acesso

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    private String username;
    private String password;

    public StaticLoginMethod(){
        this(USERNAME, PASSWORD);

    }

    public StaticLoginMethod(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(username) && password.equals(password);
    }
}
