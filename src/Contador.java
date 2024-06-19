import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int paramentroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int paramentroDois = terminal.nextInt();

        try {
            contar(paramentroUm, paramentroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        terminal.close();
    }

    static void contar(int paramentroUm, int paramentroDois) throws ParametrosInvalidosException{
        if (paramentroUm > paramentroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = paramentroDois - paramentroUm;
    
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        }
    }
}
