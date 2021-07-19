package thread;

import org.junit.jupiter.api.Test;

class SalutTotoTest {

    @Test
    public void say() throws InterruptedException {
        SalutToto.saySalutToto(2);
    }

    @Test
    public void sayBis() {
        SalutTotoBis.saySalutToto(2);
    }

}
