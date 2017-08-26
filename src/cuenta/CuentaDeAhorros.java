package cuenta;

/**
 *
 * @author Bryan Lopez Avila
 */
public class CuentaDeAhorros {
    private float saldo;
    private float interes;

    public CuentaDeAhorros(float saldo, float interes) {
        this.saldo = saldo;
        this.interes = interes;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }
    
    public void retirar(float cantidad){
        if(cantidad <= this.saldo){
            this.setSaldo(this.saldo - cantidad);
        }else {
            System.out.println("Error la cantidad de dinero a retirar es mayor a la cantidad disponible en su cuenta");
        }
    }
    
    public void depositar(float cantidad){
        this.setSaldo(this.saldo + cantidad);
    }
    
    public void interes(){
        float resultado = 0;
        for (int i = 1; i < 13; i++) {
            resultado = this.saldo + (this.saldo * ((this.interes / 100) * i));
            System.out.println("El saldo del mes " + i + " es: " + resultado);
        }
    }
}
