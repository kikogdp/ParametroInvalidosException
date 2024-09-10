import java.util.Scanner;

import projetoDio.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro parametro");
        int parametroUM = sc.nextInt();

        System.out.println("digite o segundo parametro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUM, parametroDois);
            
        } catch ( ParametrosInvalidosException e) {
            System.out.println("Segundo parametro deve ser maior que o primeiro");



    }
}

    public static void contar(int parametroUm, int parametroDois) 
    throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

            
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i<= contagem; i++){
                System.out.println("numero "+ i);
            }

        }

    }


}
