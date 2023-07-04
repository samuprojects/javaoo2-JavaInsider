package login;

@SuppressWarnings("ALL")
public class SameCredentialsLoginMethod implements LoginMethod {

    // codificação usada apenas para fins didáticos pois não se usa para o conceito de controle de acesso

    @Override
    public boolean login(String username, String password) {
        return username.equals(password);
    }
}
