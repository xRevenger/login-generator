package geco;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private String[] loginExistants = {"doe", "joe", "john", "toto"};
    private LoginService loginService = new LoginService(loginExistants);

    @Test
    public void loginExists() {
        LoginService loginService = new LoginService(loginExistants);
        assertTrue("Ce login n'existe pas.", loginService.loginExists("toto"));
    }

    @Test
    public void addLogin() {
        loginService.addLogin("kaaristote");
        ArrayList<String> listeAdd = new ArrayList<>(Arrays.asList(this.loginExistants));
        listeAdd.add("kaaristote");
        assertEquals("La liste renvoyée n'est pas celle attendue", listeAdd, loginService.findAllLogins());
    }

    @Test
    public void findAllLoginsStartingWith() {
        ArrayList<String> listeLogin = new ArrayList<>();
        listeLogin.add("joe");
        listeLogin.add("john");
        List<String> listeStarting = loginService.findAllLoginsStartingWith("j");
        assertEquals("Cette liste n'est pas composée de joe et john", listeLogin, listeStarting);
    }

    @Test
    public void findAllLogins() {
        assertEquals("La liste renvoyée n'est pas celle attendue", Arrays.asList(loginExistants), loginService.findAllLogins());
    }
}