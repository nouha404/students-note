    import services.Notes;

    import java.util.Scanner;

    public class App {
        public static void main(String[] args) throws Exception {
            Scanner sc;
            sc = new Scanner(System.in);

            System.out.println("Entrer le nombre de note a ajouter : ");

            int nbNotes = sc.nextInt();
            Notes arrayNotes = new Notes(nbNotes);

            for (int i = 0; i < nbNotes; i++) {
                System.out.println("Saisir la note n°" + (i+1) + " :");
                int note = sc.nextInt();
                arrayNotes.ajouterNotes(note);
            }
            while (true) {
                System.out.println("1 - lister les notes d'un tableau\n" +
                        "2 - rechercher la note la plus grande et la noote la plus petite du tableau\n" +
                        "3 - trier le tableau par ordre croissant de ses notes\n" +
                        "4 - Supprimer une note a une position k du tableau\n" +
                        "5 - Transferer toute les valeur superieurs a la moyenne dans un notre tableau plus afficher ce tableau resultat\n"+
                        "6 - Quitter\n");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Voici les notes: ");
                        arrayNotes.listerNotesTableau();
                        continue;
                    case 2:
                        System.out.println("Voici les min et max: ");
                        arrayNotes.minAndMaxNote();
                        continue;
                    case 3:
                        System.out.println("Voici les notes trier par ordre croissant: ");
                        arrayNotes.trier();
                        continue;

                    case 4:
                        System.out.println("Choisir l'index a supprimer:  ");
                        int deleteIndex = sc.nextInt();
                        arrayNotes.supprimerValeur(deleteIndex);
                        arrayNotes.listerNotesTableau();
                        continue;

                    case 5:
                        // bon..
                        //System.out.println("Transfere des valeurs superieur a la moyenne : ");
                        //arrayNotes.transfererValeurSuperieurMoyenne();
                        break;

                    case 6:
                        System.out.println("Vous avez quitter ...");
                        break;
                }
                break;

            }

        }
    }