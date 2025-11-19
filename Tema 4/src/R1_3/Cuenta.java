package R1_3;

public class Cuenta {

    private double saldo;

    public int numReintegros, numIngresos;

    public Cuenta(double saldoinicial) throws MaquinaException{
        setSaldo(saldoinicial);


    }

    public void setSaldo(double saldo) throws MaquinaException {
        if (saldo < 0){

            System.out.println("Saldo no valido");


        }
        this.saldo=saldo;

    }

}
