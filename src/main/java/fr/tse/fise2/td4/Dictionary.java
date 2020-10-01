package fr.tse.fise2.td4;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

/**
 *
 * This class manages in memory a dictionary of English<->French terms. Using a
 * Map implementation, it binds a French word to its English counterpart.
 *
 * @author TheProfessors
 *
 */
public class Dictionary {


    private Map<String, String> content = new HashMap<>();


    public static void main(String[] args) {

        Dictionary dico = new Dictionary();

        String entreeClavier;
        while (true) {
            System.out.println("French-English Dictionary");
            System.out.println("1) Add a word to the dictionary");
            System.out.println("2) Display dictionary content");
            System.out.println("3) Lookup a word");
            System.out.println("4) Quit program");
            entreeClavier = litUneLigne();
            int choix = Integer.parseInt(entreeClavier);

            switch (choix) {
                case 1:
                    System.out.println("Entrez le mot en français");
                    String fr = litUneLigne();
                    System.out.println("Entrez la traduction en anglais");
                    String en = litUneLigne();

                    dico.ajouterMot(fr,en);


                    break;
                case 2:
                    System.out.println("Contenu du dictionnaire");

                    Iterator it = dico.getContent().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry m = (Map.Entry) it.next();
                        System.out.println("FR: "+m.getKey()+", EN: "+m.getValue());
                    }

                    break;
                case 3:
                    System.out.println("Entrez le mot recherché");
                    String recherche = litUneLigne();
                    System.out.println("Traduction : " + dico.getContent().get(recherche));

                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    /**
     *
     * @return une ligne entrée au clavier
     */
    public static String litUneLigne() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Erreur de lecture I/O, fermeture du programme");
            e.printStackTrace();
            System.exit(-1);
            return null;
        }
    }

    public Map<String, String> getContent() {
        return content;
    }


    public void ajouterMot(String fr, String en) {
        this.content.put(fr,en);
    }

}