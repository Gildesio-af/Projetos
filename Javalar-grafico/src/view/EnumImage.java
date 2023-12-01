package view;

public enum EnumImage {
	PYTHON(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\python.png", 50,45))),
	JS(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\js.png", 50,45))),
	RUBY(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\ruby.png", 50,45))),
	PHP(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\php.png", 50,45))),
	CSHARP(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\do-sustenido.png", 50,45))),
	CPLUSPLUS(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\C++.png", 50,45))),
	C(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\C.png", 50,45))),
	JAVA(new PanelImage(EditImage.createResizedImageLabel("src\\espaco\\images\\jav.jpeg", 60, 45)));
	
	private PanelImage panelImage;
	
	EnumImage(PanelImage panelImage) {
		this.panelImage = panelImage;
	}
	
	public PanelImage getPanelImage() {
		return panelImage;
	}
}
