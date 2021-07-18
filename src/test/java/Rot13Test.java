import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rot13Test {

    @Test
    public void transformHelloWorld() {
        assertEquals("HELLO WORLD", Rot13.transformToRot13("URYYB JBEYQ"));
    }

    @Test
    public void transformOpenClassRooms() {
        assertEquals("OPENCLASSROOMS", Rot13.transformToRot13("BCRAPYNFFEBBZF"));
    }

    @Test
    public void transformCeciEstMonCodeSecret() {
        assertEquals("CECI EST MON CODE SECRET", Rot13.transformToRot13("PRPV RFG ZBA PBQR FRPERG"));
    }
}
