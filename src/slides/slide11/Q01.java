package slides.slide11;

import java.util.Locale;

public class Q01 {
    /*
    Faça um programa que em Java, que peça ao usuário para digitar uma string e imprima:
O número de caracteres da string.
A string com todas suas letras em maiúsculo e depois em minúsculo.
O número de vogais da string.
Se a string digitada começa com “Ins” (ignorando maiúsculas/minúsculas).
Se a string digitada termina com “ões” (ignorando maiúsculas/minúsculas).
     */
    public static void main(String[] args) {
        String nome = "Luiz Fernando";
        System.out.println("Nome: " + nome);
        System.out.println("A: " + nome.length());
        System.out.println("B: " + nome.toUpperCase());
        System.out.println("B: " + nome.toLowerCase());
        int qtdVogais = 0;
        for (int i = 0; i < nome.length(); i++) {
            char k = nome.charAt(i);
            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
                qtdVogais++;
            }
        }
        System.out.println("A QTD de vogais é: " + qtdVogais);

        System.out.println("D: " + nome.startsWith("Luiz1"));
        System.out.println("D: " + nome.endsWith("ando2"));
    }
}
