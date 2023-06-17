package main.java.exercice;
import java.util.*;

public class Main {
    
	public static void main(String[] args) {
		 long tempsDebut = System.currentTimeMillis();
        String texte = "exemple de texte a classer";
        List<Character> ordre = List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        System.out.println(Exercice.solution(texte,ordre));
        long tempsFin = System.currentTimeMillis();
        long tempsExecution = tempsFin - tempsDebut;
        System.out.println("Le code a pris " + tempsExecution + " millisecondes pour s'exécuter.");
        // output: [classer, texte, exemple, a, de]
    }
}
