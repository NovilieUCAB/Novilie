package BBDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefonoTest {

    @Test
    void verifyTlf() {
        Telefono telefono = new Telefono();
        boolean result = telefono.verifyTlf("0414-8911462");
        assertEquals(true, result,"Número con formato correcto. Debería retornar true");
        boolean result2 = telefono.verifyTlf("04148911462");
        assertEquals(false, result2,"Número con formato incorrecto. Debería retornar false");
    }
}