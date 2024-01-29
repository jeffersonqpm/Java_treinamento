package Programa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas notas serão inseridas?");
        int quantidade = scan.nextInt();

        while (quantidade < 2 || quantidade > 4) {

            System.out.println("Quantas notas serão inseridas?");
            quantidade = scan.nextInt();

        }
        Calculos calculos = new Calculos();

        if (quantidade == 2) {

            System.out.println("AV1");
            float av1 = scan.nextFloat();
            System.out.println("AV2");
            float av2 = scan.nextFloat();

            calculos.calcMedia((av1 + av2), quantidade);

            System.out.println("Média: " + calculos.getMedia());

        } else if (quantidade == 3) {

            System.out.println("AV1");
            float av1 = scan.nextFloat();
            System.out.println("AV2");
            float av2 = scan.nextFloat();
            System.out.println("AV3");
            float av3 = scan.nextFloat();

            calculos.calcMedia((av1 + av2 + av3), quantidade);

            System.out.println("Média: " + calculos.getMedia());

        } else if (quantidade == 4) {

            System.out.println("AV1");
            float av1 = scan.nextFloat();
            System.out.println("AV2");
            float av2 = scan.nextFloat();
            System.out.println("AV3");
            float av3 = scan.nextFloat();
            System.out.println("AV4");
            float av4 = scan.nextFloat();

            calculos.calcMedia((av1 + av2 + av3 + av4), quantidade);

            System.out.println("Média: " + calculos.getMedia());

        }

    }

}
