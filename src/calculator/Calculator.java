/*
TP0
Marine Meunier
Mathilde Dussert
groupe A
Programme calculatrice
29/09/2021
 */
package calculator;

import java.util.Scanner;

/**
 * @author Mathilde
 * @author Marine
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercice 2 :
        System.out.println("""
                           Please enter the operator:
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");
        // exercice 3 :
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le numéro de l'opérateur choisie :");
        int operateur=sc.nextInt();
        // exercice 7 :
        if((1>operateur)||(5<operateur)){
           System.out.println("L'operateur choisi n'est pas possible \nVeuillez retentez."); 
        }
        else {
            // exercice 4 :
            System.out.println("\n Entrer une première valeur :");
            double operande1=sc.nextDouble();
            // exercice 5 :
            System.out.println("\n Entrer une deuxième valeur :");
            double operande2=sc.nextDouble();
            // exercice 6 :
            double resultat = 0 ;
            if (1==operateur) {
              resultat = operande1 + operande2;
            }
            else if(2==operateur){
               resultat = operande1 - operande2; 
            }
            else if(3==operateur){
               resultat = operande1 * operande2; 
            }
            else if(4==operateur){
               resultat = operande1 / operande2; 
               
            }
            else if(5==operateur){
               resultat = operande1 % operande2; 
            
            }
            System.out.println("Le résultat est "+ resultat);
        }
        
        
    }
    
}
