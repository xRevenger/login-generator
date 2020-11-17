package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    private LoginGenerator loginGenerator = new LoginGenerator(loginService);

    @Test
    public void generateLoginForNomAndPrenom() {
        assertEquals("Le login créé ne correspond pas.", "PDUR", loginGenerator.generateLoginForNomAndPrenom("DURAND","PAUL"));
    }

    @Test
    public void testJRAL2() {
        assertEquals("Le login créé ne correspond pas.", "JRAL2", loginGenerator.generateLoginForNomAndPrenom("RALLING","JOHN"));
    }
}