public class ContaBanco {
    
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;


    public String toString() {

        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponivel para saque", nomeCliente, agencia, numero, saldo);
        /*return "Olá " + nomeCliente 
        + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo R$" + saldo
        + " já está disponivel para saque.";*/
    }

}