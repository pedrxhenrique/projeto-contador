import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numeroUm = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numeroDois = scan.nextInt();

        scan.close();

        try {
            contar(numeroUm, numeroDois);
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int numeroUm, int numeroDois) throws Exception{
        if(numeroUm > numeroDois){
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = numeroDois - numeroUm;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Contagem dos numeros " + i);
        }
    }
}
