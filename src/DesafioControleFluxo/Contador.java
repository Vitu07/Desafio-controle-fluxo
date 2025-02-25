package DesafioControleFluxo;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro parametro ");
        int primeiroParametro = sc.nextInt();
        System.out.println("Digite o valor do segundo parametro");
        int segundoParametro= sc.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        }catch (ParametrosInvalidosException e){
            System.out.println("O primeiro parametro tem que ser maior que o segundo!");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if (primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }else {
            int contagem = segundoParametro - primeiroParametro;
            for (int i = 1; i <= contagem; i++ ){
                System.out.println(i);
            }
        }

    }
}
