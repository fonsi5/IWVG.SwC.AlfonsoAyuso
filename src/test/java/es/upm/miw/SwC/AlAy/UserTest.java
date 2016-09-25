package es.upm.miw.SwC.AlAy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User Usu;
    
    @Before
    public void before(){
        Usu = new User(1,"Juan","Lopez");
    }

    @Test
    public void testUser() {
        Usu = new User(5,"alfonso","aYUSO");
        assertEquals("Alfonso",Usu.getName());
        assertEquals("Ayuso",Usu.getFamilyName());
        assertEquals(5,Usu.getNumber());               
    }

    @Test
    public void testGetNumber() {
        assertEquals(1,Usu.getNumber());     
    }

    @Test
    public void testGetName() {
        assertEquals("Juan",Usu.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Lopez",Usu.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Juan Lopez",Usu.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J.",Usu.initials());
    }

}
