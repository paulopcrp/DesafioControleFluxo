package Contador;

import ParametrosInvalidosExceptions.ParametrosInvalidosExceptions;

public class Contador {
    public static void main(String[] args) {
        try {
            int parametro1 = Integer.parseInt(args[0]);
            int parametro2 = Integer.parseInt(args[1]);

            if (parametro1 > parametro2) {
                throw new ParametrosInvalidosExceptions("O segundo parâmetro deve ser maior que o primeiro");
            }

            int intervalo = parametro2 - parametro1;

            for (int i = 1; i <= intervalo; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira apenas números inteiros como parâmetros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Por favor, insira dois parâmetros.");
        }
    }
}
