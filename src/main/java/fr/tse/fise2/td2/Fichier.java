package fr.tse.fise2.td2;

import javax.swing.*;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Fichier {

    private Path path;
    private File file;


    public Fichier(String _path) {
        try {
            path = Paths.get(_path);
            Files.createFile(path);
        } catch (IOException e) {
            System.out.println(e.toString() + e.hashCode());
        }

        file = new File(path.toString());

    }

    public void AfficherTout() {
        String line = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(path.toString()));
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Cannot read content of " + file.getAbsolutePath());
            e.printStackTrace();
        }

    }

    public List<String> LireTout() {
        String line;
        List<String> lines = new ArrayList<String>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(path.toString()));
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Cannot read content of " + file.getAbsolutePath());
            e.printStackTrace();
        }
        return lines;

    }

    public void DuplicateTextFile() {
        String copyName = "Copie de " + file.getName();
        String copyPath = path.getParent().toString() + "\\" + copyName;
        System.out.println(copyPath);
        Fichier copyFile = new Fichier(copyPath);

        List<String> contenu = this.LireTout();

        copyFile.Ecrire(contenu);

    }


    public void Ecrire(String toWrite) {
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println(toWrite);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    public void Ecrire(List<String> toWrite) {
        for (int i = 0; i < toWrite.size(); i++)
            this.Ecrire(toWrite.get(i));
    }
}
