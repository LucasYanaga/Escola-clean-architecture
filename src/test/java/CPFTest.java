import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {
    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("null"))  ;

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("123456789"));
    }

    @Test
    void deveriaCriarCPFComNumerosValidos(){
        String cpf1 = "115.264.719-90";
        CPF cpf = new CPF(cpf1);
        assertEquals(cpf1, cpf.getNumero());
    }
}
