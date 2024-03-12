package tp3;

public class exercice1 {
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.LinkedList;

	public class Main {
	    public static void main(String[] args) {
	        // Créer la collection (ArrayList) contenant les noms des huit facultés de l’USTHB
	        ArrayList<String> facultes = new ArrayList<>();
	        facultes.add("Informatique");
	        facultes.add("Mathématiques");
	        facultes.add("Génie Civil");
	        facultes.add("Physique");
	        facultes.add("Chimie");
	        facultes.add("Biologie");
	        facultes.add("Géologie");
	        facultes.add("Génie Mécanique");

	        // Afficher tous les éléments de la collection avec une boucle for each
	        System.out.println("Affichage avec boucle for each:");
	        for (String faculte : facultes) {
	            System.out.println(faculte);
	        }

	        // Afficher tous les éléments de la collection avec un itérateur
	        System.out.println("\nAffichage avec itérateur:");
	        Iterator<String> iterator = facultes.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Afficher la taille de la collection
	        System.out.println("\nTaille de la collection: " + facultes.size());

	        // Modifier le nom de la faculté Géologie en Sciences de la Terre
	        for (int i = 0; i < facultes.size(); i++) {
	            if (facultes.get(i).equals("Géologie")) {
	                facultes.set(i, "Sciences de la Terre");
	            }
	        }

	        // Afficher le nouveau nom de la faculté Géologie
	        System.out.println("\nNouveau nom de la faculté Géologie: " + facultes.get(facultes.indexOf("Sciences de la Terre")));

	        // Trier la collection
	        Collections.sort(facultes);

	        // Afficher la collection triée avec le même itérateur
	        System.out.println("\nCollection triée avec le même itérateur:");
	        iterator = facultes.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Transformer la collection en LinkedList
	        LinkedList<String> linkedListFacultes = new LinkedList<>(facultes);
	        System.out.println("\nCollection transformée en LinkedList: " + linkedListFacultes);
	    }
	}

}
