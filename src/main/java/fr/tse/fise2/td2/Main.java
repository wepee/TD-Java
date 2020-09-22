package fr.tse.fise2.td2;

public class Main {
    public static void main(String[] args) {
        System.out.println("debut du programme");
        Fichier monFichier = new Fichier("C:\\Users\\adam-\\iCloudDrive\\Adam\\Java\\fise2\\src\\main\\resources\\sandbox.txt");
        monFichier.AfficherTout();

        monFichier.DuplicateTextFile();

        Fichier maCopie = new Fichier("C:\\Users\\adam-\\iCloudDrive\\Adam\\Java\\fise2\\src\\main\\resources\\Copie de sandbox.txt");

        maCopie.Ecrire("a");

    }
}
