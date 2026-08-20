package nomenclatura;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String nomeCliente;

    public ContaBancaria(double saldo, String nomeCliente, int numeroConta){
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
    }

    public void fazerSaque(double valor){
        if(temSaldo()== false){
            
           
        }
        else{
            if(valor <= saldo){
                saldo = saldo - valor;
            }
            
        }
    }
    public void fazerDeposito(double valor){
        saldo += valor;
    }
    public boolean temSaldo(){
        if(saldo > 0){
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    

}
