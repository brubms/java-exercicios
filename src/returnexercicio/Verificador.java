package returnexercicio;

public class Verificador {

    public String verificarNumero(int numero){
        if(numero > 0)
            return "Positivo";
        if(numero < 0 )
            return "Negativo";
        if(numero == 0)
            return "Zero";
        return "";
    }

}
