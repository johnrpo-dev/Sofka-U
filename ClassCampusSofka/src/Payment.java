/**
 * Clase Payment que determina el modo de pago
 */
public class Payment {
    /**
     * Objeto Cash que solo determina la cantidad a pagar
     */
    private Cash cash;
    /**
     * Objeto Card que adicionalmente al monto, gestiona un nombre y el número de la tarjeta
     */
    private Card card;
    /**
     * Se refiere a las plataformas digitales como Nequi o Daviplata
     */
    private DigitalPlatform digitalPlatform;
    /**
     * Valor del monto a pagar
     */
    private int value;

    /**
     * Método que efectua el pago
     * @param payMethod determina cual es el medio de pago
     * @param value determina el monto
     */
    public void pay(Object payMethod, int value){
        this.value = value;
    }
}
