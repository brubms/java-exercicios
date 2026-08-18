package exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Classificador classi = new Classificador();

        System.out.println("Digite o valor:");
        double valor = scan.nextDouble();

        System.out.println(classi.classificarPreco(valor));
        
        
    }

}
