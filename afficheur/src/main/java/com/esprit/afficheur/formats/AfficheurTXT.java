package com.esprit.afficheur.formats;

import com.esprit.domain.Doccument;

public class AfficheurTXT implements Afficheur {

	@Override
	public void render(Doccument doccument)
	{
		System.out.println("**"+doccument.getTitle()+"***");
		System.out.println("content:\n"+doccument.getContent()+"\n");

	}

}
