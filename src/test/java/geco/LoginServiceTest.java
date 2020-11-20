package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class LoginServiceTest {

    @Test
    public void loginExistsTest() {
        String[] logins = {"lau","duf","truc"};
        LoginService s = new LoginService(logins);
        assertEquals("Erreur : login inexistant", true, s.loginExists("lau"));
    }

    @Test
    public void addLoginTest() {
        String[] logins = {"lau","duf","truc"};
        LoginService s = new LoginService(logins);
        s.addLogin("nouveau");
        assertEquals("Erreur : Pas ajouté", true, s.loginExists("nouveau"));
    }

    @Test
    public void findAllLoginsStartingWithTest() {
        String[] logins = {"lau","duf","duph","laura","laulau"};
        LoginService s = new LoginService(logins);
        String[] val  = {"lau","laurine","laura","laulau"};
        ArrayList<String> loginsPrefixes = new ArrayList<String>();
        loginsPrefixes.add("lau");
        loginsPrefixes.add("laulau");
        loginsPrefixes.add("laura");
        assertEquals("Erreur pas la bonne liste de prefixe",loginsPrefixes,s.findAllLoginsStartingWith("lau"));
    }


}
