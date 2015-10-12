package com.esprit.afficheur.core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.esprit.afficheur.formats.Afficheur;
import com.esprit.domain.Doccument;

public class Initialiseur {

	public static void main(String[] args) {
		Doccument doccument = new Doccument();
		doccument.setTitle("java");
		doccument.setContent("helloWorld");
		Object o = null;
		try {
			Properties properties = new Properties();
			properties.load(new FileReader("config.properties"));
			Class clazz = Class.forName(properties
					.getProperty("afficheur_class"));
			o = clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ModuleAffichage moduleAffichage = new ModuleAffichage();
		moduleAffichage.setAfficheur((Afficheur) o);
		moduleAffichage.render(doccument);
	}
}
