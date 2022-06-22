package fr.isika.cda18.projet1.lecture;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fr.isika.cda18.projet1.entites.Stagiaire;

public class FichierTxt {

	public static void main(String[] args) throws Exception {
		File stagiaireTxt = new File("CC:\\Users\\ravel\\OneDrive\\Documents\\CDA 18\\W7\\D3\\Docs\\STAGIAIRES.DON");
		try (Scanner objet = new Scanner(stagiaireTxt)) {
			while (objet.hasNextLine())
				System.out.println(objet.nextLine());
		}
	}
}
