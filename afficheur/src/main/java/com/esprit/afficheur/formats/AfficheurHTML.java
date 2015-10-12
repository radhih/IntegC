package com.esprit.afficheur.formats;

import com.esprit.domain.Doccument;

public class AfficheurHTML implements Afficheur{

	@Override
	public void render(Doccument doccument)
	{
		System.out.println("<html>"
				+ "<head>"	+ "</head>"
				+ "<title>"+doccument.getTitle()+"</title>"
				+"<body>"+doccument.getContent()+"</body>"
			
				+ "</html>");
	}
}
