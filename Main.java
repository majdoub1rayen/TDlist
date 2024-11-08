import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
        public static void main(String[] args) {
            GestionUniversity gestion = new GestionUniversity();


            Etudiant e1 = new Etudiant(1, "rayen", "Ezzar");
            Etudiant e2 = new Etudiant(2, "Salah", "Sophie");
            Etudiant e3 = new Etudiant(3, "Adem", "olivier");

          
            gestion.ajouterEtudiant(e1);
            gestion.ajouterEtudiant(e2);
            gestion.ajouterEtudiant(e3);


            System.out.println("Liste des étudiants :");
            gestion.displayEtudiants();


            System.out.println("Recherche de l'étudiant e1 : " + gestion.rechercherEtudiant(e1));


            System.out.println("Recherche de l'étudiant par nom : " + gestion.rechercherEtudiant("rayen"));


            System.out.println("Liste après suppression de l'étudiant e2 :");
            gestion.displayEtudiants();


            gestion.trierEtudiantsParId();
            System.out.println("Liste triée par ID :");
            gestion.displayEtudiants();


            gestion.trierEtudiantsParNom();
            System.out.println("Liste triée par nom :");
            gestion.displayEtudiants();
        }}

