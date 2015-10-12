package com.esprit.afficheur.core;

import com.esprit.afficheur.api.TXT;
import com.esprit.afficheur.formats.Afficheur;
import com.esprit.domain.Doccument;

public class ModuleAffichage {
	@TXT
	Afficheur afficheur;

	public void render(Doccument doccument) {
		afficheur.render(doccument);

	}

	public void setAfficheur(Afficheur afficheur) {
		this.afficheur = afficheur;
	}
}
