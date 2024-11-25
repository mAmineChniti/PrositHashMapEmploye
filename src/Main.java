import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectation = new AffectationHashMap();
        Employe e1 = new Employe(1, "Alice");
        Employe e2 = new Employe(2, "Bob");
        Departement d1 = new Departement(1, "IT");
        Departement d2 = new Departement(2, "HR");

        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);

        System.out.println("Before Sorting:");
        affectation.afficherEmployesEtDepartements();

        TreeMap<Employe, Departement> sortedMap = affectation.trierMap();
        System.out.println("Sorted Map: " + sortedMap);

        affectation.ajouterEmployeDepartement(e1, d2);
        affectation.afficherEmployesEtDepartements();

        affectation.supprimerEmploye(e1);
        affectation.afficherEmployesEtDepartements();

        affectation.ajouterEmployeDepartement(e2, d1);
        affectation.supprimerEmployeEtDepartement(e2, d1);
        affectation.afficherEmployesEtDepartements();

        affectation.afficherEmployes();
        affectation.afficherDepartements();

        System.out.println("Employee e1 exists: " + affectation.rechercherEmploye(e1));
        System.out.println("Department d1 exists: " + affectation.rechercherDepartement(d1));
    }
}