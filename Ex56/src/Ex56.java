/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Faça um programa que fique em um laço solicitando a digitação de números inteiros e só pare de solicitar
    a digitação de novos números quando o usuário informar o número 0. Quando o número 0 for informado, o programa
    exibir a quantidade de números digitados, a quantidade de números pares, a quantidade de números ímpares e a
    média dos valores dos números digitados.
 */
import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0,qtdNum = 0,qtdPar = 0,qtdImpar = 0,soma = 0;
        double media = 0;
        while (true){
            System.out.println("Digite um numero inteiro qualquer ou 0 para sair");
            num = scanner.nextInt();
            if (num == 0){
                break;
            }
            soma += num;
            qtdNum++;
            if (num % 2 == 0){
                qtdPar++;
            }
            else {
                qtdImpar++;
            }

        }
        if (qtdNum > 0){
            media = (double) soma/qtdNum;
        }
        System.out.println("Quantidade de numeros digitados: " + qtdNum);
        System.out.println("Quantidade de numeros pares: " + qtdPar);
        System.out.println("Quantidade de numeros impares: " + qtdImpar);
        System.out.println("Media: " + media);

    }
}
