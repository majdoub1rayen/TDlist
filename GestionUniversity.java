import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class GestionUniversity implements University {
        private List<Etudiant> etudiants;

        public GestionUniversity() {
            this.etudiants = new ArrayList<>();
        }

        @Override
        public void ajouterEtudiant(Etudiant e) {
            etudiants.add(e);
        }

        @Override
        public boolean rechercherEtudiant(Etudiant e) {
            return etudiants.contains(e);
        }

        @Override
        public boolean rechercherEtudiant(String nom) {
            for (Etudiant etudiant : etudiants) {
                if (etudiant.getNom().equalsIgnoreCase(nom)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void supprimerEtudiant(Etudiant e) {
            etudiants.remove(e);
        }

        @Override
        public void displayEtudiants() {
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant);
            }
        }

        @Override
        public void trierEtudiantsParId() {
            etudiants.sort(Comparator.comparingInt(Etudiant::getId));
        }

        @Override
        public void trierEtudiantsParNom() {
            etudiants.sort(Comparator.comparing(Etudiant::getNom));
        }
    }

