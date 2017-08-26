package cuenta;

/**
 *
 * @author Bryan Lopez Avila
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaDeAhorros ca = new CuentaDeAhorros(200000, 4);
        ca.interes();
        System.out.println("------------------------------------------------------");
        CuentaDeAhorros ca2 = new CuentaDeAhorros(300000, 5);
        ca2.interes();
    }
    
}
