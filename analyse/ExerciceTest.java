package test.java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import main.java.exercice.Exercice;
import java.util.*;

public class ExerciceTest {
    @Test
    public void testSolution() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), Exercice.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Exercice.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        // Chaine vide
        assertEquals(List.of(""), Exercice.solution("",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine donnée en exemple
       assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Exercice.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
     // Chaine non vide avec une liste vide
      assertEquals(List.of("Il", "fait", "beau", "aujourd'hui", "comme", "en", "aout"),Exercice.solution("Il fait beau aujourd'hui comme en aout", List.of()));
     // Chaine avec des lettres en double dans la liste
        assertEquals(List.of("666","the", "the", "number", "of", "beast"),Exercice.solution("666, the number of the beast", List.of('6', '6', 't', 'n', 'o', 'b')));
        // Chaine avec aucune lettre correspondante dans la liste
        assertEquals(List.of(), Exercice.solution("Il fait beau aujourd'hui", List.of('x', 'y', 'z')));
        // Chaine avec des lettres en casse mixte dans la liste
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"),Exercice.solution("Il fait beau aujourd'hui comme en aout", List.of('F', 'i', 'Z', 'U', 'K', 'A', 'B', 'o')));
    }
}