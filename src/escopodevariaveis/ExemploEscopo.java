package escopodevariaveis;

public class ExemploEscopo {

    private int numero = 10;

    public void mostrarNumero(){
        this.numero = 15;
        System.out.println(numero);
    }

    public void tentarAcessarLocal(){
        System.out.println(numero);
    }

}
