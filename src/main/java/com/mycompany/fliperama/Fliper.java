package com.mycompany.fliperama;

import java.util.Scanner;

public class Fliper {
  
String jogo;
int fichas;
int recorde;        
double preco;        
boolean divertir;    
    
    void estado(){
    System.out.println("\nRESUMO DO DIA NO FLIPERAMA:\n");
    System.out.print("\nJogo do Dia: " + this.jogo);
    System.out.print("\nVezes Jogadas / Fichas Compradas: " + this.fichas); 
    System.out.printf("\nRecorde Alcançado: " + this.recorde);
    System.out.printf("\nValor Pago: %.2f" , this.preco);
    System.out.print("\nO Objetivo do Jogador era só quebrar um recorde? " + (this.divertir ? "Sim" : "Não" ));
    
    }
    
    boolean perguntaDivertir(){
    Scanner STRING = new Scanner(System.in);
        System.out.println("\nATENDENTE: Bom, tudo certinho, mas me diga, você jogou por todo esse tempo, só pra quebrar um recorde? (Sim/Não)");
        String resposta = STRING.nextLine().toLowerCase();
        
        if(resposta.equals("Sim") || resposta.equals("sim")){
            return true;
        }else if (resposta.equals("Não") || resposta.equals("nao") || resposta.equals("Nao")){
            return false;
        }else{
            System.out.println("\nATENDENTE: Oi? Fala direito muleque, não entendi nada. ");
            return pergunta2();
        }
    }
    
    boolean pergunta2(){
    Scanner STRING = new Scanner(System.in);
        System.out.println("ATENDENTE: Era só pra quebrar o recorde? (Sim/Não)");
        String resposta2 = STRING.nextLine().toLowerCase();
        if(resposta2.equals("Sim") || resposta2.equals("sim")){
            return true;
        }else if(resposta2.equals("Não") || resposta2.equals("nao") || resposta2.equals("Nao")){
            return false;
        }else{
            System.out.println("\nATENDENTE: Oi? Fala direito muleque, não entendi nada. ");
            return pergunta2();
        }
    }
    
    
    void diversão() {
    if (this.divertir == true){
        System.out.println("ATENDENTE: VAI ARRUMAR ALGO PRA FAZER, MULEQUE! ");
    
    }else{
        System.out.println("ATENDENTE: Ah bom, assim sim.");
       }
    }
    
    
    
    
}
