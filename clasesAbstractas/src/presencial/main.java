package presencial;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        ImpresoraEpson impresoraEpson = new ImpresoraEpson("ABCD", "usb", new Date(2004, 9, 24), 50, 1.0);

        System.out.println(impresoraEpson.imprimir());
    }
}
