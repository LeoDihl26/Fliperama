package com.mycompany.fliperama;

import java.util.Locale;
import java.util.Scanner;

/*Atributos / Características = oque ele possui/tem
Métodos / Comportamento = oque ele faz
Estado / Status = estado/característica ATUAL no momento que foi utilizado*/

public class Fliperama {

    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);
    Scanner STRING = new Scanner(System.in);
    Scanner INT = new Scanner(System.in);
    Scanner DOUBLE = new Scanner(System.in);
    Scanner BOOLEAN = new Scanner(System.in);
    
    double a = 2.99;
    
    System.out.print("ATENDENTE: Olá! Seja bem-vindo(a) ao Fliperama Neatherrealm! Temos as melhores máquinas Fliper da cidade!");
    System.out.print("\nATENDENTE: Qual jogo você irá querer jogar?");
    String jogoX1 = STRING.nextLine();
    System.out.print("ATENDENTE: Ótima escolha! Cada ficha custa $2.99! Por favor, me informe o n° de Fichas desejadas. ");
    int fichasX1 = INT.nextInt();
    System.out.print("ATENDENTE: Ok, tenha uma boa jogatina!");
    System.out.printf("\n'5 HORAS (e " +fichasX1+ " fichas) DEPOIS'\n");
    System.out.print("EU: Opa! Ahhhh muleke, quebrei! ");
    System.out.print("\nATENDENTE: Cert- Espera um pouco aí...qual foi sua pontuação?");
    int recordeX1 = INT.nextInt();
    System.out.print("\nATENDENTE: WOW! Essa é a maior pontuação registrada para esse jogo!");
    System.out.print("\nEU: Hmpf, não tem jeito, eu sou o melhor nesse jogo!");
    System.out.print("\nATENDENTE: Já que é o melhor no jogo, espero que seja o melhor em pagar também!");
    System.out.print("\nEU: Vish, aí danou-se.");
    System.out.printf("\nATENDENTE: Hmmmm, certinho, o total foi de R$%.2f", a * fichasX1);
            
    Fliper x1 = new Fliper();
    
    x1.jogo = jogoX1;
    x1.fichas = fichasX1;
    x1.recorde = recordeX1;
    x1.preco = fichasX1 * 2.99;
           
    boolean respostaDivertir = x1.perguntaDivertir();
        x1.divertir = respostaDivertir;
        x1.diversão();
        x1.estado();
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
