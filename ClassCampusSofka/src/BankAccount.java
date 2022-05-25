public class BankAccount {
    /**
     * Es el número de la cuenta
     */
    public int accountNumber;
    /**
     * Dato que indica si está activada
     */
    protected boolean actived;

    /**
     * Pregunta si la cuenta está activa
     * @return Retorna la respuesta con True o False
     */
    public boolean isActived() {
        return actived;
    }

    /**
     * Configura el estado de la cuenta
     * @param actived Asigna un estado True o False
     */
    public void setActived(boolean actived) {
        this.actived = actived;
    }
}
